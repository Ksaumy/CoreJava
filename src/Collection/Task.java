package Assignment3Collection;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Task implements Comparable<Task>
{
	String title;
	String description;
	boolean isCompleted;
	
	public Task(String title, String description, boolean isCompleted)
	{
		this.title = title;
		this.description = description;
		this.isCompleted = isCompleted;
	}
	public void completeTask()
	{
		this.isCompleted=true;
	}
	@Override
	public String toString() 
	{
		return "Task [title=" + title + ", description=" + description + ", isCompleted=" + isCompleted + "]";
	}
	public int compareTo(Task other)
	{
		return this.title.compareTo(other.title);	
		}
	
	
}
//--------------------------------------------------------------------------------------------------

class StackListImplementation
{
	Stack<Task> inprogress = new Stack<>();
	
	void pushTask(Task t)
	{
		inprogress.push(t);
		System.out.println("Task push in progress :"+t.title);
	}
	
	public  Task popTask()
	{
		if(!inprogress.isEmpty())
		{
			Task completedTask = inprogress.pop();
			completedTask.completeTask();
			System.out.println("Task Completed :"+completedTask.title);
			return completedTask;
		}
		else 
		{
			System.out.println("No tasks are in progress");
		return null;
		}
	}
	public Task peekTask()
	{
		 if (!inprogress.isEmpty()) 
		 {
	            return inprogress.peek();
	        } 
		 else 
		 {
	            System.out.println("No tasks are in progress.");
	            return null;
	        }
	}

}
//---------------------------------------------------------------------------------

 class QueueImplementation 
{
	

	PriorityQueue<Task> waitingQueue = new PriorityQueue<>();
	
	public void enqueueTask(Task t)
	 {
		 waitingQueue.add(t);
		 System.out.println("Task added to waiting Queue :"+t.title);
	 }
	 
	public Task dequeueTask() 
	 {
		 if (!waitingQueue.isEmpty())
		 {
			 Task taskStart = waitingQueue.poll();
			 System.out.println("Task moved to in progress :" +taskStart.title);
			 return taskStart;
		 }
		 else 
		 {
			 System.out.println("No tasks are waiting to be started");
			 return null;
		 }
	 }
//	 Task peekNextTask()
//	 {
//		 if(!waitingQueue.isEmpty())
//		 {
//			 return waitingQueue.peek();
//		 }
//		 else 
//		 {
//			 System.out.println("No Task are waiting to be started.");
//			 return null;
//		 }
//	 }

}

//--------------------------------------------------------------
class LinkedListImplementation
{
	
	LinkedList<Task> taskList = new LinkedList<>();
	
	public void addTask(Task t)
	{
		taskList.add(t);
		System.out.println("Task added to list :"+t.title);
	}
	public void removeTask(Task t)
	{
		if(taskList.remove(t)) 
		{
			System.out.println("Task removed from list :" + t.title);
		}
		else
		{
			System.out.println("Task not found in list :"+t.title);
		}
	}
	public void displayAllTasks()
	{
		System.out.println("All tasks :");
		for(Task t : taskList)
		{
			System.out.println(t);
		}
		
	}

}
//-----------------------------------------------------------------

 class TaskManagementSystem 
{

	public static void main(String[] args) 
	{
		StackListImplementation inprogress = new StackListImplementation();
		QueueImplementation  waitingTasks = new QueueImplementation ();
		 LinkedListImplementation allTasks = new  LinkedListImplementation();
		 
		 Task t1 = new Task("Task 1","Description of Task 1",true);
		 Task t2 = new Task("Task 2","Description of Task 2",false);
		 Task t3 = new Task("Task 3","Description of Task 3",true);
		 
		 waitingTasks.enqueueTask(t1);
	        waitingTasks.enqueueTask(t2);
	        waitingTasks.enqueueTask(t3);
	        
	        allTasks.addTask(t1);
	        allTasks.addTask(t2);
	        allTasks.addTask(t3);
	        
	        Task taskinprogress = waitingTasks.dequeueTask();
	        if (taskinprogress != null)
	        {
	            inprogress.pushTask(taskinprogress);
	        } 
	        
	        Task currentTask = inprogress.peekTask();
	        if (currentTask != null)
	        {
	            System.out.println("Currently working on: " + currentTask.title);
	        }

	        Task completedTask = inprogress.popTask();

	        allTasks.displayAllTasks();
	}

}