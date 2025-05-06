package com.alumnos.demouno.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name="matriculas")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Matriculas {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private Date fecha;




}
