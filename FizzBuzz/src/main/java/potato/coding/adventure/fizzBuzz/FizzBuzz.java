/**
 * 
 */
package potato.coding.adventure.fizzBuzz;

/**
 * @author aga
 *
 */
public class FizzBuzz {
	
	public void print(int startNumber, int lastNumber) {
		for (int i=startNumber; i<= lastNumber; i++) {
			System.out.print(fizzOrBuzz(i) + " ");
		}
	}

	public String fizzOrBuzz(int number) {
		
		if(number%3==0 && number%5!=0) {
			return "Fizz";
		} else if(number%5==0 && number%3!=0) {
			return "Buzz";
		} else if(number%15==0) {
			return "FizzBuzz";
		} else {
			return Integer.toString(number);
		}
		
	}
	
	public void printFromZero(int lastNumber) {
		int startNumber = 0;
		while (startNumber < lastNumber) {
			
			if(startNumber%15==0) {
				System.out.println("FizzBuzz");
			} else if(startNumber%3==0) {
				System.out.println("Fizz");
			} else if(startNumber%5==0) {
				System.out.println("Buzz");
			} else {
				System.out.println(startNumber);
			}
			startNumber++;
		}
	}

}
