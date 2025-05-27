package com.example.labo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.*;
import com.example.labo2.entity.SalonEvento;

public interface iSalonEventoRepository extends JpaRepository<SalonEvento, UUID> {

    List<SalonEvento> findByNombreNotNull();

    @Query("SELECT e FROM SalonEvento e WHERE e.capacidad = :value")
    List<SalonEvento> findByCapacidadJPQL(@Param("value") Object value);

    @Query(value = "SELECT * FROM salonevento WHERE capacidad = :value", nativeQuery = true)
    List<SalonEvento> findByCapacidadNative(@Param("value") Object value);

}
