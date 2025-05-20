package com.alumnos.demouno.repository;

import com.alumnos.demouno.model.Alumnos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumnos,Integer> {

    Alumnos findByCorreo(String correo);

    List<Alumnos> findByNombre(String nombre);

}
