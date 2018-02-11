package com.example.sericefeign.bean;

import com.example.sericefeign.feign.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author lirong
 * @create 2018/2/1
 * @since 1.0.0
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
