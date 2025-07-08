package com.example.project.project.exceptions;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProductnotfoundExecption.class)
    public ResponseEntity<Map<String, Object>> handleProductNotFound(ProductnotfoundExecption ex) {
        Map<String, Object> errorResponse = new HashMap<>();
        errorResponse.put("timestamp", LocalDateTime.now());
        errorResponse.put("status", HttpStatus.NOT_FOUND.value());
        errorResponse.put("error", "Product Not Found");
        errorResponse.put("message", ex.getMessage());
        errorResponse.put("hi", "mani");

        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}
