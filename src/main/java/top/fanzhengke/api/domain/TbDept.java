package top.fanzhengke.api.domain;

import java.io.Serializable;

import lombok.Data;

/**
 * @TableName tb_dept
 */
@Data
public class TbDept implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 部门名称
     */
    private String deptName;

}