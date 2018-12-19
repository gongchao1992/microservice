package com.gongchao.springcloud.controller;

import com.gongchao.springcloud.entities.Dept;
import com.gongchao.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author gongchao
 * @date 12:44 2018/12/2
 */
@RestController
public class DeptController {
    @Autowired
    DeptService deptService;
    //服务发现
    @Autowired
    DiscoveryClient client;
    @GetMapping("/dept/getAll")
    public List<Dept> getAll(){
        return deptService.getAll();
    }
    @GetMapping("/dept/getServices")
    public Object getServices(){
        return client.getServices();
    }
    @GetMapping("/dept/{id}")
    public Dept getById(@PathVariable("id") Integer id){
        return deptService.getById(id);
    }
}
