package com.orchestrator.service;

public class FormatString 
{
	public static String format(String value) {
		
		int len = value.length();
		String endStr = value.substring(len-2, len);
		if(endStr.equals(".0")) {
			return value.substring(0, len-2);
		}
		
		return value;
	}

}
