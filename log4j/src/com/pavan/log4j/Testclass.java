package com.pavan.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Testclass {
static  Logger logger = Logger.getLogger(Testclass.class);

	public static void main(String[] args) {
	
	PropertyConfigurator.configure("log4j.properties");
	logger.debug("this is the debug by log4j");
	logger.info("this is the info message");
	logger.warn("this is the warn message");
	logger.fatal("this is the fatal message");
	
	}
}
