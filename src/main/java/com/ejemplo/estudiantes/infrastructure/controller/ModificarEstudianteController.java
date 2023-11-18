package com.ejemplo.estudiantes.infrastructure.controller;

import com.ejemplo.estudiantes.application.ActualizacionEstudianteService;
import com.ejemplo.estudiantes.domain.Estudiante;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("estudiantes")
@RequiredArgsConstructor
public class ModificarEstudianteController {

    private final ActualizacionEstudianteService actualizacionEstudianteService;

    @PutMapping("/{id}")
    public Estudiante actualizarEstudiante(@PathVariable long id, @RequestBody Estudiante estudiante) {


        log.info("Se está actualizando el estudiante estudiante con id: " + id);

        return actualizacionEstudianteService.modificarEstudiante(id,estudiante);

    }
}

