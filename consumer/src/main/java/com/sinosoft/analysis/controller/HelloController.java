package com.sinosoft.analysis.controller;

import com.sinosoft.analysis.service.SchedualServiceHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    SchedualServiceHello schedualServiceHello;

    @GetMapping("/hello")
    public String hello(){
        return "security remote call ------> " + schedualServiceHello.sayHello();
    }
}
