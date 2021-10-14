package com.wang.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.seckill.pojo.Goods;
import com.wang.seckill.vo.GoodsVo;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author ChengLone
 * @since 2021-10-14
 */
public interface IGoodsService extends IService<Goods> {

    /**
     * 获取商品列表
     *
     * @return
     */
    List<GoodsVo> findGoodsVo();
}
