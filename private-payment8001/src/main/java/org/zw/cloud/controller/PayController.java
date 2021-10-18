package org.zw.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.zw.cloud.entity.Pay;
import org.zw.cloud.entity.Relst;
import org.zw.cloud.service.PayService;

import javax.annotation.Resource;

/**
 * TODO
 * @author singleton-zw
 * @date 2021/10/16 14:33
 */
@RestController
@Slf4j
public class PayController {
    @Resource
    private PayService payService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/pay/save")
    public Relst save(@RequestBody Pay pay){
        int save = payService.save(pay);
        if(save>0){
            return new Relst(200,"插入成功"+serverPort,save);
        }
        return new Relst(400,"插入失败",save);
    }

    @GetMapping(value = "/pay/get/{id}",produces = { "application/json;charset=UTF-8" })
    public Relst get(@PathVariable("id") Long id){
        Pay pay = payService.get(id);
        if(pay!=null){
            return new Relst(200,"查询成功"+serverPort,pay);
        }
        return new Relst(400,"查询失败",null);
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }

}
