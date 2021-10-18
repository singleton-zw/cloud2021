package org.zw.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.zw.cloud.entity.Pay;
import org.zw.cloud.entity.Relst;
import org.zw.cloud.utils.Comzw;

/**
 * @author singleton-zw
 * @version 1.0.0
 * @Description TODO
 * @createTime ${date} ${time}
 */
@Component
@FeignClient(value = Comzw.payment)
public interface PaymentFeignService {

    @GetMapping(value = "/pay/get/{id}")
    public Relst<Pay> get(@PathVariable("id") Long id);
}
