package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.nt.command.UserCommand;

public class UserCurdOperationsController extends MultiActionController {
	
	public  ModelAndView  insert(HttpServletRequest req,HttpServletResponse res,UserCommand cmd){
		ModelAndView mav=null;
		System.out.println("UserCurdOperationsController.insert(-,-,-)");
		mav=new ModelAndView();
		mav.setViewName("user");
		mav.addObject("operationMsg","insert");
		mav.addObject("cmdData",cmd);
	   return mav;	
	}
	public  ModelAndView update(HttpServletRequest req,HttpServletResponse res,UserCommand cmd){
		ModelAndView mav=null;
		System.out.println("UserCurdOperationsController.update(-,-,-)");
		mav=new ModelAndView();
		mav.setViewName("user");
		mav.addObject("operationMsg","update");
		mav.addObject("cmdData",cmd);
	   return mav;	
	}
	
	public  ModelAndView delete(HttpServletRequest req,HttpServletResponse res,UserCommand cmd){
		ModelAndView mav=null;
		System.out.println("UserCurdOperationsController.delete(-,-,-)");
		mav=new ModelAndView();
		mav.setViewName("user");
		mav.addObject("operationMsg","delete");
		mav.addObject("cmdData",cmd);
	   return mav;	
	}
	public  ModelAndView find(HttpServletRequest req,HttpServletResponse res,UserCommand cmd){
		ModelAndView mav=null;
		System.out.println("UserCurdOperationsController.find(-,-,-)");
		mav=new ModelAndView();
		mav.setViewName("user");
		mav.addObject("operationMsg","find");
		mav.addObject("cmdData",cmd);
	   return mav;	
	}
	public  ModelAndView invalid(HttpServletRequest req,HttpServletResponse res,UserCommand cmd){
		ModelAndView mav=null;
		System.out.println("UserCurdOperationsController.invalid(-,-,-)");
		mav=new ModelAndView();
		mav.setViewName("user");
		mav.addObject("operationMsg","invalid");
		mav.addObject("cmdData",cmd);
	   return mav;	
	}

}
