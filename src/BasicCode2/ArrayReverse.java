package Assignment1Part2;
import java.util.Scanner;

public class ArrayReverse 
{
	public static void reverseArray(int[] arr)
	{
		   int left = 0;
	        int right = arr.length - 1;
	        while (left<right)
	        {
	        	 int temp = arr[left];
	             arr[left] = arr[right];
	             arr[right] = temp;
	             left++;
	             right--;

	        }
	}
	public static void main(String[] args)
	{
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original Array:");
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }

        reverseArray(arr);
        
        System.out.println("\nReversed Array:");
        for (int num : arr)
        {
            System.out.print(num + " ");
        }
	}

}
