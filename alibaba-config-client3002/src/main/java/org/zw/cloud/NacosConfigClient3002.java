package org.zw.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClient3002{

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClient3002.class, args);
    }

}
