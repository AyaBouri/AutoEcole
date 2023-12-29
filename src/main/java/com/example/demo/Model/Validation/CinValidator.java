package com.example.demo.Model.Validation;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
public class CinValidator implements ConstraintValidator<ValidCin, String>{   
     @Override
    public void initialize(ValidCin constraintAnnotation) {
    }
    @Override
    public boolean isValid(String cin, ConstraintValidatorContext context) {
        // Validation du format du CIN (exemple : 1234567890123)
        return cin != null && cin.matches("\\d{13}");
    }
}