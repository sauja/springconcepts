package com.sauja.s_1_rest.controller;

import com.sauja.s_1_rest.model.Greetings;
import com.sauja.s_1_rest.service.GreetingsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private GreetingsServiceImpl greetingsService;
    @RequestMapping(value = "")
    public Greetings getHomePage()
    {
        return greetingsService.getGreetings("heloo");
    }
}
