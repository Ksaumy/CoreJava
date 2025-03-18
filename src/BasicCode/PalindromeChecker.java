package Assignment1;

import java.util.Scanner;

public class PalindromeChecker 
{
	 public static boolean isPalindrome(String str) {
	        
	        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	        
	     
	        int left = 0;
	        int right = str.length() - 1;
	        
	        
	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false; 
	            }
	            left++;
	            right--;
	        }
	        
	        return true; 
	    }
	 
	public static void main(String[] args) 
	{
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string :");
	        String input = sc.nextLine();
	        
	        boolean isPalindrome = isPalindrome(input);
	        if (isPalindrome) {
	            System.out.println("\"" + input + "\" is a palindrome.");
	        } else {
	            System.out.println("\"" + input + "\" is not a palindrome.");
	        }
	        
	     
	    }

	}
