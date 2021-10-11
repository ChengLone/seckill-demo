package com.wang.seckill.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wang.seckill.exception.GlobalException;
import com.wang.seckill.mapper.UserMapper;
import com.wang.seckill.pojo.User;
import com.wang.seckill.service.IUserService;
import com.wang.seckill.utils.MD5Utils;
import com.wang.seckill.utils.ValidatorUtil;
import com.wang.seckill.vo.LoginVo;
import com.wang.seckill.vo.RespBean;
import com.wang.seckill.vo.RespBeanEnum;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ChengLone
 * @since 2021-10-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 登录
     *
     * @param loginVo
     * @return
     */
    @Override
    public RespBean doLogin(LoginVo loginVo) {
        String mobile =  loginVo.getMobile();
        String password = loginVo.getPassword();

//        //先验证手机号和密码是否为空
//        if(StringUtils.isEmpty(mobile) || StringUtils.isEmpty(password)){
//            return RespBean.error(RespBeanEnum.LOGIN_ERROR);
//        }
//
//        //校验手机号是否为空，以及手机号格式是否正确
//        if(!ValidatorUtil.isMobile(mobile)){
//            return RespBean.error(RespBeanEnum.MOBILE_ERROR);
//        }

        //根据手机号查询用户
        User user = userMapper.selectById(mobile);
        if(null == user){
//            return RespBean.error(RespBeanEnum.LOGIN_ERROR);

            throw new GlobalException(RespBeanEnum.LOGIN_ERROR);

        }
        //判断密码是否正确
        if(!MD5Utils.fromPassToDBPass(password,user.getSalt()).equals(user.getPassword())){
//            return RespBean.error(RespBeanEnum.LOGIN_ERROR);
            throw new GlobalException(RespBeanEnum.LOGIN_ERROR);
        }
        return RespBean.success();
    }
}
