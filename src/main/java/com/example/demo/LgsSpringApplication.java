package com.example.demo;

import com.example.demo.component.LgsComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LgsSpringApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(LgsSpringApplication.class, args);

        LgsComponent beanByClass = applicationContext.getBean(LgsComponent.class);
        LgsComponent beanByName = (LgsComponent) applicationContext.getBean("lgsComponent");

        boolean sameReferenceCheck = beanByClass == beanByName;

        System.out.println("Same reference check: " + sameReferenceCheck);

        beanByClass.work();
        beanByName.work();
    }

}


