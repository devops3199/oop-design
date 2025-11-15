package com.example.oop.validator.user;

import com.example.oop.user.User;
import com.example.oop.validator.ConditionResult;
import com.example.oop.validator.ValidationCondition;
import com.example.oop.validator.ValidationProcessor;
import com.example.oop.validator.ValidationResult;

import java.util.ArrayList;
import java.util.List;

public class UserValidationProcessor implements ValidationProcessor {

    private final User user;

    public UserValidationProcessor(User user) {
        this.user = user;
    }

    @Override
    public ValidationResult execute() {
        UserRegisterContext context = UserRegisterContext.from(this.user);

        List<ValidationCondition> conditions = new ArrayList<>();
        conditions.add(new UserRegisterFieldsNotNullCondition(context));
        conditions.add(new UserNameLengthCondition(context.name()));
        conditions.add(new UserEmailFormatCondition(context.email()));
        conditions.add(new UserPasswordLengthCondition(context.password()));
        conditions.add(new UserGenderCheckCondition(context.gender()));
        conditions.add(new UserAgeCheckCondition(context.birthdate()));

        for (ValidationCondition condition : conditions) {
            ConditionResult conditionResult = condition.validate();

            if (conditionResult.failed()) {
                return ValidationResult.fail(conditionResult.getMessage());
            }
        }

        return ValidationResult.success();
    }

}