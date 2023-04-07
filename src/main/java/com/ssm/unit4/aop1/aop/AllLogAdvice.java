package com.ssm.unit4.aop1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AllLogAdvice {
	// 此方法作为前置通知
	public void myBeforeAdvice(JoinPoint joinPoint) {
		// 获取业务方法参数
		Object[] args = joinPoint.getArgs();
		//日志格式的字符串
		String logInfoText="前置通知："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
			.format(new Date())+args[0].toString()+" 浏览商品 "+args[1].toString();
		//将日志信息输出到控制台
		System.out.println(logInfoText);
	}
	
	// 此方法作为返回通知
	public void myAfterReturnAdvice(JoinPoint joinPoint) {
		// 获取业务方法参数
		Object[] args = joinPoint.getArgs();
		//日志格式的字符串
		String logInfoText="返回通知："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
			.format(new Date())+" "+args[0].toString()+" 浏览商品 "+args[1].toString();
		//将日志信息输出到控制台
		System.out.println(logInfoText);
	}
	
	// 此方法作为异常通知
	public void myThrowingAdvice(JoinPoint joinPoint) {
		//获取被调用的类名
		String targetClassName=joinPoint.getTarget().getClass().getName();
		//获取被调用的方法名
		String targetMethodName=joinPoint.getSignature().getName();
		//日志格式的字符串
		String logInfoText="异常通知：执行"+targetClassName+"类中的"+targetMethodName+"方法时发生异常！";
		//将日志信息输出到控制台
		System.out.println(logInfoText);
	}
	
	// 此方法作为环绕通知
	public void myAroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		// 获取业务方法参数
		Object[] args = joinPoint.getArgs();
		//日志格式的字符串
		String logInfoText = "进入aop1方法之前："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
			.format(new Date())+args[0].toString()+" 浏览商品 "+args[1].toString();
		//将日志信息输出到控制台
		System.out.println(logInfoText);
		long beginTime = System.currentTimeMillis();
		joinPoint.proceed();
		long endTime = System.currentTimeMillis();
		//获取被调用的方法名
		String targetMethodName = joinPoint.getSignature().getName();
		//日志格式的字符串
		 logInfoText = "环绕通知："+targetMethodName+"方法调用前时间"+beginTime+"毫秒，"
				+"调用后的时间"+endTime+"毫秒。共执行了"+(endTime-beginTime)+"毫秒。";
		//将日志信息输出到控制台
		System.out.println(logInfoText);
	}	
	
		
}
