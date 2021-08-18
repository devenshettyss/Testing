package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
//3 A's to follow before running tests:- Arrange,Act,Assert

	Calculator calculator; //arrange

	@BeforeEach	//executes before each @Test method
	void init() {
		calculator = new Calculator(); //initializing for all methods by coding only once
	}

	@Test
	void testAdd() {
		int result = calculator.add(1, 3); // act
		assertEquals(4, result, "Test Failed");
	}

	@Test
	void testAddNegative() {
		int result = calculator.add(-1, -2); // act
		assertEquals(-3, result, "Test Failed");
	}

	@Test
	void testAddFloat() {
		float result = calculator.add(4.7f, 1.8f); // act
		assertEquals(6.5, result, 0.01);
	}

	@Test
	void testAddNegativeFloat() {
		float result = calculator.add(-3.2f, -3.1f); // act
		assertEquals(-6.3, result, 0.099999904632569);
	}

	@Test
	void divide() {
		float result = calculator.divide(5, 2); // act
		assertEquals(2.5, result);
	}

	@Test
	void divideWhenDenominatorIsZero() {
		try {
			calculator.divide(1, 0); // act
		} catch (Exception e) {
			assertNotNull(e);
			assertEquals(ArithmeticException.class, e.getClass());
		}
	}
}
