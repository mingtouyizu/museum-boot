package cn.edu.uestc.museum.job.dto.common;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

@ApiModel(value = "MinuteFlowUpdateDTO")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class MinuteFlowUpdateDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    @TableField(value = "collect_time")
    private LocalDateTime collectTime;

    @TableField(value = "person_count")
    private Integer personCount;

    @TableField(value = "person_in_count")
    private Integer personInCount;

    @TableField(value = "person_out_count")
    private Integer personOutCount;
}
