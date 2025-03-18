package Assignment1;

import java.util.Scanner;
public class ArthmeticCalculatorUsingSwitch {

	    public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter First Number");
	       int num1 = sc.nextInt();
	       
	       
	       System.out.println("Enter Second Number");
	       int num2 = sc.nextInt();
	       
	       System.out.println("Enter an operator (+, -, *, /):");
	        char operator = sc.next().charAt(0);

	        double result = performOperation(num1, num2, operator);
	        System.out.println("Result: " + result);
	    }

	    public static double performOperation(int a, int b, char op) {
	        double result = 0;
	        
	        switch (op) {
	            case '+':
	                result = a + b;
	                break;
	            case '-':
	                result = a - b;
	                break;
	            case '*':
	                result = a * b;
	                break;
	            case '/':
	                if (b == 0) {
	                    System.out.println("Error: Division by zero is not allowed.");
	                  
	                } else {
	                    result = (double) a / b;
	                }
	                break;
	            default:
	                System.out.println("Error: Invalid operator. Use '+', '-', '*', or '/'.");
	                
	                break;
	        }

	       
	        
	        return result;
	    }
	}
