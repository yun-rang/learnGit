package com.example.demo.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.commons.results.PageResult;
import com.example.demo.entity.DTO.DishPageObject;
import com.example.demo.entity.Dish;
import com.example.demo.mapper.DishMapper;
import com.example.demo.service.dishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class dishServiceImpl implements dishService {

    @Autowired
    private DishMapper dishMapper;
    @Override
    public PageResult<Dish> getDishPage(DishPageObject dpo) {
//        QueryWrapper<Dish> wrapper = new QueryWrapper<>();
//        wrapper.isNotNull("id");
        int total = Math.toIntExact(dishMapper.count());
        if(total == 0){
            return new PageResult<Dish>(dpo.getCurrentPage(),dpo.getPageSize(),total,new ArrayList<>());
        }
        //若记录不为零，查询结果集
        List<Dish> list = dishMapper.selectPage(dpo);
        return new  PageResult<Dish>(dpo.getCurrentPage(),dpo.getPageSize(),total,list);
    }
}
