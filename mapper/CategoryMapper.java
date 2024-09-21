package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.itheima.reggie.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestMapping;

@Mapper
@RequestMapping("/category")
public interface CategoryMapper extends BaseMapper<Category> {


}

