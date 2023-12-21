package cn.edu.uestc.museum.job.service.impl;


import cn.edu.uestc.museum.job.entity.AreaMiniuteFlow;
import cn.edu.uestc.museum.job.dao.AreaMiniuteFlowMapper;
import cn.edu.uestc.museum.job.service.AreaMiniuteFlowService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import top.tangyh.basic.base.service.SuperServiceImpl;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 业务实现类
 * 区域流量统计表
 * </p>
 *
 * @author zyh
 * @date 2023-09-17
 */
@Slf4j
@Service
public class AreaMiniuteFlowServiceImpl extends SuperServiceImpl<AreaMiniuteFlowMapper, AreaMiniuteFlow> implements AreaMiniuteFlowService {
    @Override
    public List<AreaMiniuteFlow> queryByMonth(Date time) {
        return baseMapper.queryByMonth(time);
    }
}
