package cn.edu.uestc.museum.job.dao;


import cn.edu.uestc.museum.job.entity.MinuteFlow;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.tangyh.basic.base.mapper.SuperMapper;

import java.util.Date;
import java.util.List;

@Repository
public interface MinuteFlowMapper extends SuperMapper<MinuteFlow> {

    List<MinuteFlow> queryByMonth(@Param(value = "time") Date time);
}
