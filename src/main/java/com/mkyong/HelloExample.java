package com.mkyong;

import org.apache.log4j.Logger;

public class HelloExample{
	
	final static Logger logger = Logger.getLogger(HelloExample.class);
	
	public static void main(String[] args) {
	
		HelloExample obj = new HelloExample();
		try {
			obj.runMe("mkyong");
			System.out.println("-------------Another");
			obj.processing(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void processing(int i) throws InterruptedException {
		for (int val = 0; val < i; val++)
		{
			logger.debug("test Value is : " + val);
			Thread.sleep(2000);
		}
	}

	private void runMe(String parameter) throws InterruptedException{
		
		if(logger.isDebugEnabled()){
			logger.debug("This is debug : " + parameter);
		}
		
		if(logger.isInfoEnabled()){
			logger.info("This is info : " + parameter);
		}
		
		logger.warn("This is warn 1: " + parameter);
		logger.error("This is error 1: " + parameter);
		logger.fatal("This is fatal 1: " + parameter);
		logger.debug("This is debug 1: " + parameter);
		logger.info("This is info : 1" + parameter);
		Thread.sleep(10000);
		
	}
	
}