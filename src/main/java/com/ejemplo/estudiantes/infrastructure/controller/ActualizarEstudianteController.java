package com.ejemplo.estudiantes.infrastructure.controller;

import com.ejemplo.estudiantes.application.ModificarEstudianteService;
import com.ejemplo.estudiantes.domain.Estudiante;
import com.ejemplo.estudiantes.infrastructure.repository.EstudianteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("estudiantes")
@RequiredArgsConstructor
public class ActualizarEstudianteController {

    private final ModificarEstudianteService modificarEstudianteService;

    @PutMapping("/{id}")
    public Estudiante actualizarEstudiante(@PathVariable long id, @RequestBody Estudiante estudiante) {


        log.info("Se está actualizando un estudiante");
        return modificarEstudianteService.modificarEstudiante(id,estudiante);

    }
}

