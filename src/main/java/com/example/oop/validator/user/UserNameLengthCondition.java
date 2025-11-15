package com.example.oop.validator.user;

import com.example.oop.validator.ConditionResult;
import com.example.oop.validator.ValidationCondition;

public class UserNameLengthCondition implements ValidationCondition {

    private final String name;

    public UserNameLengthCondition(String name) {
        this.name = name;
    }

    @Override
    public ConditionResult validate() {
        if (this.name.length() > 10) {
            return ConditionResult.fail("User name must be 10 characters or less");
        }

        return ConditionResult.success();
    }

}