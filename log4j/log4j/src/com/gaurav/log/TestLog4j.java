package com.gaurav.log;

import org.apache.log4j.Logger;

public class TestLog4j {
	private static final Logger log = Logger.getLogger(TestLog4j.class);

	public static void main(String[] args) {

		try {
			throw new Exception("New Exception");
		} catch (Exception e) {
			log.error(e, e);
		}
	}

}
	