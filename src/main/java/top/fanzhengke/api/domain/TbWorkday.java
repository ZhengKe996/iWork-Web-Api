package top.fanzhengke.api.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * @TableName tb_workday
 */
@Data
public class TbWorkday implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 日期
     */
    private Date date;
}