package com.wang.seckill.controller;

import com.wang.seckill.service.IUserService;
import com.wang.seckill.vo.LoginVo;
import com.wang.seckill.vo.RespBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
@RequestMapping("/login")
@Slf4j
public class loginController {

    @Autowired
    private IUserService userService;

    /**
     * 跳转登录页面
     * @return
     */

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    /**
     * 登录功能
     * @param loginVo
     * @return
     */
    @RequestMapping("/doLogin")
    @ResponseBody
    public RespBean doLogin(@Valid LoginVo loginVo){
        return userService.doLogin(loginVo);
    }

}
