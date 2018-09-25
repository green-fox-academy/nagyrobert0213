package com.example.todo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

    @GetMapping("/todo")
    public String todo(){
        return "todo";
    }

    public String list(Model model){
        return "list";
    }
}
