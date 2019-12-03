package thread;


	class C extends Thread
	{
		public void run()
		{
			for(int i=1;i<5;i++)
			{
				try {
				
					System.out.println("Thread is going to sleep "+i+" time");
					Thread.sleep(1000);
				}
				catch(InterruptedException e)
				{
					System.out.println(e);
				}
				System.out.println("The thread running "+i+" time");
				System.out.println(i);
			}
		}
	}
	public class UsingSleepMethod {

	public static void main(String[] args) {
		
	C t=new C();
	t.start();
		
	}

}
