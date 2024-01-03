package top.tangyh.lamp.job.service;


import top.tangyh.basic.base.service.SuperService;
import top.tangyh.lamp.job.entity.MinuteFlow;

import java.util.Date;
import java.util.List;

public interface MinuteFlowService extends SuperService<MinuteFlow> {
    List<MinuteFlow> queryByMonth(Date time);

}
