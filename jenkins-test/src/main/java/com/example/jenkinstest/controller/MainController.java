package com.example.jenkinstest.controller;

import com.example.jenkinstest.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final MainService mainService;

    @GetMapping("/")
    public String getMain() {
        return mainService.getMessage();
    }
}
