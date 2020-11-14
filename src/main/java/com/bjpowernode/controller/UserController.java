package com.bjpowernode.controller;

import com.bjpowernode.bean.User;
import com.bjpowernode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("userLogin")
    public String userLogin(User user, HttpServletResponse response, HttpServletRequest request){
        User user1 = userService.userLogin(user);
        if(user1 != null){
            // 跳转到查询火车票页面
            HttpSession session = request.getSession();
            session .setAttribute("user",user1);
        }else {
            try {
                response .getWriter() .println("输入的用户名或密码错误") ;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "forward:trainList";
    }
    @RequestMapping("tuichu")
    public String tuichu(HttpServletRequest request){
        HttpSession session = request.getSession();
        session .removeAttribute("user");
        return "../../login";
    }



}
