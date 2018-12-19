package com.gongchao.springcloud.cfgbeans;

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
    public RestTemplate getRestTemplate(){
        return new RestTemplate() ;
    }

/*    @Bean
    public IRule getMyRule(){
        return  new RandomRule();
        }*/

}
