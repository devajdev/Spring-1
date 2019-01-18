package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.StudentCommand;
import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

public class EditStudentController extends SimpleFormController {
	  
	private StudentService service; 
	
	public EditStudentController(StudentService service) {
		this.service = service;
	}

	
	@Override
	public Object formBackingObject(HttpServletRequest req) throws Exception {
		StudentCommand cmd=null;
		StudentDTO dto=null;
		int sno=0;
		//get addtional req param sno value
		sno=Integer.parseInt(req.getParameter("sno"));
		//use Service 
		dto=service.getStudentBySno(sno);
		//copy DTO to Command
		cmd=new		StudentCommand();
		BeanUtils.copyProperties(dto,cmd);
		return cmd;
	}
	
	@Override
	public ModelAndView onSubmit(HttpServletRequest req, HttpServletResponse res, Object command,
			BindException errors) throws Exception {
		StudentCommand cmd=null;
		StudentDTO dto=null;
		String updateResult=null;
		ModelAndView mav=null;
		List<StudentDTO> listDTO=null;
		//type casti
		cmd=(StudentCommand)command;
		//Convert Command object to DTO class obj
		dto=new StudentDTO();
		BeanUtils.copyProperties(cmd,dto);
		//use Service
		updateResult=service.modifyStudentBySno(dto);
		listDTO=service.getAllStudents();
		//create and return MAV
		mav=new ModelAndView();
		mav.addObject("operation",updateResult);
		mav.addObject("listStuds",listDTO);
		mav.setViewName("studs_report");
       return mav;		
	}//method
}//class
