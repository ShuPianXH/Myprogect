package com.woniuxy.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniuxy.pojo.Userinfo;
import com.woniuxy.service.IUserinfoService;

@Controller
public class LoginController {

	@Resource
	private IUserinfoService userinfoServiceImpl;
	
	@RequestMapping("/finduser")
	private String login(String uname,String upass,ModelMap map) {
		Userinfo users = userinfoServiceImpl.login(uname);
		if(users.getUpass().equals(upass)) {
			
		}
		return null;
		
	}
}
