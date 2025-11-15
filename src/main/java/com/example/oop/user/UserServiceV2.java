package com.example.oop.user;

import com.example.oop.validator.ValidationProcessor;
import com.example.oop.validator.ValidationResult;
import com.example.oop.validator.user.UserValidationProcessor;

public class UserServiceV2 {

    private final User user;

    public UserServiceV2(User user) {
        this.user = user;
    }

    public void register() {
        ValidationProcessor validationProcessor = new UserValidationProcessor(user);
        ValidationResult validationResult = validationProcessor.execute();

        if (validationResult.failed()) {
            throw new IllegalArgumentException(validationResult.getMessage());
        }

        // create user

        // create welcome coupon
    }

}
