package com.wang.seckill.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wang.seckill.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author ChengLone
 * @since 2021-10-14
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}
