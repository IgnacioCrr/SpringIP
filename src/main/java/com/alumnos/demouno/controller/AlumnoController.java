package com.alumnos.demouno.controller;

import com.alumnos.demouno.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AlumnoController {

    @Autowired
    public AlumnoService alumnoService ;

    @GetMapping("api/v1/home")
    public String home() {
        return "Hello World";
    }

    @GetMapping("api/v1/alumnos")
    public ResponseEntity<?> getAlumnos(){
    return ResponseEntity.status(200).body(alumnoService.findall());
    }


}
