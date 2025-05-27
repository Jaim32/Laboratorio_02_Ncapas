package com.example.labo2.entity;
import java.time.LocalDate;

public class Reserva {
    private Long id;
    private Persona persona;
    private Habitacion habitacion;
    private SalonEvento salonEvento;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private String estado;
}
