package Assignment1;

import java.util.Scanner;

public class FactorialCalculator 
{
	public static long calFactorial(int n) 
	{
        
        long result = 1;
        for (int i = 1; i <= n; i++)
        {
            result *= i; // Multiply result by i(n! =  n*(n-1)*---------* 1)
        }
        
        return result;
    }
	 public static void main(String[] args)
	 {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a non-negative integer:");
	        int number = sc.nextInt();
	       
	        if (number < 0) 
	        {
	            System.out.println("Factorial is not defined for negative integers.");
	        } 
	        else
	        {
	            long factorial = calFactorial(number);
	            System.out.println("Factorial of " + number + " is: " + factorial);
	        }
	       
	    }
	
}