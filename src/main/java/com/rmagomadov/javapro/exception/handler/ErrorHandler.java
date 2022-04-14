package com.rmagomadov.javapro.exception.handler;

import com.rmagomadov.javapro.exception.PermissionDeniedException;
import com.rmagomadov.javapro.exception.UserNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ErrorHandler {

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(UserNotFoundException.class)
    public void handleUserNotFound(UserNotFoundException exception) {
        log.info("User not found", exception);
    }

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(PermissionDeniedException.class)
    public void handlePermissionDenied(PermissionDeniedException exception) {
    }
}
