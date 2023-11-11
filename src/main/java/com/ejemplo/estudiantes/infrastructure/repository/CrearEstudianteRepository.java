package com.ejemplo.estudiantes.infrastructure.repository;

import com.ejemplo.estudiantes.infrastructure.repository.model.EstudianteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrearEstudianteRepository extends JpaRepository<EstudianteEntity, Long> {
    
}
