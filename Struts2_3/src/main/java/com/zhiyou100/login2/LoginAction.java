package com.zhiyou100.login2;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User>{
	private User u= new User();
	public User getModel() {
		return u;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println(u);
		return NONE;
	}
}
