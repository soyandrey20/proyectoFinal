package com.ejemplo.estudiantes.exeption;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExeptionHandler {

    @ExceptionHandler({ResourceNotFoundExeption.class})
    public ResponseEntity<ApiErrorResponse> handlerResourceNotFoundException(ResourceNotFoundExeption resourceNotFoundExeption) {

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(ApiErrorResponse.builder().mensajeError(resourceNotFoundExeption.getMessage()).build());
    }

}
