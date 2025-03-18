package Assignment1;


import java.util.Scanner;

//Fahrenheit=(Celsius * 9/5)+32


public class TemperatureConversion
{
	 public static double convertTemp(double celsius) {
	        
	        return ((celsius * 9/5) + 32);
	        }
	 public static void main(String[] args) 
	 {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter temperature in Celsius:");
	        double celsius = sc.nextDouble();
	        
	        double fahrenheit = convertTemp(celsius);
	        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
	       
	    }

}