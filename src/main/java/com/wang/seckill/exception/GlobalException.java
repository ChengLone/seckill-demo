package com.wang.seckill.exception;


import com.wang.seckill.vo.RespBeanEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * 全局异常
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GlobalException extends RuntimeException{
    private RespBeanEnum respBeanEnum;

//    public GlobalException(RespBeanEnum respBeanEnum){
//        this.respBeanEnum = respBeanEnum;
//    }
//
//    public ResBeanEnum getResBeanEnum() {
//        return resBeanEnum;
//    }
//
//    public void setResBeanEnum(ResBeanEnum resBeanEnum) {
//        this.resBeanEnum = resBeanEnum;
//    }
//
}
