package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
* @author yun
* @description 针对表【orders(订单表)】的数据库操作Mapper
* @createDate 2024-08-22 17:39:57
* @Entity com.example.demo.entity.Orders
*/
@Mapper

public interface OrdersMapper extends BaseMapper<Orders> {

}




