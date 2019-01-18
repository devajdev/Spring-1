package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

public class DeleteStudentController extends AbstractController {
	private  StudentService service;

	public DeleteStudentController(StudentService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		int sno=0;
		String deleteResult=null;
		ModelAndView mav=null;
		List<StudentDTO> listDTO=null;
			// read additional req param value
		sno=Integer.parseInt(req.getParameter("sno"));
		//use service
		deleteResult=service.removeStudentBySno(sno);
		listDTO=service.getAllStudents();
		//create and return MAV object
		mav=new ModelAndView();
		mav.addObject("listStuds",listDTO);
		mav.addObject("operation",deleteResult);
		mav.setViewName("studs_report");
		return mav;
	}//method
}//class
