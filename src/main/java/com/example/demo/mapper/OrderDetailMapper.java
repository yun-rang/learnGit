package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

/**
* @author yun
* @description 针对表【order_detail(订单明细表)】的数据库操作Mapper
* @createDate 2024-08-22 17:39:57
* @Entity com.example.demo.entity.OrderDetail
*/
@Mapper

public interface OrderDetailMapper extends BaseMapper<OrderDetail> {

}




