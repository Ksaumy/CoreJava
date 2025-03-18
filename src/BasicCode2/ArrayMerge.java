package Assignment1Part2;

import java.util.Arrays;

public class ArrayMerge 
{
	public static int[] mergeArray(int[] array1, int[] array2)
	{
		int[] result = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;
        while (i < array1.length && j < array2.length) 
        {
            if (array1[i] <= array2[j])
            {
                result[k++] = array1[i++];
            } 
            else 
            {
                result[k++] = array2[j++];
            }
        }
        while (i < array1.length)
        {
            result[k++] = array1[i++];
        }
        while (j < array2.length) 
        {
            result[k++] = array2[j++];
        }

        return result;
	}
  
	public static void main(String[] args) 
	{
		int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};

        int[] mergedArray = mergeArray(array1, array2);

		System.out.println("Merged Array: " + Arrays.toString(mergedArray));

	}

}
