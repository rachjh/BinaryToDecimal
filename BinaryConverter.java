import java.util.Scanner;

public class BinaryConverter {

	public static void main(String[] args) {

	    //Gets a binary number
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a binary number: ");
	    long binary = input.nextLong();
 	   
	    //checks if it's really a binary number
	    boolean isBinary = true;
	    long copyOfInput = binary; 
		
	    while (copyOfInput != 0) //input is not 0
	   	{ 
	   		if (copyOfInput % 10!=1 && copyOfInput % 10 !=0 )  //gets remainder of number after divided by ten which is just the last number of digit
 	   		{
    			isBinary = false; 
    		} 
	   		copyOfInput = copyOfInput / 10; //eliminates last digit
	    }
	    
	    copyOfInput = binary; //sets it back to original binary number
	    
	    long count = 0;
	    
    	//will print the number in decimal
	    long lastValue = 0;
	    long fullValue = 0;
	    if (isBinary)//is true?
	    {
	    	while (copyOfInput != 0)
	    	{ 
	    	lastValue = (long)((copyOfInput % 10) * Math.pow(2, count)); //gets next power of 2 multiplied by last digit
	    		
	    	fullValue = fullValue + lastValue;

	    	copyOfInput = copyOfInput / 10; //eliminates last digit
	    	count++;
	    	}
		long printValue = (long) fullValue;
	    System.out.println("The value of this number in decimal is: " + printValue);
	    	
	    }
	    
	    else
	    {
		    System.out.println("That is not a binary number.");
	    }

	}//end of public static void

}//end of public class
