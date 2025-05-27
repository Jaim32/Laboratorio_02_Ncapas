package com.example.labo2.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AsignacionTurno {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String idAsignacionTurno;

    @ManyToOne
    private Persona empleado;
    @ManyToOne
    private Piso piso;
    @Column
    private String mes;
    @Column
    private String turno;
    @Column
    private String estado;
}