package top.fanzhengke.api.domain;

import java.io.Serializable;

import lombok.Data;

/**
 * 模块资源表
 *
 * @TableName tb_module
 */
@Data
public class TbModule implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 模块编号
     */
    private String moduleCode;

    /**
     * 模块名称
     */
    private String moduleName;

}