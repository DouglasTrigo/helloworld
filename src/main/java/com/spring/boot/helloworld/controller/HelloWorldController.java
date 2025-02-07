package com.spring.boot.helloworld.controller;

import com.spring.boot.helloworld.util.HTMLUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("hello")
@RestController
public class HelloWorldController {

    @GetMapping
    public String helloWorld(){
        return HTMLUtil.getHelloWorldHTML();
    }
}
