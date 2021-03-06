package com.gongchao.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author gongchao
 * @date 13:32 2018/12/2
 */
@Configuration
public class ConfigBeans {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate() ;
    }

/*    @Bean
    public IRule getMyRule(){
        return  new RandomRule();
        }*/

}
