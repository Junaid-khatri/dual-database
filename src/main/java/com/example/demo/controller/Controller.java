package com.example.demo.controller;

import com.example.demo.entity.PrimaryEntity;
import com.example.demo.repository.Primary;
import com.example.demo.secondaryrepository.Secondary;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {


    private final Primary primaryRepository;

    @Autowired
    Secondary secondaryRepository;

    @GetMapping("/test")
    public String test(){
        primaryRepository.save(new PrimaryEntity(1,"hello"));
        secondaryRepository.save(new com.example.demo.secondaryentity.Secondary(1,"hii"));
        return "success";
    }
}
