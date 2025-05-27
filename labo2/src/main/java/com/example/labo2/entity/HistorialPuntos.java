package com.example.labo2.entity;
import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HistorialPuntos {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    private Persona huesped;
    @Column
    private Integer puntos;
    @ManyToOne
    private Persona otorgadoPor;
    @Column
    private LocalDate fecha;
}