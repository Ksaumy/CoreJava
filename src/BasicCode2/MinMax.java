package Assignment1Part2;


import java.util.Scanner;

public class MinMax 
{

	 public static int[] findMinMax(int[] array)
	 { 
	        if (array.length == 0) 
	        {
	            return new int[] {Integer.MAX_VALUE, Integer.MIN_VALUE}; 
	        }

	        int min = array[0];
	        int max = array[0];

	        for (int i = 1; i < array.length; i++) {
	            if (array[i] < min) {
	                min = array[i];
	            }
	            if (array[i] > max) {
	                max = array[i];
	            }
	        }

	        return new int[] {min, max};
	    }

	public static void main(String[] args) 
	{
		  Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the number :");
	      int size = sc.nextInt();
	       
	        if (size <= 0) 
	        {
	            System.out.println("Array size.");
	            return;
	        }
	        
	        int[] numbers = new int[size];
	        
	        System.out.println("Enter " + size + " integers:");
	        for (int i = 0; i < size; i++) {
	            numbers[i] = sc.nextInt();
	        }
	      
	        int[] result = findMinMax(numbers);
	       
	        System.out.println("Minimum value: " + result[0]);
	        System.out.println("Maximum value: " + result[1]);
	}
	

	}
