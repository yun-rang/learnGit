package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.AddressBook;
import org.apache.ibatis.annotations.Mapper;

/**
* @author yun
* @description 针对表【address_book(地址簿)】的数据库操作Mapper
* @createDate 2024-08-22 17:39:57
* @Entity com.example.demo.entity.AddressBook
*/
@Mapper

public interface AddressBookMapper extends BaseMapper<AddressBook> {

}




