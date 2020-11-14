package com.bjpowernode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginOut {

    @RequestMapping("/LoginOut01")
    public String Out(HttpServletRequest request){
        HttpSession session =request.getSession();
            session.removeAttribute("user");
            return "../../login";
    }

}
