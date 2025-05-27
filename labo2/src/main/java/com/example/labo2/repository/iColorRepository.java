package com.example.labo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.*;
import com.example.labo2.entity.Color;

public interface iColorRepository extends JpaRepository<Color, UUID> {

    List<Color> findByNombreColorNotNull();

    @Query("SELECT e FROM Color e WHERE e.codigoHex = :value")
    List<Color> findByCodigoHexJPQL(@Param("value") Object value);

    @Query(value = "SELECT * FROM color WHERE codigoHex = :value", nativeQuery = true)
    List<Color> findByCodigoHexNative(@Param("value") Object value);

}
