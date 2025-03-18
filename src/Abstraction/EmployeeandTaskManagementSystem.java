package Assignment2Abstraction;

abstract class Task
{
	String taskName;
     int progress;
     
	 Task(String taskName, int progress) 
	 {
		this.taskName = taskName;
		this.progress = progress;
	}

	abstract void trackProgress();
}
class DevelopmentTask extends Task
{
	int lineofCode;

	 DevelopmentTask(String taskName, int progress, int lineofCode) 
	 {
		super(taskName, progress);
		this.lineofCode = lineofCode;
	}
	 void trackProgress()
	 {
		 System.out.println("Task Development Tracking Progress :");
		 System.out.println("Task Name :" + taskName + "  "+"Task Progress :" +progress +"%"+ "   "+"Development Line of Code :" +lineofCode);
		 System.out.println("Development Task Completed Successfully.......");
	 }	
}
class DesignTask extends Task
{
	int numberofDesign;

	 DesignTask(String taskName, int progress, int numberofDesign)
	 {
		super(taskName, progress);
		this.numberofDesign = numberofDesign;
	}
	 void trackProgress()
	 {
		 System.out.println("Task Design Tracking Progress :");
		 System.out.println("Task Name :" + taskName + "  "+"Task Progress :" +progress +"%"+ "   "+"Development Number of Design :" +numberofDesign);
		 System.out.println("Design Task Completed Successfully.......");
	 }	 
}
public class EmployeeandTaskManagementSystem 
{

	public static void main(String[] args) 
	{
		Task dev = new DevelopmentTask("Build front page",50,600);
		dev.trackProgress();
		
		Task des= new DesignTask("Design Dashboar",60,15);
		des.trackProgress();

	}

}
