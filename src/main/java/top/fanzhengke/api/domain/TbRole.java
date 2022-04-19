package top.fanzhengke.api.domain;


import java.io.Serializable;

import lombok.Data;

/**
 * 角色表
 *
 * @TableName tb_role
 */
@Data
public class TbRole implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 权限集合
     */
    private Object permissions;

}