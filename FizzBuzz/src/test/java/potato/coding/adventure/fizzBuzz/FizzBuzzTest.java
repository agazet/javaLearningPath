package potato.coding.adventure.fizzBuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
	
	FizzBuzz fizzBuzz = new FizzBuzz();
	
	@Test
	public void fizz() {
		Assert.assertEquals("Fizz", fizzBuzz.fizzOrBuzz(9));
	}
	
	@Test
	public void buzz() {
		Assert.assertEquals("Buzz", fizzBuzz.fizzOrBuzz(10));
	}
	
	@Test
	public void fizzBuzz() {
		Assert.assertEquals("FizzBuzz", fizzBuzz.fizzOrBuzz(30));
	}
	
	@Test
	public void number() {
		Assert.assertEquals("11", fizzBuzz.fizzOrBuzz(11));
	}

}
