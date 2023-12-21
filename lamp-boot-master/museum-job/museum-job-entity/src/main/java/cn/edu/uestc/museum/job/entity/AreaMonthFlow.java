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

import org.jetbrains.annotations.NotNull;
import java.io.Serializable;
import java.util.Date;

import static top.tangyh.basic.utils.DateUtils.DEFAULT_DATE_TIME_FORMAT;

/**
 * <p>
 * 实体类
 * 区域月流量
 * </p>
 *
 * @author zyh
 * @since 2023-09-17
 */
@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("mus_area_month_flow")
@ApiModel(value = "AreaMonthFlow", description = "区域月流量")
@AllArgsConstructor
public class AreaMonthFlow implements Serializable {


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
     * 格式为 YYYY-MM
     */
    @ApiModelProperty(value = "格式为 YYYY-MM")
    @TableField(value = "month_year")
    @Excel(name = "格式为 YYYY-MM", format = DEFAULT_DATE_TIME_FORMAT, width = 20)
    private Date monthYear;

    /**
     * 月总人数	
     */
    @ApiModelProperty(value = "月总人数	")
    @TableField(value = "person_count")
    @Excel(name = "月总人数	")
    private Integer personCount;




}
