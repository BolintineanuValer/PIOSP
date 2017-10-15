package org.piosplab1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {
	private Calculator calculator=new Calculator();

	@Test
	public void test_add() {
		double test_add1=calculator.add(2, 3);
		double test_add2=calculator.add(-10, -7);
		double test_add3=calculator.add(1, -3);
		double test_add4=calculator.add(-2, 31);
		double test_add5=calculator.add(-10, 10);
		double test_add6=calculator.add(0, 0);
		assertEquals(5,test_add1,0.00000000001);
		assertEquals(-17,test_add2,0.00000000001);
		assertEquals(-2,test_add3,0.00000000001);
		assertEquals(29,test_add4,0.00000000001);
		assertEquals(0,test_add5,0.00000000001);
		assertEquals(0,test_add6,0.00000000001);
		System.out.println("Tests passed --- add()");
	}
	@Test
	public void test_sub(){
		double test_sub1=calculator.sub(2, 3);
		double test_sub2=calculator.sub(-10, -7);
		double test_sub3=calculator.sub(1, -3);
		double test_sub4=calculator.sub(-31, 31);
		double test_sub5=calculator.sub(10, 10);
		double test_sub6=calculator.sub(0, 0);
		assertEquals(-1,test_sub1,0.00000000001);
		assertEquals(-3,test_sub2,0.00000000001);
		assertEquals(4,test_sub3,0.00000000001);
		assertEquals(-62,test_sub4,0.00000000001);
		assertEquals(0,test_sub5,0.00000000001);
		assertEquals(0,test_sub6,0.00000000001);
		System.out.println("Tests passed --- sub()");
	}
	@Test
	public void test_mul(){
		double test_mul1=calculator.mul(2, 3);
		double test_mul2=calculator.mul(-10, -7);
		double test_mul3=calculator.mul(1, -3);
		double test_mul4=calculator.mul(-2, 31);
		double test_mul5=calculator.mul(-10, 0);
		double test_mul6=calculator.mul(0, 0);
		assertEquals(6,test_mul1,0.00000000001);
		assertEquals(70,test_mul2,0.00000000001);
		assertEquals(-3,test_mul3,0.00000000001);
		assertEquals(-62,test_mul4,0.00000000001);
		assertEquals(0,test_mul5,0.00000000001);
		assertEquals(0,test_mul6,0.00000000001);
		System.out.println("Tests passed --- mul()");
	}
	@Test
	public void test_div(){
		double test_div1=calculator.div(2, 3);
		double test_div2=calculator.div(-14, -7);
		double test_div3=calculator.div(1, -3);
		double test_div4=calculator.div(1, 1);
		double test_div5=calculator.div(0, 10);
		assertEquals(2.0/3.0,test_div1,0.00000000001);
		assertEquals(2,test_div2,0.00000000001);
		assertEquals(-1.0/3.0,test_div3,0.00000000001);
		assertEquals(1,test_div4,0.00000000001);
		assertEquals(0,test_div5,0.00000000001);
		try {
			double test_div6=calculator.div(0, 0);
			assertEquals(0,test_div6,0.00000000001);
		    Assert.fail( "Should have thrown an exception" );
		} 
		catch (Exception e) {
		    String expectedMessage = "Can't divide by zero 0";
		    Assert.assertEquals( "Exception message must be correct", expectedMessage, e.getMessage());
		}
		System.out.println("Tests passed --- div()");
	}
	@Test
	public void test_min(){
		double test_min1=calculator.min(2, 3);
		double test_min2=calculator.min(-10, -7);
		double test_min3=calculator.min(1, -3);
		double test_min4=calculator.min(-2, 31);
		double test_min5=calculator.min(-10, 0);
		double test_min6=calculator.min(0, 0);
		assertEquals(2,test_min1,0.00000000001);
		assertEquals(-10,test_min2,0.00000000001);
		assertEquals(-3,test_min3,0.00000000001);
		assertEquals(-2,test_min4,0.00000000001);
		assertEquals(-10,test_min5,0.00000000001);
		assertEquals(0,test_min6,0.00000000001);
		System.out.println("Tests passed --- min()");
	}
	@Test
	public void test_max(){
		double test_max1=calculator.max(2, 3);
		double test_max2=calculator.max(-10, -7);
		double test_max3=calculator.max(1, -3);
		double test_max4=calculator.max(-2, 31);
		double test_max5=calculator.max(-10, 0);
		double test_max6=calculator.max(0, 0);
		assertEquals(3,test_max1,0.00000000001);
		assertEquals(-7,test_max2,0.00000000001);
		assertEquals(1,test_max3,0.00000000001);
		assertEquals(31,test_max4,0.00000000001);
		assertEquals(0,test_max5,0.00000000001);
		assertEquals(0,test_max6,0.00000000001);
		System.out.println("Tests passed --- max()");
		
	}
	@Test
	public void test_sqrt(){
		double test_sqrt1=calculator.sqrt(2);
		double test_sqrt2=calculator.sqrt(4);
		double test_sqrt3=calculator.sqrt(1);
		double test_sqrt4=calculator.sqrt(31);
		double test_sqrt5=calculator.sqrt(0);
		assertEquals(Math.sqrt(2),test_sqrt1,0.00000000001);
		assertEquals(2,test_sqrt2,0.00000000001);
		assertEquals(1,test_sqrt3,0.00000000001);
		assertEquals(Math.sqrt(31),test_sqrt4,0.00000000001);
		assertEquals(0,test_sqrt5,0.00000000001);
		try {
			double test_sqrt6=calculator.sqrt(-3);
			assertEquals(0,test_sqrt6,0.00000000001);
		    Assert.fail( "Should have thrown an exception" );
		} 
		catch (Exception e) {
		    String expectedMessage = "Can't take the square root of a negative number";
		    Assert.assertEquals( "Exception message must be correct", expectedMessage, e.getMessage());
		}
		System.out.println("Tests passed --- sqrt()");
	}
}
