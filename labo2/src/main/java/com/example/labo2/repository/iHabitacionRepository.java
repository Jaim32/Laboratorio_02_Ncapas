package com.example.labo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.*;
import com.example.labo2.entity.Habitacion;

public interface iHabitacionRepository extends JpaRepository<Habitacion, UUID> {

    List<Habitacion> findByNombreNotNull();

    @Query("SELECT e FROM Habitacion e WHERE e.descripcion = :value")
    List<Habitacion> findByDescripcionJPQL(@Param("value") Object value);

    @Query(value = "SELECT * FROM habitacion WHERE descripcion = :value", nativeQuery = true)
    List<Habitacion> findByDescripcionNative(@Param("value") Object value);

}