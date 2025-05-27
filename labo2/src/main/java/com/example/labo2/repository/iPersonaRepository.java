package com.example.labo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.*;
import com.example.labo2.entity.Persona;

public interface iPersonaRepository extends JpaRepository<Persona, UUID> {

    // 🔹 Consulta derivada
    List<Persona> findByEmailNotNull();

    // 🔸 Consulta JPQL
    @Query("SELECT e FROM Persona e WHERE e.rol = :value")
    List<Persona> findByRolJPQL(@Param("value") Object value);

    // 🔺 Consulta nativa SQL
    @Query(value = "SELECT * FROM persona WHERE rol = :value", nativeQuery = true)
    List<Persona> findByRolNative(@Param("value") Object value);

}