package com.ssm.spring2.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssm.spring2.service.UserService;


public class TestSpringDI {

	public static void main(String[] args) {
		//初始化Spring容器，加载applicationContext.xml文件
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取UserServiceImpl中的实例
		UserService userService=(UserService)ctx.getBean("userService");
		boolean flag=userService.login("admin", "123456");
		if (flag) {
			System.out.println("登录成功！");
		}else {
			System.out.println("登录失败！");
		}

		
	}

}
