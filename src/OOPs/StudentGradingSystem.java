package Assignment2OOPs;

import java.util.Scanner;

class StudentGrade
{
	String name;
	int rollNumber;
	int[] marks;
	
	void readStudentGrade(String Sname, int rolln0, int[] mm)
	{
		name = Sname;
		rollNumber= rolln0;
		marks=mm;
	}
	void displayStudentGrade()
	{
		System.out.println(name);
		System.out.println(rollNumber);
		System.out.println(marks);
	}
	int calculateTotalMarks()
	{
		 int total = 0;
	        for (int mark : marks) {
	            total += mark;
	        }
	        return total;
	}
	double calculateAverageMarks()
	{
		int total = calculateTotalMarks();
        return (double) total / marks.length;
	}
	 char determineGrade()
	 {
	        double average = calculateAverageMarks();
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
	        else
	        {
	            return 'F';
	        }
	    }
	   void displayStudentDetails() 
	   {
	        System.out.println("Name: " + name);
	        System.out.println("Roll Number: " + rollNumber);
	        System.out.println("Total Marks: " + calculateTotalMarks());
	        System.out.println("Average Marks: " + calculateAverageMarks());
	        System.out.println("Grade: " + determineGrade());
	    }
}

public class StudentGradingSystem 
{
	public static void main(String[] args)
	{
		int[] marks = {85, 78, 92, 88, 76}; 
		StudentGrade sg=new StudentGrade();
		
		sg.readStudentGrade("saumya", 34, marks);
		sg.displayStudentGrade();
		sg.displayStudentDetails();
		
		sg.readStudentGrade("parul", 134, marks);
		sg.displayStudentGrade();
		sg.displayStudentDetails();
		
		sg.readStudentGrade("raj", 54, marks);
		sg.displayStudentGrade();
		sg.displayStudentDetails();
		
	}
 

}
