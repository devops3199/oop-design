package com.example.oop.validator;

public class ValidationResult {

    private final boolean failed;
    private final String message;

    private ValidationResult(boolean failed, String message) {
        this.failed = failed;
        this.message = message;
    }

    public static ValidationResult success() {
        return new ValidationResult(false, null);
    }

    public static ValidationResult fail(String message) {
        return new ValidationResult(true, message);
    }

    public boolean failed() {
        return failed;
    }

    public String getMessage() {
        return message;
    }

}
