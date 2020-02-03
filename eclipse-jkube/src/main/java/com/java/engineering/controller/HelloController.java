package com.java.engineering.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello/{name}")
    public Map<String,String>  hello(@PathVariable String name) {

        HashMap m= new HashMap();
        m.put("1", "Welcome to minikube demo " + name);
        return m;
    }
}
