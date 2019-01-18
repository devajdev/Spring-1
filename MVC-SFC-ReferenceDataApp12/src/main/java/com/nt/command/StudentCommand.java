package com.nt.command;

import java.util.Arrays;

public class StudentCommand {
	private String sname;
	private String sadd;
	private  String courses[];
	private String gender;
	private String qlfy;
	private String hobies[];
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getQlfy() {
		return qlfy;
	}
	public void setQlfy(String qlfy) {
		this.qlfy = qlfy;
	}
	public String[] getHobies() {
		return hobies;
	}
	public void setHobies(String[] hobies) {
		this.hobies = hobies;
	}
	@Override
	public String toString() {
		return "StudentCommand [sname=" + sname + ", sadd=" + sadd + ", courses=" + Arrays.toString(courses)
				+ ", gender=" + gender + ", qlfy=" + qlfy + ", hobies=" + Arrays.toString(hobies) + "]";
	}
	
	

}
