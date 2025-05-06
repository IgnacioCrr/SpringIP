package com.alumnos.demouno.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AlumnoController {
    @GetMapping("api/v1/home")
    public String home() {
        return "Hello World";
    }
}
