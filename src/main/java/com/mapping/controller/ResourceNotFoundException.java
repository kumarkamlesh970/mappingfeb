package com.mapping.controller;

// Extend RuntimeException
public class ResourceNotFoundException extends RuntimeException {

    // Constructor that accepts an error message
    public ResourceNotFoundException(String message) {
        super(message);  // Call superclass constructor to pass the message
    }
}
