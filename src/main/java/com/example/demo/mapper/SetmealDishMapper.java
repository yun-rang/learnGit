package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.SetmealDish;
import org.apache.ibatis.annotations.Mapper;

/**
* @author yun
* @description 针对表【setmeal_dish(套餐菜品关系)】的数据库操作Mapper
* @createDate 2024-08-22 17:39:57
* @Entity com.example.demo.entity.SetmealDish
*/
@Mapper

public interface SetmealDishMapper extends BaseMapper<SetmealDish> {

}




