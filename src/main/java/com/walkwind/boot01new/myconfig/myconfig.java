package com.walkwind.boot01new.myconfig;

import com.walkwind.boot01new.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author walkwind
 * @Description
 * @Date 2020-3-31-17:17
 **/
@Configuration//标注该类为一个配置类
public class myconfig {
    @Bean//将返回的值注入的spring容器中,值的引用为方法的名称:helloService
    public HelloService helloService(){
        return new HelloService();
    }
}
