package com.alumnos.demouno.controller;

import com.alumnos.demouno.model.Alumnos;
import com.alumnos.demouno.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    //@PathVariable captura las id que definimos
    // ResponseEntity Nos ayuda a trasformar una lista de objetos a JSON
    @GetMapping("api/v1/alumnos/{id}")
    public ResponseEntity<?> getAlumnosById(@PathVariable Integer id){
        Alumnos alumno = alumnoService.findById(id);

        if (null == alumno) {
            return ResponseEntity.status(404).body("Alumno no encontrado");

        }
        return ResponseEntity.status(200).body(alumno);
    }

    @DeleteMapping("api/v1/alumno/{id}")
    public ResponseEntity<?> deleteAlumno(@PathVariable Integer id){
        Alumnos alumno = alumnoService.findById(id);
        if (null == alumno) {
            return ResponseEntity.status(404).body("Alumno no encontrado");
        }
        alumnoService.deleteAlumnos(id);
        return ResponseEntity.status(200).body("Alumno eliminado");
    }

    @GetMapping("api/v1/alumnos/buscar")
    public ResponseEntity<?> buscarAlumnos(@RequestParam String correo){
        Alumnos alumno = alumnoService.findByCorreo(correo);

        return ResponseEntity.status(200).body(alumno);

    }

    @GetMapping("api/v1/alumnos/listado/{nombre}")
    public ResponseEntity<?> buscarNombre(@RequestParam String nombre){
        List<Alumnos> alumno = alumnoService.findByNombre(nombre);
        return ResponseEntity.status(200).body(alumno);
    }

}
