package com.alumnos.demouno.service;


import com.alumnos.demouno.model.Alumnos;
import com.alumnos.demouno.repository.AlumnoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class AlumnoService {

    @Autowired
    public AlumnoRepository alumnoRepository ;

    public List<Alumnos> findall(){
        return alumnoRepository.findAll();
    }

    //
    public Alumnos findById(Integer id){
        return alumnoRepository.findById(id).orElse(null);
    };

    public void  deleteAlumnos(Integer id){
        alumnoRepository.deleteById(id);
    }

    public Alumnos findByCorreo(String correo){
        return alumnoRepository.findByCorreo(correo);
    }

    public List<Alumnos> findByNombre(String nombre){
        return alumnoRepository.findByNombre(nombre);
    }
}
