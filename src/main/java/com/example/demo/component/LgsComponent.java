package com.example.demo.component;

import java.util.Random;
import javax.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("requset")
public class LgsComponent {

    private Integer randomInteger;

    @PostConstruct
    public void init() {
        Random random = new Random();
        randomInteger = random.nextInt(100);
    }

    public void work() {
        System.out.println("I'm a Logos component: " + randomInteger);
    }

}
