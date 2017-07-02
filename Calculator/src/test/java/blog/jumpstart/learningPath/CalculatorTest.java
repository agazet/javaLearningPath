package blog.jumpstart.learningPath;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void sum() {
		Assert.assertEquals(3, (new Calculator()).add(1, 2));
	}

	@Test
	public void difference() {
		Assert.assertEquals(3, (new Calculator()).subtract(5, 2));
	}

	@Test
	public void product() {
		Assert.assertEquals(10, (new Calculator()).multiply(5, 2));
	}

	@Test
	public void quotient() {
		Assert.assertEquals(3, (new Calculator()).divide(6, 2));
	}

	@Test
	public void remainder() {
		Assert.assertEquals(1, (new Calculator()).modulo(7, 2));
	}

	@Test
	public void power() {
		Assert.assertEquals(8, (new Calculator()).modulo(2, 3));
	}

}
