package com.zhiyou100.invocation;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	@Override
	public String execute() throws Exception {
		System.out.println("UserAction");
		return NONE;
	}
}
