package com.example.oop.validator.user;

import com.example.oop.validator.ConditionResult;
import com.example.oop.validator.ValidationCondition;

public class UserGenderCheckCondition implements ValidationCondition {

    private final String gender;

    public UserGenderCheckCondition(String gender) {
        this.gender = gender;
    }

    @Override
    public ConditionResult validate() {
        if (!this.gender.equals("M") && !this.gender.equals("F")) {
            return ConditionResult.fail("invalid gender");
        }

        return ConditionResult.success();
    }

}