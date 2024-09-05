package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.DTO.DishPageObject;
import com.example.demo.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author yun
* @description 针对表【dish(菜品)】的数据库操作Mapper
* @createDate 2024-08-22 17:39:57
* @Entity com.example.demo.entity.Dish
*/
@Mapper

public interface DishMapper extends BaseMapper<Dish> {
    List<Dish> selectPage(DishPageObject dpo);
    int count();
}




