package com.walkwind.boot01new.myconfig;

import com.walkwind.boot01new.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author walkwind
 * @Description
 * @Date 2020-3-31-17:17
 **/
@Configuration
public class myconfig {
    @Bean
    public HelloService helloService(){
        return new HelloService();
    }
}
