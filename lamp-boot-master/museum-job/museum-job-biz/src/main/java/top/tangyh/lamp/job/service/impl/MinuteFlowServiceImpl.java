package top.tangyh.lamp.job.service.impl;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.tangyh.basic.base.service.SuperServiceImpl;
import top.tangyh.lamp.job.dao.MinuteFlowMapper;
import top.tangyh.lamp.job.entity.MinuteFlow;
import top.tangyh.lamp.job.service.MinuteFlowService;

import java.util.Date;
import java.util.List;

@Service
@Slf4j
@Transactional(readOnly = true)
public class MinuteFlowServiceImpl extends SuperServiceImpl<MinuteFlowMapper, MinuteFlow> implements MinuteFlowService {

    @Override
    public List<MinuteFlow> queryByMonth(Date time) {
        return baseMapper.queryByMonth(time);
    }
}
