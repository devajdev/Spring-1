package com.nt.command;

import java.util.Date;

public class EmployeeCommand {
	private String empName;
	private String empAddrs;
	private  Date dob;
	private  Date doj;
	private  Date dom;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddrs() {
		return empAddrs;
	}
	public void setEmpAddrs(String empAddrs) {
		this.empAddrs = empAddrs;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public Date getDom() {
		return dom;
	}
	public void setDom(Date dom) {
		this.dom = dom;
	}
	@Override
	public String toString() {
		return "EmployeeCommand [empName=" + empName + ", empAddrs=" + empAddrs + ", dob=" + dob + ", doj=" + doj
				+ ", dom=" + dom + "]";
	}
	
	

}
