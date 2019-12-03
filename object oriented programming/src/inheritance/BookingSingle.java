package inheritance;
import java.util.Scanner;

public class BookingSingle {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("booking\n number of persons ");
		int n=s.nextInt();
		System.out.println("enter the number of days");
		int d=s.nextInt();
		System.out.println("enter the room type");
		String r=s.next();
		System.out.println("enter the tharrif for single person");
		int tt=s.nextInt();
		total t=new total();
t.tot(n, d, tt);
	}

}
class booking
{
	void tot(int n,int d,int tt)
	{
		int j=n*d*tt;
		System.out.println("hotel tharrif "+j);
	}
}
class total extends booking{
}

