package com.example.demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @TableName setmeal_dish
 */
@Data
public class SetmealDish implements Serializable {
    private Long id;

    private Long setmealId;

    private Long dishId;

    private String name;

    private BigDecimal price;

    private Integer copies;

    private static final long serialVersionUID = 1L;
}