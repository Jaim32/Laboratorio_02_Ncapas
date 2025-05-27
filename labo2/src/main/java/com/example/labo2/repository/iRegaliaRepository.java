package com.example.labo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.*;
import com.example.labo2.entity.Regalia;

public interface iRegaliaRepository extends JpaRepository<Regalia, UUID> {

    List<Regalia> findByNombreNotNull();

    @Query("SELECT e FROM Regalia e WHERE e.costoPuntos = :value")
    List<Regalia> findByCostoPuntosJPQL(@Param("value") Object value);

    @Query(value = "SELECT * FROM regalia WHERE costoPuntos = :value", nativeQuery = true)
    List<Regalia> findByCostoPuntosNative(@Param("value") Object value);

}