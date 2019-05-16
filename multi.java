package abc;

import java.util.Scanner;

public class multi extends Thread{
	int i,j;
	static int x;
	public multi(String name)
	{
		super(name);
	}
	public static void input()
	{
	Scanner sc=new Scanner(System.in);
	x=sc.nextInt();
	}
	public void run()
	{
		if(Thread.currentThread().getName().equals("a"))
		{
			for(i=0;i<x;i++)
			{
				System.out.println(i);
			}
		}
		if(Thread.currentThread().getName().equals("b"))
		{
			for(j=x-2;j>=0;j--)
			{
				System.out.println(j);
			}
		}
		
	}
	public static void main(String[] args)
	{	
		
		multi a=new multi("a");
		multi b=new multi("b");
		multi.input();
		a.start();
		b.start();
		try {
			a.join();
			b.join();
			
		}
		catch(InterruptedException e)
		{
			System.out.println("caught");
		}
	
	}
}
