package inheritance;
import java.util.Scanner;
public class BookingSingle2 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("booking\n number of persons ");
		int n=s.nextInt();
		System.out.println("enter the number of days");
		int d=s.nextInt();
		System.out.println("enter the room type");
		String r=s.next();
		System.out.println("enter the month");
		int m=s.nextInt();
		leap c1=new leap();
		nor c2=new nor();
		System.out.println("enter the tharrif for single person");
		int tt=s.nextInt();
		switch(m)
		{
		case 1:
		case 2:
		case 3:
		case 7: 
		case 8:
		case 9:
		case 10:
			System.out.println("enter the discount");
			int dis=s.nextInt();
			c1.tot(n,d,m,dis,tt);
			break;
		case 4:
		case 5:
		case 6:
		case 11:
		case 12:
			System.out.println("enter the peak value");
			int peak=s.nextInt();
			c2.view(n,d,m,peak,tt);
		}
		
		
		
		

	}

}
class leap {
	void tot(int n,int d,int m,int tt,int dis) {
		int j=(n*d*m)-dis/100;
		System.out.println(j);
		
	
	
}
}
class  nor{
void view(int n,int d,int m,int tt,int peak){
	int i=(n*d*m)*peak;
	System.out.println(i);
	}
}




