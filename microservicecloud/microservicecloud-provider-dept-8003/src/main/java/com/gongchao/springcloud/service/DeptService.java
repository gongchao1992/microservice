package com.gongchao.springcloud.service;

import com.gongchao.springcloud.entities.Dept;

import java.util.List;

/**
 * @author gongchao
 * @date 12:42 2018/12/2
 */
public interface DeptService {

    Dept getById(Integer id);
    List<Dept> getAll();
}
