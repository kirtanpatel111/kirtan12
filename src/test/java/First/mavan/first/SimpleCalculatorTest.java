package First.mavan.first;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class SimpleCalculatorTest {

	@Test
	void test() {
		SimpleCalculator calculator = new SimpleCalculator();
		assertEquals(4,calculator.add(2, 2));
		System.out.println("Addition of two number is" + " " + calculator.add(2, 2));
	}
	
	@Test
	void test1() {
		SimpleCalculator calculator = new SimpleCalculator();
		assertEquals(0,calculator.sub(2, 2));
		System.out.println("Substraction of two number is" + " " + calculator.sub(2, 2));
	}
	
	@Test
	void test2() {
		SimpleCalculator calculator = new SimpleCalculator();
		assertEquals(16,calculator.mul(8, 2));
		System.out.println("Multiplication of two number is" + " " + calculator.mul(8, 2));
	}

	@Test
	void test3() {
		SimpleCalculator calculator = new SimpleCalculator();
		assertEquals(3,calculator.div(6, 2));
		System.out.println("Division of two number is" + " " + calculator.div(6, 2));
	}

	
}
