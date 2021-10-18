package org.zw.cloud.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.zw.cloud.entity.Pay;
import org.zw.cloud.entity.Relst;
import org.zw.cloud.service.PaymentFeignService;

import javax.annotation.Resource;


/**
 * TODO
 * @author singleton-zw
 * @date 2021/10/16 14:57
 */
@RestController
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/pay/get/{id}",produces = { "application/json;charset=UTF-8" })
    public Relst<Pay> get(@PathVariable("id") Long id){
        return paymentFeignService.get(id);
    }

}
