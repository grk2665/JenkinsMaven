package com.emids.jenkinsMaven;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorldMavenTest {
	
	
	@Test
	public void testGetToday() {
		String actual = HelloWorldMaven.getToday();
		String expected = new SimpleDateFormat("dd-mmm-yyyy").format(new Date());
		assertEquals(expected,actual);
	}

}
