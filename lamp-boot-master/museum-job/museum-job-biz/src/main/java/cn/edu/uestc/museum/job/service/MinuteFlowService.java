package cn.edu.uestc.museum.job.service;

import cn.edu.uestc.museum.job.entity.MinuteFlow;
import top.tangyh.basic.base.service.SuperService;

import java.util.Date;
import java.util.List;

public interface MinuteFlowService extends SuperService<MinuteFlow> {
    List<MinuteFlow> queryByMonth(Date time);

}
