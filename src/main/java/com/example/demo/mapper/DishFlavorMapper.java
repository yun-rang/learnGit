package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;

/**
* @author yun
* @description 针对表【dish_flavor(菜品口味关系表)】的数据库操作Mapper
* @createDate 2024-08-22 17:39:57
* @Entity com.example.demo.entity.DishFlavor
*/
@Mapper

public interface DishFlavorMapper extends BaseMapper<DishFlavor> {

}




