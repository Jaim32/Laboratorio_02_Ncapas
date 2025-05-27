package com.example.labo2.entity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdenTrabajo {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    private Persona reportadoPor;
    @ManyToOne
    private Habitacion habitacion;
    @Column
    private LocalDate fecha;
    @Column
    private LocalTime hora;
    @Column
    private String descripcion;
}

