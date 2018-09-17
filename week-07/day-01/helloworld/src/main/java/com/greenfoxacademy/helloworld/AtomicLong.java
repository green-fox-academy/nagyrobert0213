package com.greenfoxacademy.helloworld;

import com.greenfoxacademy.helloworld.controllers.Greeting;

public class AtomicLong {
    public int countGreetings(){
        long count = 0;
        for (Greeting greeting : count) {
            count = greeting.getId();
        }
    }
}
