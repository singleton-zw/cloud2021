package org.zw.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * TODO
 * @author singleton-zw
 * @date 2021/10/16 14:41
 */
@SpringBootApplication
@EnableEurekaClient
public class PayMain {
    public static void main(String[] args) {
        SpringApplication.run(PayMain.class, args);
    }
}
