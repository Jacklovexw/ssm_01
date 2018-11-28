package com.zhidi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhidi.base.dao.IBaseDao;
import com.zhidi.base.service.BaseServiceImpl;
import com.zhidi.dao.UserMapper;
import com.zhidi.entity.User;
import com.zhidi.service.IUserService;
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		setBaseDao(userMapper);
	}
}
