package com.gongchao.springcloud.dao;

import com.gongchao.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author gongchao
 * @date 12:37 2018/12/2
 */
@Mapper
public interface DeptDao {
    @Select("select * from dept where id = #{id}")
    Dept getById(Integer id);
    @Select("select * from dept")
    List<Dept> getAll();
}
