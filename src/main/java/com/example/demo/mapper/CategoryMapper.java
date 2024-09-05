package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.AddressBook;
import com.example.demo.entity.Category;
import org.apache.ibatis.annotations.Mapper;

/**
* @author yun
* @description 针对表【category(菜品及套餐分类)】的数据库操作Mapper
* @createDate 2024-08-22 17:39:57
* @Entity com.example.demo.entity.Category
*/
@Mapper

public interface CategoryMapper extends BaseMapper<Category> {

}




