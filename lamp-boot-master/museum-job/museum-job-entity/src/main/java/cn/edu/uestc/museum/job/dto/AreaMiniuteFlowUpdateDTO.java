package cn.edu.uestc.museum.job.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;
import top.tangyh.basic.base.entity.SuperEntity;

import javax.validation.constraints.NotNull;
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
@ApiModel(value = "AreaMiniuteFlowUpdateDTO", description = "区域流量统计表")
public class AreaMiniuteFlowUpdateDTO implements Serializable {

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
