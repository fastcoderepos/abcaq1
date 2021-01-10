package com.fastcode.abcaq1.application.core.authorization.role.dto;

import java.time.*;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateRoleInput {

  	@NotNull(message = "displayName Should not be null")
  	@Length(max = 255, message = "displayName must be less than 255 characters")
  	private String displayName;
  
  	@NotNull(message = "name Should not be null")
  	@Length(max = 255, message = "name must be less than 255 characters")
  	private String name;
  

}

