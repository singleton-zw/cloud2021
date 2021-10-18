package org.zw.cloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO
 * @author singleton-zw
 * @date 2021/10/16 14:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Relst<T> {

    private Integer code;
    private String messg;
    private T data;

    public Relst(Integer code ,String messg){
        this(code,messg,null);
    }
}
