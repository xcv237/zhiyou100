package com.zhiyou100.invocation;

import java.util.Arrays;
import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import lombok.Setter;
@Setter
public class LoginInvocation extends AbstractInterceptor{
	private String n;
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		if(Arrays.asList(n).contains("user")){
			return invocation.invoke();
		}
		/*if(n.equals(invocation.getProxy().getActionName())){
			return invocation.invoke();
		}	*/	
		System.out.println(invocation.getProxy().getActionName());
		Map<String, Object> session = invocation.getInvocationContext().getSession();
		Object user = session.get("user");
		if(user==null){
			return "login";//逻辑视图名称（ps：必须有对应物理视图名称）
		}
		return invocation.invoke();
	}
	

}
