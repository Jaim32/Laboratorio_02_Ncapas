package com.example.labo2.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    private Persona persona;
    @ManyToOne
    private Habitacion habitacion;
    @ManyToOne
    private SalonEvento salonEvento;
    @Column
    private LocalDate fechaEntrada;
    @Column
    private LocalDate fechaSalida;
    @Column
    private String estado;
}
