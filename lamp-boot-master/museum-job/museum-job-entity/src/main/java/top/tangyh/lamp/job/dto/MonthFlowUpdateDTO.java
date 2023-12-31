package top.tangyh.lamp.job.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDate;

@ApiModel(value = "MonthFlowUpdateDTO")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class MonthFlowUpdateDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id",type = IdType.AUTO)
    protected Long id;

    @TableField(value = "month_year")
    protected LocalDate monthYear;

    @TableField(value = "person_count")
    protected Integer personCount;


}
