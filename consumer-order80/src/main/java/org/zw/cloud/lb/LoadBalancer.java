package org.zw.cloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author singleton-zw
 * @version 1.0.0
 * @Description TODO
 * @createTime ${date} ${time}
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
