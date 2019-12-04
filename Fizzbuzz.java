
/*
 * Fizzbuzz is a common coding interview question 
 * Below is a very basic solution to solve the commonly asked Fizzbuzz solution
 */

public class FizzBuzz {
	
	public static void main(String[] args) {
		 
		fizzBuzzMethod(35);
		System.out.println("---------");
		fizzBuzzMethodList();
		
		}
	
	public static void fizzBuzzMethod (int i) {
	
	    if (((i % 5) == 0) && ((i % 7) == 0)) // Multiple of 5 & 7
	        System.out.println("fizzbuzz");
	    else if ((i % 5) == 0) // Only a multiple of 5
	        System.out.println("fizz");
	    else if ((i % 7) == 0) // Only a multiple of 7?
	        System.out.println("buzz");
	    else
	        System.out.println("N/A"); // Not a multiple of 5 or 7
	}
	
	public static void fizzBuzzMethodList () {
		
		 {
			 for (int i = 0; i <= 100; i++) 
			 {
				 if (((i % 5) == 0) && ((i % 7) == 0)) // Multiple of 5 & 7
					 System.out.println("fizzbuzz");
				 else if ((i % 5) == 0) // Only a multiple of 5
					 System.out.println("fizz");
				 else if ((i % 7) == 0) // Only a multiple of 7
					 System.out.println("buzz");
				 else
					 System.out.println(i); // Not a multiple of 5 or 7
		        }
		    }
	}
	
}
		 

