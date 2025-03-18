package Assignment1;

public class SumofEvenNumbers {

	public static int sumOfEvenNumbers(int n) {
        int sum = 0;

        // Iterate through numbers from 1 to n
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 20; 
        int sum = sumOfEvenNumbers(n);
        System.out.println("The sum of all even numbers from 1 to " + n + " is: " + sum);
    }
}
