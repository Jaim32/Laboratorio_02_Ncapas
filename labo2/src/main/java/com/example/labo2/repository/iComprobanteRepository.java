package com.example.labo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.*;
import com.example.labo2.entity.Comprobante;

public interface iComprobanteRepository extends JpaRepository<Comprobante, UUID> {

    List<Comprobante> findByFechaEmisionNotNull();

    @Query("SELECT e FROM Comprobante e WHERE e.montoTotal = :value")
    List<Comprobante> findByMontoTotalJPQL(@Param("value") Object value);

    @Query(value = "SELECT * FROM comprobante WHERE montoTotal = :value", nativeQuery = true)
    List<Comprobante> findByMontoTotalNative(@Param("value") Object value);

}
