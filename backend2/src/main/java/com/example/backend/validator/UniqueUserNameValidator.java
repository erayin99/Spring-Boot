package com.example.backend.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.example.backend.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public final class UniqueUserNameValidator implements ConstraintValidator<UniqueUserName, String> {

	private UserRepository userRepository;
	

	@Override
	public boolean isValid(String username, ConstraintValidatorContext context) {
			
		
		return userRepository.existsUserByUsername(username);
	}


	@Override
	public void initialize(UniqueUserName constraintAnnotation) {
	
		
	}

}
