package org.zw.cloud.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.zw.cloud.entity.Pay;

/**
 * @author singleton-zw
 * @version 1.0.0
 * @Description TODO
 * @createTime ${date} ${time}
 */
public interface PayService {
    public int save(Pay pay);
    public Pay get( Long id);
}
