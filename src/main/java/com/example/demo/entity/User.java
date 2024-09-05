package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName user
 */
@Data
public class User implements Serializable {
    private Long id;

    private String openid;

    private String name;

    private String phone;

    private String sex;

    private String idNumber;

    private String avatar;

    private Date createTime;

    private static final long serialVersionUID = 1L;
}