package cn.edu.uestc.museum.job.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

import static top.tangyh.basic.utils.DateUtils.DEFAULT_DATE_TIME_FORMAT;

/**
 * <p>
 * 实体类
 * 区域流量统计表
 * </p>
 *
 * @author zyh
 * @since 2023-09-17
 */
@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper =false)
@Accessors(chain = true)
@TableName("mus_area_miniute_flow")
@ApiModel(value = "AreaMiniuteFlow", description = "区域流量统计表")
@AllArgsConstructor
public class AreaMiniuteFlow implements Serializable {


    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    /**
     * 区域id
     */
    @ApiModelProperty(value = "区域id")
    @TableField(value = "area_id")
    @Excel(name = "区域id")
    private Integer areaId;

    /**
     * 1分钟刻度时间，按分钟存储自然时间 格式为 'YYYY-MM-DD HH:MM:00'	
     */
    @ApiModelProperty(value = "1分钟刻度时间，按分钟存储自然时间 格式为 'YYYY-MM-DD HH:MM:00'	")
    @TableField(value = "collect_time")
    @Excel(name = "1分钟刻度时间，按分钟存储自然时间 格式为 'YYYY-MM-DD HH:MM:00'	", format = DEFAULT_DATE_TIME_FORMAT, width = 20)
    private LocalDateTime collectTime;

    /**
     * 区域当前总人数	
     */
    @ApiModelProperty(value = "区域当前总人数	")
    @TableField(value = "person_count")
    @Excel(name = "区域当前总人数	")
    private Integer personCount;

    /**
     * 本1分钟进入的总人数	
     */
    @ApiModelProperty(value = "本1分钟进入的总人数	")
    @TableField(value = "person_in_count")
    @Excel(name = "本1分钟进入的总人数	")
    private Integer personInCount;

    /**
     * 本1分钟出去的总人数	
     */
    @ApiModelProperty(value = "本1分钟出去的总人数	")
    @TableField(value = "person_out_cout")
    @Excel(name = "本1分钟出去的总人数	")
    private Integer personOutCout;



}
