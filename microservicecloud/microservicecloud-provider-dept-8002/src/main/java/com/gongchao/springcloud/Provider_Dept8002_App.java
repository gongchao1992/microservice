package com.gongchao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class Provider_Dept8002_App
{
    public static void main( String[] args )
    {

        SpringApplication.run(Provider_Dept8002_App.class,args);
    }
}
