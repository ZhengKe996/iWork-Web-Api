package top.fanzhengke.api.db.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

/**
 * 罚金类型表
 *
 * @TableName tb_amect_type
 */
@Data
public class TbAmectType implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 类别
     */
    private String type;

    /**
     * 罚金
     */
    private BigDecimal money;

    /**
     * 是否为系统内置
     */
    private Integer systemic;

}