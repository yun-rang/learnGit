package com.example.demo.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @TableName dish_flavor
 */
@Data
public class DishFlavor implements Serializable {
    private Long id;

    private Long dishId;

    private String name;

    private String value;

    private static final long serialVersionUID = 1L;
}