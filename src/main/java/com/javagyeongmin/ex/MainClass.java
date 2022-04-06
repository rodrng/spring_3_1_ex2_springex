package com.javagyeongmin.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyCalculator myCalculator = new MyCalculator();
//		myCalculator.setCaluator(new Calculator());
		
//		myCalculator.setFirstNum(10);
//		myCalculator.setSecondNum(20);
//		
//		myCalculator.add();
//		myCalculator.sub();
//		myCalculator.mul();
//		myCalculator.div();
		
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		MyCalculator myCalculator = ctx.getBean("mycalculator", MyCalculator.class);
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();
		myCalculator.div();
		
		ctx.close();
		
	}

}