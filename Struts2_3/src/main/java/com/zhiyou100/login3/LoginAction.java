package com.zhiyou100.login3;

import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class LoginAction extends ActionSupport{
	private User u;
/*	public void setU(User u) {
		this.u = u;
	}*/
	@Override
	public String execute() throws Exception {
		System.out.println(u);
		return NONE;
	}

}
