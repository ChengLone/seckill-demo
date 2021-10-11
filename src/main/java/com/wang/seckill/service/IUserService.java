package com.wang.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.seckill.pojo.User;
import com.wang.seckill.vo.LoginVo;
import com.wang.seckill.vo.RespBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ChengLone
 * @since 2021-10-10
 */
public interface IUserService extends IService<User> {

    /**
     * 登录
     *
     * @param loginVo
     * @return
     */
    RespBean doLogin(LoginVo loginVo);
}
