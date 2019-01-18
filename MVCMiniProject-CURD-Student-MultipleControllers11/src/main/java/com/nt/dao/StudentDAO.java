package com.nt.dao;

import java.util.List;

import com.nt.bo.StudentBO;

public interface StudentDAO {
	public   List<StudentBO> fetchAllStudents();
	public   StudentBO fetchStudentBySno(int sno);
	public  int updateStudentbySno(StudentBO bo);
	public  int deleteStudentBySno(int sno);

}
