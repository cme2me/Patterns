package com.example.patterns.exceptions;

public class UnsupportedTypeException extends RuntimeException {
    public UnsupportedTypeException(String message) {
        super(message);
    }
}
