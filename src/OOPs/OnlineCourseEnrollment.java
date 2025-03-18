package Assignment2OOPs;

class Student
{
	int StudentId;
	String StudentName;
	public Student(int studentId, String studentName) 
	{
		StudentId = studentId;
		StudentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + "]";
	}
}
//----------------------------------------------------------
class Course  //Course CLass
{
	int courseID;
	String courseName;
	String instructorName;
	double fee;
	Student[] enrolledStudent;
	int StudentCount;
	final int MaxStudents = 5;
  Course(int courseID, String courseName, String instructorName, double fee) 
	{
		this.courseID = courseID;
		this.courseName = courseName;
		this.instructorName = instructorName;
		this.fee = fee;
		this.enrolledStudent = new Student[MaxStudents];
		this.StudentCount = 0;
	}
  
	
	void enrollStudent(Student student)
	{
		if(StudentCount < MaxStudents)
		{
			enrolledStudent[StudentCount]=student;
			StudentCount++;
			System.out.println("Enrolled in : " + student.StudentName + "..." + courseName);
		}
		else {
			System.out.println("Enrollment Full : " + courseName);
		}
	}
	void viewEnrolledStudent()
	{
		if (StudentCount == 0) {
            System.out.println("No students have enrolled in " + courseName + ".");
        } else {
            System.out.println("Enrolled Students in " + courseName + ":");
            for (int i = 0; i < StudentCount; i++) {
                System.out.println(enrolledStudent[i].toString());
            }
        }
	}
	double calculateTotalRevenue()
	{
		return fee*StudentCount;
	}
}

//-----------------------------------------------------------------------------------------------
public class OnlineCourseEnrollment   //Main Class
{

	public static void main(String[] args) 
	{
		Course pgdac = new Course(101,"Core Java","Saumya",5000.0);
		
 
		 Student s1 = new Student(101, "Richa");
	        Student s2 = new Student(102, "Boby");
	        Student s3 = new Student(103, "Chitra");
	        
             pgdac.enrollStudent(s1);
             pgdac.enrollStudent(s2);
             pgdac.enrollStudent(s3);
             pgdac.viewEnrolledStudent();
             
             double totalRevenue = pgdac.calculateTotalRevenue();
             System.out.println("Total Revenue Generated: $" + totalRevenue);
	}

	

}
