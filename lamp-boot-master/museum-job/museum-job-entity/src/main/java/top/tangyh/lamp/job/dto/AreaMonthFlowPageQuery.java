package top.tangyh.lamp.job.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

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
@ApiModel(value = "AreaMonthFlowPageQuery", description = "区域月流量")
public class AreaMonthFlowPageQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 区域id
     */
    @ApiModelProperty(value = "区域id")
    private Integer areaId;
    /**
     * 格式为 YYYY-MM
     */
    @ApiModelProperty(value = "格式为 YYYY-MM")
    private LocalDate monthYear;
    /**
     * 月总人数	
     */
    @ApiModelProperty(value = "月总人数	")
    private Integer personCount;

}
