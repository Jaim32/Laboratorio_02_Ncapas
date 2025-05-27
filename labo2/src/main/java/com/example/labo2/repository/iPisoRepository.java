package com.example.labo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.*;
import com.example.labo2.entity.Piso;

public interface iPisoRepository extends JpaRepository<Piso, UUID> {

    List<Piso> findByNombreNotNull();

    @Query("SELECT e FROM Piso e WHERE e.sucursal.id = :value")
    List<Piso> findBySucursalIdJPQL(@Param("value") Object value);

    @Query(value = "SELECT * FROM piso WHERE sucursal_id = :value", nativeQuery = true)
    List<Piso> findBySucursalidNative(@Param("value") Object value);

}