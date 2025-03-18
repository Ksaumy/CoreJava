package Assignment1;

import java.util.Scanner;

public class MaximumValueFinder
{
	  public static int findMaximum(int a, int b, int c) {
	        int max = a;
	      
	        if (b > max)
	        {
	            max = b;
	        }
	        
	        if (c > max)
	        {
	            max = c;
	        }
	        
	        return max;
	    }

	  public static void main(String[] args)
	  {
	        Scanner sc = new Scanner(System.in);
	       
	        System.out.println("Enter the first number:");
	        int num1 = sc.nextInt();
	        
	        System.out.println("Enter the second number:");
	        int num2 = sc.nextInt();
	        
	        System.out.println("Enter the third number:");
	        int num3 = sc.nextInt();
	        
	      
	        int max = findMaximum(num1, num2, num3);
	        
	        
	        System.out.println("The maximum value is: " + max);
	        
	    
	    }

	

}