package com.ssm.spring3.service.impl;

import com.ssm.spring2.dao.UserDAO;
import com.ssm.spring2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService3")
public class UserServiceImpl implements UserService {
	
	//使用接口UserDAO声明对象，添加相应的setter方法，用于依赖注入
	@Autowired
	UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	//实现接口中的login方法

	public boolean login(String loginName, String loginPwd) {
		return userDAO.login(loginName, loginPwd);
	}

}
