package com.woniuxy.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniuxy.pojo.Userinfo;
import com.woniuxy.service.IUserinfoService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping("/Login/")
public class LoginController {

	@Resource
	private IUserinfoService userinfoServiceImpl;
	
	@RequestMapping("finduser")
	private @ResponseBody String login(@RequestParam("username") String uname, @RequestParam("password") String upass, HttpServletRequest request) {
		Userinfo users = userinfoServiceImpl.login(uname);
		if(users==null) {
			//账号不正确
			return "0";
		}else if (upass.equals(users.getUpass())){
			//密码正确
			HttpSession session = request.getSession();
			session.setAttribute("uName",users.getUname());
			return "1";
		}
		//密码不正确
		return "2";
	}
	@RequestMapping("getName")
	private void getName(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String uName = (String) request.getSession().getAttribute("uName");
		request.getSession().setAttribute("LoginUser",uName);
		PrintWriter out = response.getWriter();
		out.write(uName);
		out.flush();
		out.close();
	}
}
