/*
 Java Program to Reverse a Number
 
 Ex1: Input : 143
	  Output: 341 
	
 Ex2: Input : 58312
      Output: 21385
*/

import java.util.Scanner;

public class ReverseNumberUsingRecursion{

    // method to convert reverse number
    public static long reverseNumber(long num, long reversed){
		
		if(num == 0){
		   return reversed;
		}  
		return reverseNumber(num / 10, reversed * 10 + num % 10);
	}

    public static void main(String args[]){
      
	    // creating scanner object to read input
	    Scanner sc = new Scanner(System.in);
		
	    System.out.println("This Java Program to Find Reverse Numbers");
		System.out.println("Enter the non-negative number :");
		
		long number = sc.nextLong(); //
		
		// Checking if the number is non-negative
		if(number > 0){
		   long result = reverseNumber(number, 0);
		   System.out.println("Reverse number of " + number + " is: "+result);
		}else{
		   System.out.println("Reverse number is not-defined");
		}
		
		sc.close();  // closing the scanner
		
    }

}