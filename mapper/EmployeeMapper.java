package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
/*
 * 此操作Mybatis-plus提供
 * */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}