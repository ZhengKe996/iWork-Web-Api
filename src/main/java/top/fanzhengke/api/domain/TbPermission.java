package top.fanzhengke.api.domain;


import java.io.Serializable;

import lombok.Data;

/**
 * @TableName tb_permission
 */
@Data
public class TbPermission implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 权限
     */
    private String permissionName;

    /**
     * 模块ID
     */
    private Integer moduleId;

    /**
     * 行为ID
     */
    private Integer actionId;

}