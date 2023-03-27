package com.example.demo;

import java.math.BigDecimal;

public class MoneyUtil {
	public static String format(double salary, String symbol) throws IllegalArgumentException{	
		if(symbol==null || symbol.equals(""))
			throw new IllegalArgumentException();
		String result =  salary>0?
				symbol+BigDecimal.valueOf(salary).setScale(2,BigDecimal.ROUND_HALF_UP).toString():
					"-"+symbol+BigDecimal.valueOf(salary*(-1)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
		
		System.out.println(result);
		return result;
	}
}
