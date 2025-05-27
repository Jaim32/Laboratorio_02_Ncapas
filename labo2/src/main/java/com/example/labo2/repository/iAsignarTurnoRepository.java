package com.example.labo2.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.*;
import com.example.labo2.entity.AsignacionTurno;

public interface iAsignarTurnoRepository extends JpaRepository<AsignacionTurno, UUID> {

    List<AsignacionTurno> findByTurnoNotNull();

    @Query("SELECT e FROM AsignacionTurno e WHERE e.mes = :value")
    List<AsignacionTurno> findByMesJPQL(@Param("value") Object value);

    @Query(value = "SELECT * FROM asignacionturno WHERE mes = :value", nativeQuery = true)
    List<AsignacionTurno> findByMesNative(@Param("value") Object value);

}