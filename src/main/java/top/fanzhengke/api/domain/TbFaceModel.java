package top.fanzhengke.api.domain;



import java.io.Serializable;

import lombok.Data;

/**
 * @TableName tb_face_model
 */
@Data
public class TbFaceModel implements Serializable {
    /**
     * 主键值
     */
    private Integer id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 用户人脸模型
     */
    private String faceModel;

}