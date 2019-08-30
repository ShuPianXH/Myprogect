package com.woniuxy.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniuxy.mapper.UserinfoMapper;
import com.woniuxy.pojo.Userinfo;
import com.woniuxy.service.IUserinfoService;

@Service
public class UserinfoServiceImpl implements IUserinfoService {
	
	@Resource
	private UserinfoMapper userinfoMapper;

	@Override
	public Userinfo login(Userinfo user) {
		
		return userinfoMapper.login(user);
	}

}
