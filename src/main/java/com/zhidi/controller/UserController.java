package com.zhidi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhidi.entity.User;
import com.zhidi.service.IUserService;
import com.zhidi.service.impl.UserServiceImpl;

@Controller
public class UserController {
	
	@Autowired
	private IUserService userService;
	@ResponseBody
	@RequestMapping("/user")
	public User index(){
		User user = userService.selectByPrimaryKey(1L);
		return user;
	}

}
