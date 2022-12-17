package com.example.backend.validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = {UniqueUserNameValidator.class})
public @interface UniqueUserName {
	
	String meage () default "{backend.constraint.UniqueUserName.mesage}";

	Class<?>[] gorups() default { };
	
	Class<? extends Payload>[] payload() default { };
}
