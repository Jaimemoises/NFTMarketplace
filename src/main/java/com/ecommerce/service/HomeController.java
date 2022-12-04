package com.ecommerce.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "This is my home page";
    }
    @RequestMapping("/test")
    public String test(){
        return "This is my test 1";
    }

}
