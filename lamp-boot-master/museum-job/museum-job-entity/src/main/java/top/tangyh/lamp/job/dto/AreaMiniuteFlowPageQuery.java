package top.tangyh.lamp.job.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

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
@AllArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@Builder
@ApiModel(value = "AreaMiniuteFlowPageQuery", description = "区域流量统计表")
public class AreaMiniuteFlowPageQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 区域id
     */
    @ApiModelProperty(value = "区域id")
    private Integer areaId;
    /**
     * 1分钟刻度时间，按分钟存储自然时间 格式为 'YYYY-MM-DD HH:MM:00'	
     */
    @ApiModelProperty(value = "1分钟刻度时间，按分钟存储自然时间 格式为 'YYYY-MM-DD HH:MM:00'	")
    private LocalDateTime collectTime;
    /**
     * 区域当前总人数	
     */
    @ApiModelProperty(value = "区域当前总人数	")
    private Integer personCount;
    /**
     * 本1分钟进入的总人数	
     */
    @ApiModelProperty(value = "本1分钟进入的总人数	")
    private Integer personInCount;
    /**
     * 本1分钟出去的总人数	
     */
    @ApiModelProperty(value = "本1分钟出去的总人数	")
    private Integer personOutCout;

}
