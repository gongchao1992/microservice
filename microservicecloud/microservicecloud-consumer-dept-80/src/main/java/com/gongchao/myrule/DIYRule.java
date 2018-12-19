package com.gongchao.myrule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * @author gongchao
 * @date 10:39 2018/12/11
 */
public class DIYRule extends AbstractLoadBalancerRule {
    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    @Override
    public Server choose(Object o) {
        ILoadBalancer lb = getLoadBalancer();
        List<Server> reachableServers = lb.getReachableServers();
        return reachableServers.get(reachableServers.size()-2);
    }
}
