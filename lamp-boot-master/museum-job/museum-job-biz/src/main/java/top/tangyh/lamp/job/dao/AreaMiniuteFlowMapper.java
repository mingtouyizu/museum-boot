package top.tangyh.lamp.job.dao;



import org.springframework.stereotype.Repository;
import top.tangyh.basic.base.mapper.SuperMapper;
import top.tangyh.lamp.job.entity.AreaMiniuteFlow;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * Mapper 接口
 * 区域流量统计表
 * </p>
 *
 * @author zyh
 * @date 2023-09-17
 */
@Repository
public interface AreaMiniuteFlowMapper extends SuperMapper<AreaMiniuteFlow> {

    List<AreaMiniuteFlow> queryByMonth(Date time);
}
