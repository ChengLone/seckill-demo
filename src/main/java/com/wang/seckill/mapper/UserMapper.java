package com.wang.seckill.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wang.seckill.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ChengLone
 * @since 2021-10-10
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
