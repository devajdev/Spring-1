package com.nt.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.StudentCommand;

public class StudentCmdValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(StudentCommand.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		StudentCommand cmd=null;
		//type casting
		cmd=(StudentCommand)target;
		//validation logic
		if(cmd.getSname().length()==0 || cmd.getSname().equals("") || cmd.getSname()==null)
			errors.rejectValue("sname","name.required");
		
		if(cmd.getSadd().length()==0 || cmd.getSadd().equals("") || cmd.getSadd()==null)
			errors.rejectValue("sadd","addrs.required");
		
	}

}
