package com.greenfoxacademy.programmerfoxclub.models;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

public class Fox {

    private String name;
    private String trick;
    private String food;
    private String drink;

    public Fox(String name) {
        this.name = name;
        this.trick = trick;
        this.food = food;
        this.drink = drink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrick() {
        return trick;
    }

    public void setTrick(String trick) {
        this.trick = trick;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
