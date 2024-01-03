package top.tangyh.lamp.job.executor;




import cn.hutool.core.date.DateUtil;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.tangyh.lamp.job.entity.AreaMiniuteFlow;
import top.tangyh.lamp.job.entity.AreaMonthFlow;
import top.tangyh.lamp.job.entity.MinuteFlow;
import top.tangyh.lamp.job.entity.MonthFlow;
import top.tangyh.lamp.job.service.AreaMiniuteFlowService;
import top.tangyh.lamp.job.service.AreaMonthFlowService;
import top.tangyh.lamp.job.service.MinuteFlowService;
import top.tangyh.lamp.job.service.MonthFlowService;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@Component
public class TimePloymerizationXxlJob {

    @Autowired
    MonthFlowService monthFlowService;

    @Autowired
    MinuteFlowService minuteFlowService;

    @Autowired
    AreaMiniuteFlowService areaMiniuteFlowService;

    @Autowired
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
