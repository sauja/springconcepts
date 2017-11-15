package com.sauja.s_1_rest.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

@Repository
public class Greetings {
    private static int count=0;

    @Setter @Getter String greeting_id;
    @Setter @Getter String message;

    public Greetings() {
    }

    public Greetings(String greeting_id, String message) {
        this.greeting_id = greeting_id;
        this.message = message;
    }
    public Greetings getGreetings(String message)
    {
        return new Greetings(count++ +"",message);
    }
}
