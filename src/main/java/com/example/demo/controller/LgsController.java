package com.example.demo.controller;

import com.example.demo.component.LgsComponent;
import com.example.demo.service.LgsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LgsController {

    @Autowired(required = false)
    private LgsComponent lgsComponent;

    @Autowired
    private LgsService lgsService;

    @GetMapping
    public ResponseEntity getSomeResponce() {

        if(lgsComponent != null) {
            lgsComponent.work();
        }
        lgsService.processSomeData();

        return ResponseEntity.ok("Some responce");

    }

}
