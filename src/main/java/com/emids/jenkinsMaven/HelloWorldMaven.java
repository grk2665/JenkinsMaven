package com.emids.jenkinsMaven;

import java.util.Date;
import org.apache.commons.lang.time.DateFormatUtils;

public class HelloWorldMaven {

		public static void main(String[] args) {
			System.out.println("Hello Wold from Maven.....Today is :  " + getToday());
		}
		
		public static String getToday() {
			String today = DateFormatUtils.format(new Date(), "dd-MMM-yyyy");
			return today;
		}

	}



