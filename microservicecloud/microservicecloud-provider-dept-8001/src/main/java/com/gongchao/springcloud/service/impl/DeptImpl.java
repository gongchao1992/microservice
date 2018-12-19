package com.gongchao.springcloud.service.impl;

import com.gongchao.springcloud.dao.DeptDao;
import com.gongchao.springcloud.entities.Dept;
import com.gongchao.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gongchao
 * @date 12:43 2018/12/2
 */
@Service
public class DeptImpl implements DeptService {
    @Autowired
    DeptDao deptDao;
    @Override
    public Dept getById(Integer id) {
        return deptDao.getById(id);
    }

    @Override
    public List<Dept> getAll() {
        return deptDao.getAll();
    }
}
