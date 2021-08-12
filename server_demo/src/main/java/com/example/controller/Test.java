package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zyf
 * @create: 2021-08-12 11:29
 **/
@RestController
@RequestMapping("/test")
public class Test {
    @RequestMapping("/hh")
    public String test(){
        return "test li";
    }
}
