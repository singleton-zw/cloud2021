package org.zw.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.zw.cloud.entity.Pay;
import org.zw.cloud.entity.Relst;
import org.zw.cloud.lb.LoadBalancer;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

/**
 * TODO
 * @author singleton-zw
 * @date 2021/10/16 14:57
 */
@RestController
@Slf4j
public class OrderController {

    private static final String CLOUD_URL = "http://PROVIDE-PAYMENT";
    @Resource
    private RestTemplate restTemplate;

    @Resource
    private LoadBalancer loadBalancer;

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/consumer/pay/save",produces = { "application/json;charset=UTF-8" })
    public Relst<Pay> save(Pay pay){
        return restTemplate.postForObject(CLOUD_URL+"/pay/save",pay,Relst.class);
    }

    @GetMapping(value = "/consumer/pay/get/{id}",produces = { "application/json;charset=UTF-8" })
    public Relst<Pay> get(@PathVariable("id") Long id){
        return restTemplate.getForObject(CLOUD_URL+"/pay/get/"+id,Relst.class);
    }

    @GetMapping(value = "/consumer/payment/lb")
    public String getPaymentLB(){
        List<ServiceInstance> instances = discoveryClient.getInstances("PROVIDE-PAYMENT");
        if(instances == null || instances.size() <=0){
            return  null;
        }

        ServiceInstance serviceInstance = loadBalancer.instances(instances);
        URI uri = serviceInstance.getUri();
        return restTemplate.getForObject(uri+"/payment/lb",String.class);
    }
}
