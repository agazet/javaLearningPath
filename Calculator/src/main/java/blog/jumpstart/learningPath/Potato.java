/**
 * 
 */
package blog.jumpstart.learningPath;

/**
 * @author azaboklicka
 *
 */
public class Potato {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Calculator calculator = takeCalculator();
		
		int sum = calculator.add(1, 2);

		sayCalculationResult(sum);

	}
	
	static Calculator takeCalculator(){
		return new Calculator();
	}
	
	static void sayCalculationResult(int whatPotatoCalculated){
		System.out.println("The calculation I did gives back: " + whatPotatoCalculated);
	}

}
