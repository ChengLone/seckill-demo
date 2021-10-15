package com.wang.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.seckill.pojo.Order;
import com.wang.seckill.pojo.User;
import com.wang.seckill.vo.GoodsVo;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author ChengLone
 * @since 2021-10-14
 */
public interface IOrderService extends IService<Order> {

    Order secKill(User user, GoodsVo goods);
}
