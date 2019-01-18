package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

public class ListStudentController extends AbstractController {
	private StudentService service;

	public ListStudentController(StudentService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		List<StudentDTO>  listDTO=null;
		//use service
		listDTO=service.getAllStudents();
		//return MAV object
		return new ModelAndView("studs_report","listStuds",listDTO);
	}

}
