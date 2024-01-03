package top.tangyh.lamp.job.service;

import top.tangyh.basic.base.service.SuperService;
import top.tangyh.lamp.job.entity.AreaMiniuteFlow;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 业务接口
 * 区域流量统计表
 * </p>
 *
 * @author zyh
 * @date 2023-09-17
 */
public interface AreaMiniuteFlowService extends SuperService<AreaMiniuteFlow> {

    List<AreaMiniuteFlow> queryByMonth(Date time);
}
