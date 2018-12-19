package com.gongchao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.gongchao.springcolud"})
@ComponentScan("com.gongchao.springcolud")
@EnableCircuitBreaker
public class Consumer_Feign_App
{
    public static void main( String[] args )
    {
        SpringApplication.run(Consumer_Feign_App.class,args);
    }
}
