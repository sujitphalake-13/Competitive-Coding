/*
  Java Program to Find Sum of Natural Numbers
  
  Example 1: 
  Input : n = 10 -> 1+2+3+4+5+6+7+8+9+10 = 55
  Output: The sum of the first 5 natural numbers is 55
  
  Example 2:
  Input: n = 5 -> 1+2+3+4+5 = 15
  Output: The sum of the first 5 natural numbers is 15
  
  Mathematically, the sum of the first 'n' natural numbers can be found using a simple formula:
  Sum = n(n+1) 
      -------
	     2
*/
import java.util.*;

public class SumOfNaturalNumbers{

    // method to calculate sum of natural numbers
    public static long sumOfNaturalNumbers(int num){
	    long sum = 0L;
		
		// iterate loop 1 to num to get our expected output
        for( int i = 1 ; i <= num ; i++){
		    sum = sum + i;
		}	   
		
		return sum;
	}
    
	public static void main(String args[]){
	   	   
	   // Creating a Scanner object to read input
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("This Java Program to Find Sum of Natural Numbers");
	   System.out.println("Enter the Non-negative number :");
	   int number = sc.nextInt();   // reading the number
	   
	   // Checking if the number is non-negative
	   if(number >= 1){
	      long result = sumOfNaturalNumbers(number);
		  System.out.println("Sum of natural numbers is: " + result);
	   }else{
	      System.out.println("Sum of non-negative numbers not defined");
	   }
	    
        sc.close();  //Closing the scanner		
	}
}