package Assignment1;


import java.util.Scanner;

public class ArithmeticCalculator {
	 public static void performOperations(int a, int b)
	 {
	        // Perform addition
	        int addition = a + b;
	        System.out.println("Addition: " + addition);

	        // Perform subtraction
	        int subtraction = a - b;
	        System.out.println("Subtraction: " + subtraction);

	        // Perform multiplication
	        int multiplication = a * b;
	        System.out.println("Multiplication: " + multiplication);

	        // Perform division 
	        if (b != 0) {
	            int division = a / b;
	            System.out.println("Division: " + division);
	        } else {
	            System.out.println("Division: Division by zero is not allowed.");
	        }
	    }

	    public static void main(String[] args) {
	    	 Scanner sc = new Scanner(System.in);
		       System.out.println("Enter First Number");
		       int num1 = sc.nextInt();
		       
		       
		       System.out.println("Enter Second Number");
		       int num2 = sc.nextInt();
	        
	        performOperations(num1, num2);
	    }
	}
