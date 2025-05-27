package com.example.labo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.*;
import com.example.labo2.entity.OrdenTrabajo;

public interface iOrdenTrabajoRepository extends JpaRepository<OrdenTrabajo, UUID> {

    List<OrdenTrabajo> findByDescripcionNotNull();

    @Query("SELECT e FROM OrdenTrabajo e WHERE e.fecha = :value")
    List<OrdenTrabajo> findByFechaJPQL(@Param("value") Object value);

    @Query(value = "SELECT * FROM ordentrabajo WHERE fecha = :value", nativeQuery = true)
    List<OrdenTrabajo> findByFechaNative(@Param("value") Object value);

}