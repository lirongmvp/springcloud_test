package com.example.sericefeign.controller;

import com.example.sericefeign.feign.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lirong
 * @create 2018/2/1
 * @since 1.0.0
 */
@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
