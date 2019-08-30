package com.woniuxy.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniuxy.pojo.Userinfo;
import com.woniuxy.service.IUserinfoService;

@Controller
@RequestMapping("/pages")
public class LoginController {

	@Resource
	private IUserinfoService userinfoServiceImpl;
	
	@RequestMapping("/finduser")
	private String login(Userinfo user,ModelMap map) {
		Userinfo users = userinfoServiceImpl.login(user);
		if(users!=null) {
			map.put("users", user);
			return "index";
		}else {
			return "/pages/login";
		}
	}
}
