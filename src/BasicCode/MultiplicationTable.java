package Assignment1;

import java.util.Scanner;

public class MultiplicationTable {

	
	public static void printMultiplicationTable(int num) {
       
        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer for multiplication table:");
        int Number = sc.nextInt();
        
        printMultiplicationTable(Number);
        
        
    

    
    }
}
