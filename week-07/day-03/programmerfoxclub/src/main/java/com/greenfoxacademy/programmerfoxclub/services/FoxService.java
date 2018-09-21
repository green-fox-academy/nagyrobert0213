package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {

    private List<Fox> foxList = new ArrayList<>();

    public void addToList(String name) {
        foxList.add(new Fox(name));
    }

    public void addFox(String name){
        foxList.add(new Fox(name));
    }

    public Fox getFox(String name) {
        if (foxList.size() > 0)
            for (Fox fox : foxList) {
                if (fox.getName().equals(name)) {
                    return fox;
                }
            }
        return null;
    }
}
