package cn.edu.uestc.museum.job.service.impl;

import cn.edu.uestc.museum.job.entity.MinuteFlow;
import cn.edu.uestc.museum.job.dao.MinuteFlowMapper;
import cn.edu.uestc.museum.job.service.MinuteFlowService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.tangyh.basic.base.service.SuperServiceImpl;

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
