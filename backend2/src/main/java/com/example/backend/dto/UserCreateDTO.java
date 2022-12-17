package com.example.backend.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.backend.validator.UniqueUserName;

import lombok.Data;
import lombok.Singular;

@Data
public class UserCreateDTO {
	
	@NotNull(message = "{backend.constraints.username.NotNull.message}")
	@Size(min = 2, max = 20, message = "{backend.constraints.username.Size.message}")
	@UniqueUserName
	private String userName;
	
	@NotNull(message = "{backend.constraints.firstname.NotNull.message}")
	@Size(min = 2, max = 20, message = "{backend.constraints.firstname.Size.message}")
	private String firstName;
	@NotNull(message = "{backend.constraints.lastname.NotNull.message}")
	@Size(min = 2, max = 20, message = "{backend.constraints.lastname.Size.message}")
	private String lastName;
	

}
