package br.com.gfsantos.payroll_api.resources.exceptions;


import br.com.gfsantos.payroll_api.services.ObjectNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDate;
import java.time.LocalDateTime;

@ControllerAdvice
public class ResourceExceptionHandle {
    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandarError> objectNotFound(ObjectNotFoundException exc, HttpServletRequest request){

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                new StandarError(LocalDate.now(), exc.getMessage(),HttpStatus.NOT_FOUND.value(), request.getRequestURI())
        );

    }
}
