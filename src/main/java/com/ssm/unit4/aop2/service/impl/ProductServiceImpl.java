package com.ssm.unit4.aop2.service.impl;

import com.ssm.unit4.aop2.service.IProductService;
import org.springframework.stereotype.Component;

@Component("productService")
public class ProductServiceImpl implements IProductService {
	// 实现方法browse，模拟用户浏览商品

	public void browse(String loginName, String productName) {
		System.out.println("执行业务方法browse…");
		//演示异常通知时，手动人为抛出异常
//		throw new RuntimeException("这是特意手动抛出的异常信息！");
		int i=100000000;
		while(i>0) {
			i--;
		}
	}

}
