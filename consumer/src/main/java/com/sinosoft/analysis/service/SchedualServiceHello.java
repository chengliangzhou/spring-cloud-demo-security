package com.sinosoft.analysis.service;

import com.sinosoft.analysis.auth.BasicAuthConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "provider", configuration = BasicAuthConfiguration.class)
public interface SchedualServiceHello {
    @RequestMapping("/hello")
    String sayHello();
}
