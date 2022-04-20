package top.fanzhengke.api.db.domain;

import java.io.Serializable;

import lombok.Data;

/**
 * 疫情城市列表
 *
 * @TableName tb_city
 */
@Data
public class TbCity implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 城市名称
     */
    private String city;

    /**
     * 拼音简称
     */
    private String code;

}