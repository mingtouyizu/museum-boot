package top.tangyh.lamp.job.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@TableName("mus_month_flow")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class MonthFlow implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id",type = IdType.AUTO)
    protected Long id;

    @TableField(value = "month_year")
    protected Date monthYear;

    @TableField(value = "person_count")
    protected Integer personCount;


}
