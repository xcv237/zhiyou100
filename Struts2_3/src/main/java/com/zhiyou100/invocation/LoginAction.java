package com.zhiyou100.invocation;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class LoginAction extends ActionSupport{
	private User u;
	@Override
	public String execute() throws Exception {
		
		if(u!=null){
			System.out.println("³É¹¦");
			ActionContext.getContext().getSession().put("user", u.getUsername());
			return SUCCESS;
		}
		System.out.println("Ê§°Ü");
		return "login";
	}
}
