package top.fanzhengke.api.domain;

import java.io.Serializable;

import lombok.Data;

/**
 * 行为表
 *
 * @TableName tb_action
 */
@Data
public class TbAction implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 行为编号
     */
    private String actionCode;

    /**
     * 行为名称
     */
    private String actionName;

}