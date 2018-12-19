package com.gongchao.springcloud.service;

import com.gongchao.springcloud.entities.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author gongchao
 * @date 14:10 2018/12/11
 */
@Repository
@FeignClient(value="MICROSERVICE-DEPT")
public interface DeptService {
    @GetMapping("/dept/getAll")
     List<Dept> getAll();

    @GetMapping("/dept/{id}")
     Dept getById(@PathVariable("id")Integer id);

}
