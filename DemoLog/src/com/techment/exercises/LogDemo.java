package com.techment.exercises;

	import org.apache.log4j.Logger;

	public class LogDemo {
		static Logger logger=Logger.getLogger(LogDemo.class);
		public static void main(String[] args) {
			logger.debug("this is debug message");
			logger.info("this is info message");
			logger.error("this is error message");
			logger.fatal("this is fatal message");
			// TODO Auto-generated method stub

		}
		
	}

