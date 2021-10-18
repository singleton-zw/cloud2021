package org.zw.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * TODO
 * @author singleton-zw
 * @date 2021/10/16 21:29
 */
@Configuration
public class MySelfRule {

    /**
     * 自定义轮询策略
     * @return
     */
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }

}
