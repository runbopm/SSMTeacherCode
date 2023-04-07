package com.ssm.spring3.dao.impl;

import com.ssm.spring2.dao.UserDAO;
import org.springframework.stereotype.Repository;

@Repository("userDAO3")
public class UserDAOImpl implements UserDAO {

	
	public boolean login(String loginName, String loginPwd) {
		if (loginName.equals("admin")&&loginPwd.equals("123456")) {
			return true;
		}
		return false;
	}

}
