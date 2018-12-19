package com.gongchao.springcloud;

import com.gongchao.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="MICROSERVICE-DEPT",configuration = MySelfRule.class)
public class Consumer_Dept80_App
{
    public static void main( String[] args )

    {
        SpringApplication.run(Consumer_Dept80_App.class,args);
    }
}
