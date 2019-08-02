package com.yhh.practice.boot1.com.practice.boot1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "helloWord")
public class HelloWord {

    @RequestMapping(value = "hello")
    public String hello(){
        return "request is success";
    }
}
