package com.gongchao.myrule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @author gongchao
 * @date 10:06 2018/12/11
 */
@Configuration
public class MySelfRule   {

    @Bean
    public IRule MyRule(){
        return new DIYRule();
    }


}
