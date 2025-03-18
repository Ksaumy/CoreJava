package Assignment1Part2;

public class SingleElementFinder 
{
	 public static int findSingleElement(int[] arr) 
	 {
	        int result = 0;
	        for (int num : arr)
	        {
	            result ^= num;
	        }
	        return result;  
	    }

	public static void main(String[] args)
	{
		int[] arr = {2, 3, 5, 4, 5, 3, 4};

        int singleElement = findSingleElement(arr);
        System.out.println("The single element is: " + singleElement);
	}
  
}
