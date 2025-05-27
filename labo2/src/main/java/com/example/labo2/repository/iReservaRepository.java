package com.example.labo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.*;
import com.example.labo2.entity.Reserva;

public interface iReservaRepository extends JpaRepository<Reserva, UUID> {

    List<Reserva> findByEstadoNotNull();

    @Query("SELECT e FROM Reserva e WHERE e.fechaEntrada = :value")
    List<Reserva> findByFechaEntradaJPQL(@Param("value") Object value);

    @Query(value = "SELECT * FROM reserva WHERE fechaEntrada = :value", nativeQuery = true)
    List<Reserva> findByFechaEntradaNative(@Param("value") Object value);

}