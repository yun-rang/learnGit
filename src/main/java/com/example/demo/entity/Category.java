package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName category
 */
@Data
public class Category implements Serializable {
    private Long id;

    private Integer type;

    private String name;

    private Integer sort;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private Long createUser;

    private Long updateUser;

    private static final long serialVersionUID = 1L;
}