package org.zw.cloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.zw.cloud.entity.Pay;

/**
 * @author singleton-zw
 * @version 1.0.0
 * @Description TODO
 * @createTime ${date} ${time}
 */
@Mapper
public interface PayDao {
    public int save(Pay pay);
    public Pay get(@Param("id") Long id);
}
