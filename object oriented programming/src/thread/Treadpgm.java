package thread;
class Car extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			if(i==1)yield();
			System.out.println("Car is running "+i);
		}
		System.out.println("Car A running Complete");
	}
}
class Car1 extends Thread
{
	public void run()
	{
	int i;
	for( i=0;i<=5;i++)
	{
		if(i==2)stop();
		{
			System.out.println("Car B is Running "+i);
		}
	}
	
	System.out.println("Car B running Complete");
	}
}
class Car2 extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
		if(i==3)
		{
			try
			{
				System.out.println("Car running sleep");
			Thread.sleep(10000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		}
		
	}
}
public class Treadpgm {

	public static void main(String[] args) {
		Car t=new Car();
		Car1 t1=new Car1();
		Car2 t2=new Car2();
		t.start();
		t1.start();
		t2.start();
	}

}
