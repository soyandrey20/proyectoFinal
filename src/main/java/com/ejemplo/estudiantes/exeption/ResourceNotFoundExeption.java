package com.ejemplo.estudiantes.exeption;

public class ResourceNotFoundExeption extends RuntimeException {

    public ResourceNotFoundExeption(String mensajeError) {
        super(mensajeError);
    }
}
