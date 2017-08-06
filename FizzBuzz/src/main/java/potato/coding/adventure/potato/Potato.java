/**
 * 
 */
package potato.coding.adventure.potato;

import potato.coding.adventure.fizzBuzz.FizzBuzz;

/**
 * @author aga
 *
 */
public class Potato {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FizzBuzz fizzBuzz = new FizzBuzz();
		int startNumber = 8;
		int lastNumber = 18;
		System.out.println("Print from " + startNumber + " to " + lastNumber);
		fizzBuzz.print(startNumber, lastNumber);
		System.out.println();
		System.out.println("Print from 0 to " + lastNumber);
		fizzBuzz.printFromZero(lastNumber);
	}

}
