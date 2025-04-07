package com.ravi.kalyani.small_basket.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }

    // Optional: Add constructor with cause
    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
