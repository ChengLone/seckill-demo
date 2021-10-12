package com.wang.seckill.controller;

import com.wang.seckill.pojo.User;
import com.wang.seckill.service.IUserService;
import com.wang.seckill.service.impl.UserServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private IUserService userService;


    /**
     * 跳转到商品列表页
     *
     * @param model
     * @param user
     * @return
     */
    @RequestMapping("/toList")
    public String toList(Model model, User user) {
//        if(StringUtils.isEmpty(ticket)){
//            return "login";
//        }
////        User user = (User) session.getAttribute(ticket);
//        User user = userService.getUserByCookie(ticket, request, response);
//        if(null == user){
//            return "login";
//        }
        model.addAttribute("user", user);
        return "goodsList";
    }

}
