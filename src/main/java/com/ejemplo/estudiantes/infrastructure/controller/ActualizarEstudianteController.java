package com.ejemplo.estudiantes.infrastructure.controller;
import com.ejemplo.estudiantes.domain.Estudiante;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("estudiantes")
@RequiredArgsConstructor
public class ActualizarEstudianteController {
    @PostMapping("/actualizar/{id}")

    public void actualizarEstudiante(@PathVariable long id, Estudiante estudiante) {
        log.info("Se están pidiendo todos los estudiantes");
    }
}

