package top.tangyh.lamp.job.service.impl;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.tangyh.basic.base.service.SuperServiceImpl;
import top.tangyh.lamp.job.dao.MonthFlowMapper;
import top.tangyh.lamp.job.entity.MonthFlow;
import top.tangyh.lamp.job.service.MonthFlowService;

@Service
@Slf4j
@Transactional(readOnly = true)
public class MonthFlowServiceImpl extends SuperServiceImpl<MonthFlowMapper, MonthFlow> implements MonthFlowService {
}
