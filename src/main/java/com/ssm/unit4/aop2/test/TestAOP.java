package com.ssm.unit4.aop2.test;

import com.ssm.unit4.aop2.service.IProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestAOP {

	public static void main(String[] args) {
		//初始化Spring容器，加载applicationContext.xml文件
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过容器获取配置中的productService的实例
		IProductService productService=(IProductService) ctx.getBean("productService");
		//调用productService中的browse方法
		productService.browse("张三", "联想天逸310");
	}

}
