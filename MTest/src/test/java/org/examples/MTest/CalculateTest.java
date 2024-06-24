package org.examples.MTest;

import org.junit.Before;
import org.junit.Test;

public class CalculateTest {

	Calculate cal;
	
	@Before
	public void setUp() {
		cal = new Calculate();
	}
	
	@Test
	public void test1Test() {
		float price = cal.test1(10,10);
		assert price == 210;
		System.out.println("购买了10斤苹果和10斤草莓价格:"+price);// 购买了10斤苹果和10斤草莓价格
	}
	
	@Test
	public void test2Test1() {
		float price = cal.test2(10,10,10,false);
		assert price == 410;
		System.out.println("购买了10斤苹果和10斤草莓和10斤芒果价格:"+price);// 购买了10斤苹果和10斤草莓价格和10斤芒果价格
	}
	
	@Test
	public void test2Test2() {
		float price = cal.test2(10,10,10,true);
		assert price == 384;
		System.out.println("购买了10斤苹果和10斤草莓（打八折）和10斤芒果价格:"+price);// 购买了10斤苹果和10斤草莓（打八折）价格和10斤芒果价格
		
	}
	
	@Test
	public void test3Test() {
		float price = cal.test3(10,10,10);
		assert price == 370;
		System.out.println("购买了10斤苹果和10斤草莓和10斤芒果价格(购物满 100 减 10 块):"+price);// 购买了10斤苹果和10斤草莓价格和10斤芒果价格(购物满 100 减 10 块)
		
		
	}
}
