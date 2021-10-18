package org.zw.cloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacos83 {

    public static void main(String[] args) {
        SpringApplication.run(OrderNacos83.class, args);
    }

}
