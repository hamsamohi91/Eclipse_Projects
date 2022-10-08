package com.logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Config {

	public static Logger log = Logger.getLogger(Basic_Config.class);
	
	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		
		log.debug("Debug");	
		log.info("Information");
		log.warn("Warning");
		log.error("Error");
		log.fatal("Fatal");
		
	}
	
	
}
