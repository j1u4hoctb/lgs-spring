package com.example.demo.service;

import com.example.demo.component.LgsComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LgsService {

    @Autowired(required = false)
    private LgsComponent lgsComponent;

    public void processSomeData() {

        if(lgsComponent != null) {
            lgsComponent.work();
        }

    }

}
