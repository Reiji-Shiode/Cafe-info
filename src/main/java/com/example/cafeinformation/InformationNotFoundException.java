package com.example.cafeinformation;

public class InformationNotFoundException extends RuntimeException {

    public InformationNotFoundException(String message) {
        super(message);
    }
}
