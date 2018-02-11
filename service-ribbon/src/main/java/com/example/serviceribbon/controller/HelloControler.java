package com.example.serviceribbon.controller;

import com.example.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lirong
 * @create 2018/1/31
 * @since 1.0.0
 */
@RestController
public class HelloControler {
    @Autowired
    private HelloService helloService;
    @RequestMapping("/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }
}
