package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.ShoppingCart;
import org.apache.ibatis.annotations.Mapper;

/**
* @author yun
* @description 针对表【shopping_cart(购物车)】的数据库操作Mapper
* @createDate 2024-08-22 17:39:57
* @Entity com.example.demo.entity.ShoppingCart
*/
@Mapper

public interface ShoppingCartMapper extends BaseMapper<ShoppingCart> {

}




