package com.ssm.unit4.aop1.service.impl;


import com.ssm.unit4.aop1.service.ProductService;

public class ProductServiceImpl implements ProductService {
	// 实现方法browse，模拟用户浏览商品
	
	public void browse(String loginName, String productName) {

		
		//业务逻辑
		System.out.println("Aop1执行业务方法browse…");

		int i=100000000;
		while(i>0) {
			i--;
		}

	}

}
