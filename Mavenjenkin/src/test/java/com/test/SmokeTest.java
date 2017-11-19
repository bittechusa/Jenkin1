package com.test;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Test;

public class SmokeTest
{

	@Test
	public void m1()
	{
		DOMConfigurator.configure("log4j.xml");
		Logger log=Logger.getLogger(SmokeTest.class);
		log.fatal("this is fatal");
		log.error("this is error");
		log.warn("this is warn");
		log.info("this is info");
		log.debug("this is debug");
		log.trace("this is trace");
	}
}
