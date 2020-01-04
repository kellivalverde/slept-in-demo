
public class SleepIn {

	public static void main(String[] args) {
		/*
		/* CodingBat practice
		 * 
		 * The parameter weekday is true if it is a weekday, 
		 *
		 * and the parameter vacation is true if we are on vacation. 
		 * We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
		 */

		// sleepIn(false, false) → true
		// sleepIn(true, false) → false
		
		boolean sleptIn = sleepIn(true, true);
		System.out.println(sleptIn);  //expect true
		sleptIn = sleepIn(true,false);
		System.out.println(sleptIn);
		sleptIn = sleepIn(false,false);
		System.out.println(sleptIn);
			
	}
	
	public static boolean sleepIn(boolean weekday, boolean vacation) {
	
		if (weekday != true || vacation == true) {
		return(true);
	}
		return(false);
	}
	
	
}
