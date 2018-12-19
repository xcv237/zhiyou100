package com.zhiyou100.login4;


import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;
import lombok.Setter;

public class LoginAction extends ActionSupport{
	@Setter
	@Getter
	private User[] list= {null,null};
	@Override
	public String execute() throws Exception {
		System.out.println(list[0]);
		return NONE;
	}
}



