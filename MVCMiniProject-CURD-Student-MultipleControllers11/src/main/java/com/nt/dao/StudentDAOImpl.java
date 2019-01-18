package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.nt.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	private static  final String GET_ALL_STUDENTS="SELECT SNO,SNAME,COURSE,SADD,PERCENTAGE FROM MVC_STUDENT";
	private static final String GET_STUDENT_BY_SNO="SELECT SNO,SNAME,COURSE,SADD,PERCENTAGE FROM MVC_STUDENT WHERE SNO=?";
	private static final String  UPDATE_STUDENT_BY_SNO="UPDATE MVC_STUDENT SET SNAME=?,SADD=?,COURSE=?,PERCENTAGE=? WHERE SNO=?";
	private static final String  DELETE_STUDENT_BY_SNO="DELETE FROM MVC_STUDENT WHERE SNO=?";

	private JdbcTemplate jt;

	public StudentDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	/*@Override
	public List<StudentBO> fetchAllStudents() {
		List<StudentBO>  listBO=null;
		listBO=jt.query(GET_ALL_STUDENTS,
				                      new ResultSetExtractor<List<StudentBO>>(){

										@Override
										public List<StudentBO> extractData(ResultSet rs)
												throws SQLException, DataAccessException {
											List<StudentBO> listBO=null;
											StudentBO bo=null;
											//Copy ResultSet obj records of ListBO 
											listBO=new ArrayList();
											while(rs.next()){
												//copy each record to BO class obj
												bo=new StudentBO();
												bo.setSno(rs.getInt(1));
												bo.setSname(rs.getString(2));
												bo.setCourse(rs.getString(3));
												bo.setSadd(rs.getString(4));
												bo.setPercentage(rs.getFloat(5));
												//add Each BO class obj listBO
												listBO.add(bo);
											}
											return listBO;
										}//method extractData(-)
		  }//annonymous inner class
		);//method call
		return listBO;
	}//method
*/

	@Override
	public List<StudentBO> fetchAllStudents() {
		List<StudentBO>  listBO1=null;
		listBO1=jt.query(GET_ALL_STUDENTS,rs->{
											List<StudentBO> listBO=null;
											StudentBO bo=null;
											//Copy ResultSet obj records of ListBO 
											listBO=new ArrayList();
											while(rs.next()){
												//copy each record to BO class obj
												bo=new StudentBO();
												bo.setSno(rs.getInt(1));
												bo.setSname(rs.getString(2));
												bo.setCourse(rs.getString(3));
												bo.setSadd(rs.getString(4));
												bo.setPercentage(rs.getFloat(5));
												//add Each BO class obj listBO
												listBO.add(bo);
											}
											return listBO;
										}//method extractData(-)
		);//method call
		return listBO1;
	}//method
	
	/*@Override
	public StudentBO fetchStudentBySno(int sno) {
		StudentBO bo=null;
		bo=jt.queryForObject(GET_STUDENT_BY_SNO, new RowMapper<StudentBO>(){
			
			@Override
			public StudentBO mapRow(ResultSet rs, int rowNum) throws SQLException {
				StudentBO bo=null;
			   //copy ResultSet obj record to BO class obj
				bo=new StudentBO();
				bo.setSno(rs.getInt(1));
				bo.setSname(rs.getString(2));
				bo.setCourse(rs.getString(3));
				bo.setSadd(rs.getString(4));
				bo.setPercentage(rs.getFloat(5));
				return bo;
			}//mapRow(-,-)
		}, sno);
		return bo;
	}
*/
	
	@Override
	public StudentBO fetchStudentBySno(int sno) {
		StudentBO stBO=null;
		stBO=jt.queryForObject(GET_STUDENT_BY_SNO,( rs, rowNum)->{
				StudentBO bo=null;
			   //copy ResultSet obj record to BO class obj
				bo=new StudentBO();
				bo.setSno(rs.getInt(1));
				bo.setSname(rs.getString(2));
				bo.setCourse(rs.getString(3));
				bo.setSadd(rs.getString(4));
				bo.setPercentage(rs.getFloat(5));
				return bo;
			}//mapRow(-,-)
		, sno);
		return stBO;
	}//method
	
	@Override
	public int updateStudentbySno(StudentBO bo) {
		  int count=0;
		  count=jt.update(UPDATE_STUDENT_BY_SNO,bo.getSname(),bo.getSadd(),bo.getCourse(),bo.getPercentage(),bo.getSno());
		return count;
	}
	
	@Override
	public int deleteStudentBySno(int sno) {
		int count=0;
		count=jt.update(DELETE_STUDENT_BY_SNO, sno);
		return count;
	}
	
}//class
