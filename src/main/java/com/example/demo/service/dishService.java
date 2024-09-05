package com.example.demo.service;

import com.example.demo.commons.results.PageResult;
import com.example.demo.entity.DTO.DishPageObject;
import com.example.demo.entity.Dish;

import java.util.List;

public interface dishService {
    PageResult<Dish> getDishPage(DishPageObject dpo);
}
