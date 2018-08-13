package com.sinosoft.analysis.auth;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BasicAuthConfiguration {
    @Bean
    public BasicAuthRequestInterceptor basicAuthorizationInterceptor(){
        return new BasicAuthRequestInterceptor("admin", "123456");
    }
}
