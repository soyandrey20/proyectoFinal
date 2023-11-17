package com.ejemplo.estudiantes.application;

import com.ejemplo.estudiantes.application.mapped.EstudianteMapper;
import com.ejemplo.estudiantes.domain.Estudiante;
import com.ejemplo.estudiantes.infrastructure.repository.EstudianteRepository;
import com.ejemplo.estudiantes.infrastructure.repository.model.EstudianteEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;




@Service
@RequiredArgsConstructor
public class ModificarEstudianteService {

    private final EstudianteRepository estudianteRepository;
    private final VerEstudianteService verEstudianteService;

    public Estudiante modificarEstudiante(long id, Estudiante estudianteNuevo) {

        Estudiante estudianteAntiguo = verEstudianteService.obtenerEstudiante(id);

        EstudianteEntity entity = EstudianteMapper.INSTANCE.mapToEntity(estudianteAntiguo);

        entity.setNombre(estudianteNuevo.getNombre());
        entity.setApellido(estudianteNuevo.getApellido());
        entity.setEdad(estudianteNuevo.getEdad());

        EstudianteEntity estudianteResultante = estudianteRepository.save(entity);

        return EstudianteMapper.INSTANCE.mapToDomain(estudianteResultante);
    }

}
