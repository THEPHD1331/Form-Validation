package com.springMVC.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    public String value() default "PHD";  //default Course Code
    public String message() default "must start with PHD"; //default error message
    public Class<?>[] groups() default {}; //Groups can group related constraints
    public Class<? extends Payload>[] payload() default {}; //Payload provides custom details about validation failure


}
