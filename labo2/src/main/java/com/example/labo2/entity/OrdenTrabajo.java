package com.example.labo2.entity;
import java.time.LocalDate;
import java.time.LocalTime;

public class OrdenTrabajo {
    private Long id;
    private Persona reportadoPor;
    private Habitacion habitacion;
    private LocalDate fecha;
    private LocalTime hora;
    private String descripcion;
}
