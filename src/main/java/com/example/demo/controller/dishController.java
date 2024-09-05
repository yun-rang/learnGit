package com.example.demo.controller;


import com.example.demo.commons.Result;
import com.example.demo.entity.Dish;
import com.example.demo.mapper.DishMapper;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Api("管理员")
@Schema(description = "员工接口")
@RestController
@RequestMapping("/admin")
public class dishController {


    @Autowired
    private DishMapper dishMapper;

    /**
     * 查询dish数据
     * @return
     */
    /**
     * 普通查询
     * @return
     */
    @Schema(description = "查看菜名")
    @GetMapping("/dish")
    public Result<List<Dish>> getDish() {
        Result<List<Dish>> result = new Result<>();
        return result.success(dishMapper.selectList(null));
    }

    /**
     *
     * 分页查询菜名
     * @return
     */
    @Schema(description = "查看菜名")
    @GetMapping("/selectDishPages")
    public Result<List<Dish>> getDishPages(){
        Result<List<Dish>> result = new Result<>();
        return result;
    }




}
