package com.gongchao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka7001_App
{
    public static void main( String[] args )
    {
        SpringApplication.run(Eureka7001_App.class,args);
    }
}
