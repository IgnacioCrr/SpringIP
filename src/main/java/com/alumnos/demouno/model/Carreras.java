package com.alumnos.demouno.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="carreras")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Carreras {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 100, unique = true)
    private String nombreCarrera;


}
