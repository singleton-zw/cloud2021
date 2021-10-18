package org.zw.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * TODO
 * @author singleton-zw
 * @date 2021/10/16 14:58
 */
@Configuration
public class AppLicationContextConfig {

    @Bean
   // @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
