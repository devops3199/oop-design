package com.example.oop.validator.user;

import com.example.oop.validator.ConditionResult;
import com.example.oop.validator.ValidationCondition;

import java.time.LocalDate;
import java.time.Period;

public class UserAgeCheckCondition implements ValidationCondition {

    private final LocalDate birthdate;

    public UserAgeCheckCondition(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public ConditionResult validate() {
        LocalDate currentDate = LocalDate.now();
        Period agePeriod = Period.between(birthdate, currentDate);

        if (agePeriod.getYears() < 18) {
            return ConditionResult.fail("under 18");
        }

        return ConditionResult.success();
    }

}