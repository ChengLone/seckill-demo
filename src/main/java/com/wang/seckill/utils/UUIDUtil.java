package com.wang.seckill.utils;

import java.util.UUID;

/**
 * uuid工具类
 */
public class UUIDUtil {

    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
