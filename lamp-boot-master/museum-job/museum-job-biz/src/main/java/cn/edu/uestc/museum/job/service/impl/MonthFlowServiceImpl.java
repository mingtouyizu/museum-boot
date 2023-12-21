package cn.edu.uestc.museum.job.service.impl;

import cn.edu.uestc.museum.job.entity.MonthFlow;
import cn.edu.uestc.museum.job.dao.MonthFlowMapper;
import cn.edu.uestc.museum.job.service.MonthFlowService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.tangyh.basic.base.service.SuperServiceImpl;

@Service
@Slf4j
@Transactional(readOnly = true)
public class MonthFlowServiceImpl extends SuperServiceImpl<MonthFlowMapper, MonthFlow> implements MonthFlowService {
}
