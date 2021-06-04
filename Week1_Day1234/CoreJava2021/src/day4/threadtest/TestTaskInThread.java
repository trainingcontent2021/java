package day4.threadtest;

class Task1 extends Thread
{	//Write the businees logic that I want my thread to execute
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{	System.out.println("Number of I is "+i);}	
	}
}

class Task2 extends Thread
{	//Write the businees logic that I want my thread to execute
	@Override
	public void run() {
	for(int j=6;j<=10;j++)
	{	System.out.println("Number of J is "+j);}}	
	}

public class TestTaskInThread {
	public static void main(String[] args)
	{  
		//Thread t1 
		Task1 t1= new Task1();//New State
		t1.start();
		//t1.run();
		
		//Thread t2
		Task2 t2 = new Task2();
		t2.start();
		//t2.run();
		

		
		
	}
}
