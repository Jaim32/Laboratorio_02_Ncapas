package com.example.labo2.repository;

import com.example.labo2.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProyectoRepository extends JpaRepository<Proyecto, Long> {

    @Query("SELECT p FROM Proyecto p " +
            "LEFT JOIN FETCH p.categoria " +
            "LEFT JOIN FETCH p.cliente " +
            "LEFT JOIN FETCH p.lider " +
            "LEFT JOIN FETCH p.empleados " +
            "LEFT JOIN FETCH p.tecnologias " +
            "WHERE p.id = :id")
    Optional<Proyecto> findByIdWithDetails(Long id);

    @Query("SELECT p FROM Proyecto p " +
            "LEFT JOIN FETCH p.categoria " +
            "LEFT JOIN FETCH p.cliente " +
            "LEFT JOIN FETCH p.lider " +
            "LEFT JOIN FETCH p.empleados " +
            "LEFT JOIN FETCH p.tecnologias")
    List<Proyecto> findAllWithDetails();

    @Query(value = "SELECT p.nombre, p.descripcion FROM proyecto p", nativeQuery = true)
    List<Object[]> findAllProjectNamesAndDescriptions();
}