package com.example.labo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.*;
import com.example.labo2.entity.Sucursal;

public interface iSucursalRepository extends JpaRepository<Sucursal, UUID> {

    List<Sucursal> findByNombreNotNull();

    @Query("SELECT e FROM Sucursal e WHERE e.direccion = :value")
    List<Sucursal> findByDireccionJPQL(@Param("value") Object value);

    @Query(value = "SELECT * FROM sucursal WHERE direccion = :value", nativeQuery = true)
    List<Sucursal> findByDireccionNative(@Param("value") Object value);

}