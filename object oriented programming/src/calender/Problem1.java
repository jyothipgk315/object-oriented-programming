package calender;

import java.util.Scanner;
//import java.text.ParseException;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner (System.in);
		int tot=0,f=0;
		long amount=0,total=0;
		System.out.println("Enter the name :");
		String name=s.next();
		System.out.println("Enter the Addres :");
		String add=s.next();
		System.out.println("Number of room :");
		int num=s.nextInt();
		System.out.println("Number of persons :");
		int per=s.nextInt();
		int pers=Math.round(per/2);
		if(pers==num)
		{
		if(per%2!=0)
		{
			f=1;
		}
		if(f==1)
		{
			tot=((per/2)*1000)+250;
		}
		else
		{
			tot=(per/2)*1000;
		}
		
		System.out.println("AC or Non-AC");
		String cool=s.next();
		System.out.println("Booking Date  (yyyy-mm-dd)");
		String start =s.next();
		
		
		System.out.println("Checkout Date  (yyyy-mm-dd)");
		String end = s.next();
		LocalDate ds = LocalDate.parse(start);
		LocalDate de = LocalDate.parse(end);
	     total = ChronoUnit.DAYS.between(ds,de); //total date
		
	    
	    int extr=0;
	    if(cool.contentEquals("ac"))
	    {
	    	extr=tot+150;
	    }
	    else
	    {
	    	extr=tot;
	    }
		 amount=total*extr;
		}
		else
		{
			System.out.println("sorry you need to book one more room");
		}
		
		System.out.println("Reg-Details:\nName :"+name);
		System.out.println("Address :"+add);
		System.out.println("No.Of Room :"+num);
		System.out.println("No.Of.Guest :"+per);
		System.out.println("No.Of Date :"+total);
		System.out.println("Amount :"+amount);
		
		
		
		

	}

}
