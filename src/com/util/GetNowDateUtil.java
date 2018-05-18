package com.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetNowDateUtil {
	
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
	
	public static java.sql.Date getDate(){
		
		Date date = new Date();
		java.sql.Date sqldate =new java.sql.Date(date.getYear(), date.getMonth(), date.getDate());
		return sqldate;
	}
	
	
}
