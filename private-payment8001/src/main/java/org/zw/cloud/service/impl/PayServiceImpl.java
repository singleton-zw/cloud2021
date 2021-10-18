package org.zw.cloud.service.impl;
import org.springframework.stereotype.Service;
import org.zw.cloud.dao.PayDao;
import org.zw.cloud.entity.Pay;
import org.zw.cloud.service.PayService;

import javax.annotation.Resource;

/**
 * TODO
 * @author singleton-zw
 * @date 2021/10/16 14:29
 */
@Service
public class PayServiceImpl implements PayService {

    @Resource
    private PayDao payDao;
    @Override
    public int save(Pay pay) {
        return payDao.save(pay);
    }

    @Override
    public Pay get(Long id) {
        return payDao.get(id);
    }
}
