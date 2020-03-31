package com.walkwind.boot01new;

import com.walkwind.boot01new.bean.Person;
import javafx.application.Application;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Boot01newApplicationTests {

    @Autowired
    private Person person;
    @Autowired
    ApplicationContext ioc;
    @Test
    void contextLoads() {
        System.out.println(person.toString());
    }
    @Test
    void testMyconfig(){
        boolean helloService = ioc.containsBean("helloService");
        System.out.println(helloService);
    }

}
