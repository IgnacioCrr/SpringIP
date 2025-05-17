package com.alumnos.demouno.repository;

import com.alumnos.demouno.model.Alumnos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumnos,Integer> {

}
