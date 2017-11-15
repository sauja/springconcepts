package com.sauja.s_1_rest.service;

import com.sauja.s_1_rest.model.Greetings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingsServiceImpl implements GreetingsService{
    @Autowired
    private Greetings greetings;

    @Override
    public Greetings getGreetings(String message) {
        return greetings.getGreetings(message);
    }
}
