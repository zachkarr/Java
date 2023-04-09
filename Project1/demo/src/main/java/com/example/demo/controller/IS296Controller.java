package com.example.demo.controller;

import com.example.demo.ds.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IS296Controller {
    @Autowired
    private DataSource ds;
    public IS296Controller(DataSource ds) {
        System.out.println("Controller Instantiated");
        this.ds = ds;

    }

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}
