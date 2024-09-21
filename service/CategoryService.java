package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.entity.Category;

/*
 * 此操作Mybatis-plus提供，并且可以自己扩展操作
 * */
public interface CategoryService extends IService<Category> {

    //根据ID删除分类
    public void remove(Long id);
}