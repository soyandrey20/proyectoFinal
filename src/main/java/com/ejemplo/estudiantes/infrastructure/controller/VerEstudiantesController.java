package com.ejemplo.estudiantes.infrastructure.controller;

import com.ejemplo.estudiantes.application.VerEstudianteService;
import com.ejemplo.estudiantes.domain.Estudiante;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("estudiantes")
@RequiredArgsConstructor
public class VerEstudiantesController {

    private final VerEstudianteService verEstudianteService;

    @GetMapping("/todos")
    public List<Estudiante> obtenerEstudiantes() {
        log.info("Se están pidiendo todos los estudiantes");
        return verEstudianteService.obtenerEstudiantes();
    }

    @GetMapping("/2")
    public Estudiante obtenerEstudiante() {
        log.info("Se está pidiendo el estudiante");
        return verEstudianteService.obtenerEstudiante();
    }
}
