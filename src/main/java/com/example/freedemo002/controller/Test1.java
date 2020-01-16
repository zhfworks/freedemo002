package com.example.freedemo002.controller;


import com.example.freedemo002.model.User;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class Test1 {

    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        return "ok";
    }



    @RequestMapping("/test2")
    public String test2(HttpServletRequest request){

        List<User> list = new ArrayList<User>();
        list.add(new User(1,"a","1a@163.com"));
        list.add(new User(2,"b","2b@163.com"));
        list.add(new User(3,"c","3c@163.com"));
        request.setAttribute("userList",list);
        return "test2";
    }



}


