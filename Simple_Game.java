public class SimpleGame {

	/**
	 * Write a method to convert the given seconds to hours:minutes:seconds.
	 * @param seconds to convert
	 * @return string for the converted seconds in the format: 23:59:59
	 * 
	 * Example(s): 
	 * - If input seconds is 1432, print and return output in the format: 0:23:52
	 * - If input seconds is 0, print and return output in the format: 0:0:0
	 * - If input seconds is not valid (negative), print and return: -1:-1:-1.  
	 *   So if input seconds is -2, print and return: -1:-1:-1 
	 *   If input seconds is -3214, likewise print and return: -1:-1:-1
	 */
	public String convertTime(int seconds){
			if (seconds > -1){
				int hh = seconds / 3600;
				int mm = (seconds % 3600) / 60;
				int ss = seconds % 60;
				String result = ( hh+":"+ mm+":"+ ss);
				System.out.println(result);
				return result;
			}
			else {
				String result ="-1:-1:-1";
				System.out.println(result);
				return result;
			}

		}


	/**
	 * Write a method that adds all the digits in the given non-negative integer.
	 * @param integer to add digits
	 * @return integer in which all the digits in the given non-negative integer are added.
	 * 
	 * Example(s): 
	 * - If input is 565, print and return 16.
	 * - If input is 7, print and return 7.
	 * - If input is 0, print and return 0.
	 */
	public int digitsSum(int input){
		int sum = 0;
		while(input > 0) {  
		//finds the last digit of the given input    
		int digit = input % 10;  
		//adds last digit to the variable sum  
		sum = sum + digit;  
		//removes the last digit from the input  
		input = input / 10;  
		}  
		//return the result  
		System.out.println("Sum of the digits: "+sum);
		return sum;
		} 

	public static void main(String[] args) {
		// Create an instance of the SimpleGame class.
		SimpleGame SG = new SimpleGame();
		Scanner sc = new Scanner(System.in);
		
		// Ask the user which game to play.
		// Then ask the user for input and pass the value to the corresponding method.
		
		// If the user enters 1, ask for an integer to convert and call the convertTime method.
		// If the user enters 2, ask for an integer and call the digitsSum method.
		
		System.out.println("Enter your choice: 1/2");
	 	System.out.println("1: Convert integer(secs) into hours, minutes, and seconds");
	 	System.out.println("2: Computue digits sum of all digits in an integer");
		int gameType = sc.nextInt();

		if (gameType == 1){
	        System.out.println("Enter seconds: ");
	        int second = sc.nextInt();
	        SG.convertTime(second);
		} 
		else if (gameType == 2){
	        System.out.println("Enter number: ");
	        int num = sc.nextInt();
	        SG.digitsSum(num);
		}
		else{
	        System.out.println("Not vaild");
	    	}	
		sc.close();
		}
}	
