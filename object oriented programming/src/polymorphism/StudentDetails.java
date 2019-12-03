package polymorphism;

import java.util.Scanner;

public class StudentDetails 
{

public static void main(String[] args)
{
		                               // Student details using method overloding
Scanner s=new Scanner(System.in);
System.out.println("enter the name:");
String name=s.next();
System.out.println("enter the Student ID:");
int id=s.nextInt();
System.out.println("enter the sub1:");
int s1=s.nextInt();
System.out.println("enter the sub2:");
int s2=s.nextInt();
System.out.println("enter the sub3:");
int s3=s.nextInt();

int avg=0;
detail d=new detail();
d.stu(name,id);
d.stu(s1,s2,s3);

s.close();
	}
}
class detail
{
	

	public void stu(int s1, int s2, int s3) 
	{
		int total=0;
		total=s1+s2+s3;
	System.out.println("total"+total);	
	stu(total);
	}

	public void stu(String name, int id) {
		System.out.println("name"+name);
		System.out.println("Student ID"+id);
		
	}

	
	public void stu(int total) {
		float avg=total/3;
		System.out.println(avg);
	
	
		if(avg>45)
		{
			System.out.println("Rank 1");
		}
		else
		{
			System.out.println("Rank 2");
		}
		
	}

	
}

