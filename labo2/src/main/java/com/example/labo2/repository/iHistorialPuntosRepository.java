package com.example.labo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.*;
import com.example.labo2.entity.HistorialPuntos;

public interface iHistorialPuntosRepository extends JpaRepository<HistorialPuntos, UUID> {

    List<HistorialPuntos> findByPuntosNotNull();

    @Query("SELECT e FROM HistorialPuntos e WHERE e.fecha = :value")
    List<HistorialPuntos> findByFechaJPQL(@Param("value") Object value);

    @Query(value = "SELECT * FROM historialpuntos WHERE fecha = :value", nativeQuery = true)
    List<HistorialPuntos> findByFechaNative(@Param("value") Object value);

}

