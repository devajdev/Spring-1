package com.nt.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.EmployeeCommand;

public class EmployeeController extends SimpleFormController {
	
	@Override
	public ModelAndView onSubmit(HttpServletRequest req, HttpServletResponse res, Object command,
			BindException errors) throws Exception {
		EmployeeCommand cmd=null;
		//type casting
		cmd=(EmployeeCommand)command;
		return new ModelAndView("result","empCmd",cmd);

	}
	
	@Override
	public void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
		System.out.println("EmployeeController:: initBinder(-,-)");
		SimpleDateFormat sdf=null;
		  sdf=new SimpleDateFormat("dd-MM-yyyy");
		  binder.registerCustomEditor(Date.class,new CustomDateEditor(sdf,true));
		  
	}

}
