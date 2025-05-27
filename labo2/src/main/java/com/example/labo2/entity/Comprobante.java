package com.example.labo2.entity;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Comprobante {
    private Long id;
    private Reserva reserva;
    private LocalDate fechaEmision;
    private BigDecimal montoTotal;
}
