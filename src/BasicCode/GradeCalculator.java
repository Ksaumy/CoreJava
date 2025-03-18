package Assignment1;

import java.util.Scanner;

public class GradeCalculator 
{
	public static char getGrade(int average) 
	{
        if (average >= 90) 
        {
            return 'A'; 
        } 
        else if (average >= 80)
        {
            return 'B'; 
        } 
        else if (average >= 70) 
        {
            return 'C'; 
        } 
        else if (average >= 60)
        {
            return 'D'; 
        } 
        else {
            return 'F'; 
        }
    }

	

	

	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	  
	        System.out.println("Enter Number of Subject:");
	        int Grades = sc.nextInt();
	        
	        int total = 0;
	        
	        
	        for (int i = 1; i <= Grades; i++)
	        {
	            System.out.println("Enter Marks " + i + ":");
	            int grade = sc.nextInt();
	            total += grade;
	        }
	       
	        int average = total / Grades;
	  
	        char Grade = getGrade(average);
	       
	        System.out.println("Average grade: " + average);
	        System.out.println("Get grade: " +Grade);
	        
	       
	    }

	    
	}