package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
	private StudentDAO dao;
	
	public StudentServiceImpl(StudentDAO dao) {
		this.dao = dao;
	}
	

	@Override
	public List<StudentDTO> getAllStudents() {
		List<StudentDTO>listDTO=new ArrayList();
		List<StudentBO> listBO=null;
		//use DAO
		listBO=dao.fetchAllStudents();
		//convert listBO to listDTO
		listBO.forEach(bo->{
			StudentDTO dto=new StudentDTO();
			BeanUtils.copyProperties(bo,dto);
			dto.setSrNo(listDTO.size()+1);
			listDTO.add(dto);
		});
		return listDTO;
	}//forEach()


	@Override
	public StudentDTO getStudentBySno(int sno) {
		StudentBO bo=null;
		StudentDTO dto=null;
		//use DAO
		bo=dao.fetchStudentBySno(sno);
		//copy BO to DTO
		dto=new StudentDTO();
		BeanUtils.copyProperties(bo,dto);
		return dto;
	}//method
	
	@Override
	public String modifyStudentBySno(StudentDTO dto) {
		int count=0;
		StudentBO bo=null;
		//convert DTO to BO
		bo=new StudentBO();
		BeanUtils.copyProperties(dto, bo);
		//use DAO
		count=dao.updateStudentbySno(bo);
		if(count==0)
			return "Student Details not modified";
		else
			return "Student Details are modified";
	}//method
	
	@Override
	public String removeStudentBySno(int sno) {
		int count=0;
		count=dao.deleteStudentBySno(sno);
		if(count==0)
		  return "Student not Deleted";
		else
			return "Student Deleted";
	}
	
}//class
