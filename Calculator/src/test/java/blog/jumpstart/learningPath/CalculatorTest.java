package blog.jumpstart.learningPath;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void sum() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(3, calculator.add(1, 2));
	}

	@Test
	public void difference() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(3, calculator.subtract(5, 2));
	}

	@Test
	public void product() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(10, calculator.multiply(5, 2));
	}

	@Test
	public void quotient() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(3, calculator.divide(6, 2));
	}

	@Test
	public void remainder() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(1, calculator.modulo(7, 2));
	}

	@Test
	public void power() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(8, calculator.power(2, 3));
	}

}
