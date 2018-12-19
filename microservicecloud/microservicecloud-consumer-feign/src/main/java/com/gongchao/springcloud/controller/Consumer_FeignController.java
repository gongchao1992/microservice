package com.gongchao.springcloud.controller;

import com.gongchao.springcloud.entities.Dept;
import com.gongchao.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author gongchao
 * @date 14:26 2018/12/2
 */
@RestController
public class Consumer_FeignController {
    @Autowired
    DeptService deptService;

    @GetMapping("/consumer/dept/getAll")
    public List<Dept> getAll(){
        return deptService.getAll();
    }

    @GetMapping("/consumer/dept/{id}")
    public Dept getById(@PathVariable("id")Integer id){
        return deptService.getById(id);
    }
}
