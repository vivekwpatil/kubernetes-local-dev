package com.java.engineering.rocketserviceminikubevanilla.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RocketController {

    @GetMapping(value = "/rocket/stats")
    public ResponseEntity hello() {
        return ResponseEntity.ok()
                .body("{"name":"Rocket name is RC1 with altitude of 12K");
    }

}
