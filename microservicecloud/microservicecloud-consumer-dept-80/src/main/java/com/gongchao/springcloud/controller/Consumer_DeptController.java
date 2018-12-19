package com.gongchao.springcloud.controller;

import com.gongchao.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author gongchao
 * @date 14:26 2018/12/2
 */
@RestController
public class Consumer_DeptController {
    @Autowired
    RestTemplate restTemplate;
    //单机版
    // private  static  final  String PREFIX="http://localhost:8001";
    //集群版用服应spring.application.name用名称
    private  static  final  String PREFIX="http://MICROSERVICE-DEPT";

    @GetMapping("/consumer/dept/getAll")
    public List<Dept> getAll(){
        return restTemplate.getForObject(PREFIX+"/dept/getAll",List.class);
    }

    @GetMapping("/consumer/dept/{id}")
    public Dept getById(@PathVariable("id")Integer id){
        return restTemplate.getForObject(PREFIX+"/dept/"+id,Dept.class);
    }
}
