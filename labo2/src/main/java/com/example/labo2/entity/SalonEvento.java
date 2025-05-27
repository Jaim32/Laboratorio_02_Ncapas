package com.example.labo2.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalonEvento {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private String nombre;
    @Column
    private Integer capacidad;
    @Column
    private String caracteristicas;
    @ManyToOne
    private Piso piso;
}