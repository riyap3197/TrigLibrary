package trig.main;

/**
 * Custom exception for invalid input, implemented
 * for positive and negative infinity
 *
 */
public class CustomException extends Exception {
	
	/**
	 * Constructor which prints the custom exception
	 * message.
	 */
	public CustomException()
	{
		System.out.println("Invalid input");
	}
	 
}
