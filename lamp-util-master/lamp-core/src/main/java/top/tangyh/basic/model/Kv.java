package top.tangyh.basic.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 键值对 通用对象
 *
 * @author tangyh
 * @version v3.3.0
 * @date 2021/7/16 12:52 下午
 * @create [2021/7/16 12:52 下午 ] [tangyh] [初始创建]
 */
@Data
@Accessors(chain = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Kv implements Serializable {
    private String key;
    private String value;
}
