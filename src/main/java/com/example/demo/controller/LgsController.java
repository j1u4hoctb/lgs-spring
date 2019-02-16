package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LgsController {

    @GetMapping
    public ResponseEntity getSomeResponce() {

        return ResponseEntity.ok("Some responce");

    }

}
