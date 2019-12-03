package polymorphism;

import java.util.Scanner;

public class Casestudy2 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the Telephone Bill Number :");
		int bi=s.nextInt();
		System.out.println("Enter the Customer name :");
		String na=s.next();
		System.out.println("Enter the No of Calls Made :");
		int ca=s.nextInt();
		System.out.println("Enter the coat per call :");
		int co=s.nextInt();
		System.out.println("Enter The Current Bill Number :");
		int bino=s.nextInt();
		System.out.println("Enter the Customer name :");
		String name=s.next();
		System.out.println("Ente The Number Of unit Consumed :");
		int uni=s.nextInt();
		System.out.println("Enter The Cost Per Unit :");
		int cou=s.nextInt();
		tele t=new tele();
		t.dis(bi,na,ca,co);
		curr c=new curr();
		c.dis(bino,name,uni,cou);
		
		

	}

}
class tele extends bill
{
	
}

class bill


{

	public void dis(int bi, String na, int ca, int co) {
		System.out.println("Bill Number :"+bi);
		System.out.println("Enter the Customer name :"+na);
		System.out.println("Telephone Bill Amount :"+(ca*co));
		
	}
	
}
class curr
{

	public void dis( int bino,String name, int uni, int cou) {
		System.out.println("Bill Number :"+bino);
		System.out.println("Enter the Customer name :"+name);
		System.out.println("Telephone Bill Amount :"+(uni*cou));
		
	}
	
}