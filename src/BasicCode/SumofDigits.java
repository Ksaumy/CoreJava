package Assignment1;


import java.util.Scanner;

public class SumofDigits 
{

	public static int SumOfDigits(int num)
	{
       
        num = Math.abs(num);
        
        
        if (num == 0) 
        {
            return 0;
        } 
        else 
        {
            
            return num % 10 + SumOfDigits(num / 10);
        }
    }
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = sc.nextInt();
        
        int sum = SumOfDigits(number);
        System.out.println("Sum of the digits: " + sum);
        
    }

}
