package com.example.oop.validator;

public class ConditionResult {

    public static final ConditionResult SUCCESS = new ConditionResult(false, null);

    private final boolean failed;
    private final String message;

    private ConditionResult(boolean failed, String message) {
        this.failed = failed;
        this.message = message;
    }

    public static ConditionResult success() {
        return SUCCESS;
    }

    public static ConditionResult fail(String message) {
        return new ConditionResult(true, message);
    }

    public boolean failed() {
        return failed;
    }

    public String getMessage() {
        return message;
    }

}
