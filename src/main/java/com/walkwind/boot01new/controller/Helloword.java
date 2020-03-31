package com.walkwind.boot01new.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author walkwind
 * @Description
 * @date -18:47
 **/
@RestController
public class Helloword {
    @RequestMapping("/hello")
    public String hello(){
        return "hello word!";
    }
}
