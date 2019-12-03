package polymorphism;

import java.util.Scanner;

public class Poly1 {

	public static void main(String[] args) {
		//method overloading
	Scanner s=new Scanner (System.in);
	Add a=new Add();
	int n1=s.nextInt();
	int n2=s.nextInt();
	int n3=s.nextInt();
a.add(n1);
a.add(n1,n2);
a.add(n1,n2,n3);

	}

}
class Add
{
	void add(int n1)
	{
		System.out.println(n1);
	}

	
	public void add(int n1, int n2)
	{
		System.out.println(n1+n2);
	}
	public void add(int n1, int n2, int n3)
	{
		System.out.println(n1+n2+n3);
		
	}

}
