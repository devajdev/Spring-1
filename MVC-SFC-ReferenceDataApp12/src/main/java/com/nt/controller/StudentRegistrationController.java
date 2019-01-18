package com.nt.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.StudentCommand;

public class StudentRegistrationController extends SimpleFormController {
	
	
	@Override
	public Map referenceData(HttpServletRequest request) throws Exception {
		System.out.println("StudentRegistrationController.referenceData()");
		 Map<String,List<String>> map=null;
		 List<String>  gendersList=null,coursesList=null,hobiesList=null,qlfyList=null;
		 //prepare List Collections
		 gendersList=new ArrayList();
		 gendersList.add("male"); gendersList.add("female"); gendersList.add("Third Gender");
		 
		 coursesList=new ArrayList();
		 coursesList.add("Core java"); coursesList.add("adv.java"); coursesList.add("spring"); coursesList.add("hibernate");
		 
		 hobiesList=new ArrayList();
		 hobiesList.add("forgetting"); hobiesList.add("sleeping"); hobiesList.add("eating");
		 hobiesList.add("roaming");
		 
		 qlfyList=new ArrayList();
		 qlfyList.add("Engg"); qlfyList.add("medical"); qlfyList.add("Arts");qlfyList.add("Science");
		 
		 //add to Map Collecction to make them request attribbutes
		 map=new HashMap();
		 map.put("coursesList",coursesList);
		 map.put("hobiesList",hobiesList);
		 map.put("genderList",gendersList);
		 map.put("qlfyList",qlfyList);
		 return map;
	}//method
	
	@Override
	public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		StudentCommand cmd=null;
		//type casting
	    cmd=(StudentCommand) command;
	    return new ModelAndView(getSuccessView(),"cmdData",cmd);
	}
	
}//class
