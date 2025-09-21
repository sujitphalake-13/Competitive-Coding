/*
  Java Program to Find Factorial Using Recursion
  
  Example1: Factorial of 5 is 1*2*3*4*5 or 5*4*3*2*1 = 120.
  
  Note: Factorial of 0 and 1 are always 1.
  
  n!-> Symbol n is any non-negative number
*/
import java.util.*;

public class FactorialUsingRecursion{

    // Recursive method to calculate factorial
    public static long Factorial(int num){
	
	    if( num <= 1 ){     // Base case: factorial of 0 or 1 is 1
	       return 1; 
	    }else{
	       return num * Factorial(num-1); // Recursive call
	    }
	
	}

    public static void main(String args[]){
	
	   // Creating a Scanner object to read input
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("This Program is Find factorial of Any Non-Negative Number using Recursion :");
	   System.out.println("Enter any Non-Negative Number :");
	   
	   int number = sc.nextInt();  // Reading the number
	   
	   // Checking if the number is non-negative
	    if(number > 0){
	   
	      long result = Factorial(number);
		  System.out.println("Factorial of " + number + " is: " + result); 
        } else {
            System.out.println("Factorial is not defined for negative numbers.");
        }

        sc.close(); // Closing the scanner
	}
}

/*

Command for Compile Java Program
javac FileName.java

Command for Run Java Program
java FielName.class

*/