package com.wn.controller;

import com.wn.model.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @Autowired
    Cat cat;

    @RequestMapping("/")
    @ResponseBody
    public String home(){
        cat.run();
        return "Hello World";
    }
}
