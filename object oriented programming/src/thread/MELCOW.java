package thread;

import java.util.Scanner;

class Cb extends Thread
{
	Scanner s=new Scanner (System.in);
	
public void run() {
	System.out.println("enter the string");
	String str=s.next();
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		try
		{
			System.out.println(ch);
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
		System.out.println(e);	
		}
	}
}
}


public class MELCOW {

	public static void main(String[] args) {
		
		Cb t=new Cb();
		t.start();
	}

}
