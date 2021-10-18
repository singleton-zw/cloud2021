package org.zw.cloud.lb;


import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * TODO
 * @author singleton-zw
 * @date 2021/10/16 21:55
 */
@Component
public class MyLb implements LoadBalancer{

    /**
     * 自定义轮询
     */
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement(){
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = current >= Integer.MAX_VALUE ? 0 : current +1;
        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("mmmm次数mmm"+next);
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();

        return serviceInstances.get(index);
    }
}
