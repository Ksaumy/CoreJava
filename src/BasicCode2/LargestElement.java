package Assignment1Part2;

import java.util.Arrays;

public class LargestElement 
{
	public static int findKthLargest(int[] arr, int k)
	{
        Arrays.sort(arr);
        return arr[arr.length - k];
    }
	public static void main(String[] args) 
	{
		  int[] arr = {3, 2, 1, 5, 6, 4};
	        int k = 2;

	        int kthLargest = findKthLargest(arr, k);
	        System.out.println(k + "th largest element is: " + kthLargest);
	    }
}
		

	


