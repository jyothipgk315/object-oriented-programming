package encapsulation;

import java.util.Scanner;

public class Case4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Tbooking t=new Tbooking();
		t.book();
		t.total(t.getN(),t.getName(),t.getC(),t.getAge(),t.getTic());
		
		
	}

}
class Tbooking
{
	int n;
	String name;
	char c;
	int age;
	int tic;
	double total=0;
	double d1=0,d2=0,d3=0;
	String Nam[]=new String[25];
	char Gen[]=new char[25];
	int Ag[]=new int[25];
	Scanner s=new Scanner(System.in);
	public int getN() {
		return n;
	}
	public void book() {
		System.out.println("Enter the tickert :");
		setTic(s.nextInt());
		System.out.println("enter the no. of persons :");
		setN(s.nextInt());
	}
	public void total(int n2, String name2, char c2, int age2, int tic2) {
		for(int i=1;i<n+1;i++)
		{
			System.out.println("enter the details :"+i);
			System.out.println("name");
			setName(s.next());
			Nam[i]=name;
			System.out.println("enter the gender :");
			setC(s.next().charAt(0));
			Gen[i]=c;
			System.out.println("age");
			setAge(s.nextInt());
			Ag[i]=age;
			if(age<16)
				
			{
				d1=tic*0.5;
				total=total+(tic-d1);
			}
			else if(age>16&&age<64)
			{
				if(c=='f')
				{
					d3=tic*0.1;
					total=total+(tic-d3);
				}
				else
				{
					total=total+tic;
				}
			}
			else if(age>64)
			{
				d2=tic*0.25;
				total=total+(tic-d2);
			}
		}
		System.out.println(tic);
		System.out.println("Ticket details are:");
		System.out.println("no of persons are:"+n);
		System.out.println("price:"+tic);
		System.out.println("total"+total);
		for(int i=1;i<=n;i++)
		{
			System.out.println(i+")"+Nam[i]+"("+Gen[i]+","+Ag[i]+")");
		}
		
	}
	public void setN(int n) {
		this.n = n;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getC() {
		return c;
	}
	public void setC(char c) {
		this.c = c;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTic() {
		return tic;
	}
	public void setTic(int tic) {
		this.tic = tic;
	}
}