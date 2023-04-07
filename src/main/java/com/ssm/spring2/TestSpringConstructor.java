package com.ssm.spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringConstructor {

	public static void main(String[] args) {
	
		//初始化Spring容器，加载applicationContext.xml文件
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过容器获取配置中的adminInfo的实例
//		AdminInfo adminInfo= (AdminInfo) ctx.getBean("adminInfo");
//		System.out.println(adminInfo);
//		adminInfo.print();
		//通过容器获取配置中的adminInfo的实例
		AdminInfo admin= (AdminInfo) ctx.getBean("admin");
		System.out.println(admin);
		admin.print();
	}

}
