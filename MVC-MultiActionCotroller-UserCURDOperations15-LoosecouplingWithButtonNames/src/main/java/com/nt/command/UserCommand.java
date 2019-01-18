package com.nt.command;

public class UserCommand {
	private int userId;
	private String userName;
	private String userAddrs;
	private String userEmail;
	
	public UserCommand() {
		System.out.println("UserCommand.0-param constructor");
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAddrs() {
		return userAddrs;
	}

	public void setUserAddrs(String userAddrs) {
		this.userAddrs = userAddrs;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Override
	public String toString() {
		return "UserCommand [userId=" + userId + ", userName=" + userName + ", userAddrs=" + userAddrs + ", userEmail="
				+ userEmail + "]";
	}
	
	

}
