package cn.edu.uestc.museum.job.executor;



import cn.edu.uestc.museum.job.entity.AreaMiniuteFlow;
import cn.edu.uestc.museum.job.entity.AreaMonthFlow;
import cn.edu.uestc.museum.job.entity.MinuteFlow;
import cn.edu.uestc.museum.job.entity.MonthFlow;
import cn.edu.uestc.museum.job.service.AreaMiniuteFlowService;
import cn.edu.uestc.museum.job.service.AreaMonthFlowService;
import cn.edu.uestc.museum.job.service.MinuteFlowService;
import cn.edu.uestc.museum.job.service.MonthFlowService;
import cn.hutool.core.date.DateUtil;
import com.xxl.job.core.handler.annotation.XxlJob;
import groovy.util.logging.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@Component
public class TimePloymerizationXxlJob {

    @Resource
    private MonthFlowService monthFlowService;

    @Resource
    private MinuteFlowService minuteFlowService;

    @Resource
    AreaMiniuteFlowService areaMiniuteFlowService;

    @Resource
    AreaMonthFlowService areaMonthFlowService;
    private static Logger logger = LoggerFactory.getLogger(TimePloymerizationXxlJob.class);



    @XxlJob("mergeTime")
    public void mergeTime() throws Exception {
        Date time = DateUtil.date().toSqlDate();
        List<MinuteFlow> minuteFlowList = minuteFlowService.queryByMonth(time);
        if(minuteFlowList!=null){
            Integer maxDayPerson = minuteFlowList.stream().mapToInt(MinuteFlow::getPersonInCount).sum();
            monthFlowService.saveOrUpdate(new MonthFlow(0L,time,maxDayPerson));
        }
    }

    @XxlJob("mergeAreaTime")
    public void mergeAreaTime() throws Exception {

        Date time = DateUtil.date().toSqlDate();
        List<AreaMiniuteFlow> areaMiniuteFlowList = areaMiniuteFlowService.queryByMonth(time);


        if(areaMiniuteFlowList!=null){
            Map<Integer,List<AreaMiniuteFlow>> areaMinuteMap =areaMiniuteFlowList.stream().collect(Collectors.groupingBy(AreaMiniuteFlow::getAreaId));
            for(Map.Entry<Integer,List<AreaMiniuteFlow>> entry:areaMinuteMap.entrySet()) {
                Integer areaID = entry.getKey();
                List<AreaMiniuteFlow> classifyAreaMiniuteFlowList = entry.getValue();
                if(classifyAreaMiniuteFlowList!=null) {
                    Integer maxDayPerson = classifyAreaMiniuteFlowList.stream().mapToInt(AreaMiniuteFlow::getPersonInCount).sum();
                    areaMonthFlowService.saveOrUpdate(new AreaMonthFlow(0L, areaID, time, maxDayPerson));
                }
            }
        }
    }
}
