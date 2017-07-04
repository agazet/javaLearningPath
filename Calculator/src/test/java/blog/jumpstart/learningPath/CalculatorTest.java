package blog.jumpstart.learningPath;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	private static final Calculator CALCULATOR = new Calculator();

	@Test
	public void sum() {
		Assert.assertEquals(3, CALCULATOR.add(1, 2));
	}

	@Test
	public void difference() {
		Assert.assertEquals(3, CALCULATOR.subtract(5, 2));
	}

	@Test
	public void product() {
		Assert.assertEquals(10, CALCULATOR.multiply(5, 2));
	}

	@Test
	public void quotient() {
		Assert.assertEquals(3, CALCULATOR.divide(6, 2));
	}

	@Test
	public void remainder() {
		Assert.assertEquals(1, CALCULATOR.modulo(7, 2));
	}

	@Test
	public void power() {
		Assert.assertEquals(8, CALCULATOR.modulo(2, 3));
	}

}
