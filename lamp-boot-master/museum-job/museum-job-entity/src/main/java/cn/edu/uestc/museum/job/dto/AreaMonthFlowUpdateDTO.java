package cn.edu.uestc.museum.job.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;
import top.tangyh.basic.base.entity.SuperEntity;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

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
@AllArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@Builder
@ApiModel(value = "AreaMonthFlowUpdateDTO", description = "区域月流量")
public class AreaMonthFlowUpdateDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @NotNull(message = "请填写主键", groups = SuperEntity.Update.class)
    private Long id;

    /**
     * 区域id
     */
    @ApiModelProperty(value = "区域id")
    private Integer areaId;
    /**
     * 格式为 YYYY-MM
     */
    @ApiModelProperty(value = "格式为 YYYY-MM")
    @NotNull(message = "请填写格式为 YYYY-MM")
    private LocalDate monthYear;
    /**
     * 月总人数	
     */
    @ApiModelProperty(value = "月总人数	")
    @NotNull(message = "请填写月总人数	")
    private Integer personCount;
}
