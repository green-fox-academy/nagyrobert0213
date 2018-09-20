package com.greenfoxacademy.programmerfoxclub;

import org.springframework.stereotype.Service;

public class Fox {

    private String name;
    private String food;
    private String drink;
    private int tricks;

    public Fox(String name) {
        this.name = name;
        this.food = food;
        this.drink = drink;
        this.tricks = tricks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
