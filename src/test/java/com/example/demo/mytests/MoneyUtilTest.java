package com.example.demo.mytests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.example.demo.MoneyUtil;

class MoneyUtilTest {

	@Test
	void test1000Dollar() {
		String salary = MoneyUtil.format(1000,"$");
		
		assertEquals("$1000.00", salary);		
	}
	
	@Test
	void test545Euros() {
		String salary = MoneyUtil.format(545,"€");
		
		assertEquals("€545.00", salary);		
	}
	
	@Test
	void testSymbolVazio() {
		Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
			
			@Override
			public void execute() throws Throwable {
				// TODO Auto-generated method stub
				MoneyUtil.format(545,"");
			}
		});
	}
	
	@Test
	void test1000DollarNegativo() {
		String salary = MoneyUtil.format(-1000,"$");
		
		assertEquals("-$1000.00", salary);		
	}
	
	@Test
	void test1000_35DollarNegativo() {
		String salary = MoneyUtil.format(-1000.35,"$");
		
		assertEquals("-$1000.35", salary);		
	}

}
