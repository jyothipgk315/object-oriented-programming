package polymorphism;

import java.util.Scanner;

public class Casestudy1 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("1.car\n2.bike");
		int n=s.nextInt();
		display d= new display();
		switch(n)
		{
		case 1:
			System.out.println("Enter the details of bike\nEnter the color ");
		String co=s.next();
		System.out.println("Enter the maximum speed");
		int sp=s.nextInt();
		System.out.println("Enter the number of seats");
		int se=s.nextInt();
		System.out.println("Enter the number of wheels");
		int we=s.nextInt();
		System.out.println("Enter the status of diskbreak(true/false)");
		String sta=s.next();
		d.dis(co,sp,se,we,sta);
		break;
		case 2:
			System.out.println("Enter the details of car\nEnter the color ");
			String col=s.next();
			System.out.println("Enter the maximum speed");
			int spe=s.nextInt();
			System.out.println("Enter the number of seats");
			int sea=s.nextInt();
			System.out.println("Enter the number of wheels");
			int wee=s.nextInt();
			System.out.println("Enter the number of doors");
			int di=s.nextInt();
			System.out.println("Enter the status of diskbreak(true/false)");
			String st=s.next();
			d.dis(col,spe,sea,wee,di,st);
			break;
			
			default:System.out.println("Invalid Option");
				
		}
	}

}
class display
{

	public void dis(String co, int sp, int se, int we, String sta)
	{
		System.out.println("Bike Details");
		System.out.println("Color : "+co);
		System.out.println("Maximum Speed :"+sp);
		System.out.println("Number of Seats :"+se);
		System.out.println("Number of Wheels :"+we);
		System.out.println("Disk Break :"+sta);
		
	}

	public void dis(String col, int spe, int sea, int wee, int di, String st) {
		
		System.out.println("Car Details");
		System.out.println("Color : "+col);
		System.out.println("Maximum Speed :"+spe);
		System.out.println("Number of Seats :"+sea);
		System.out.println("Number of Wheels :"+wee);
		System.out.println("Number of Doors :"+di);
		System.out.println("AC"+st);
	}
	
}

