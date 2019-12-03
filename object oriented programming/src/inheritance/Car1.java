package inheritance;
import java.util.Scanner;
public class Car1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.println("enter the name ");
		String str=s.nextLine();
		Carnew c=new Carnew(str);
		Carnew.a();
		Carnew.b();
		Carnew.display(str);

	}

}
class Carnew{
	String str;
	public Carnew(String str) {
		str=str;

	}
	public static void a() {
		System.out.println("welcom car a");
	}
	public static void b() {
		System.out.println("welcom car b");
	}
	public static void display(String str) {
		System.out.println(str);
	}
	
	
	}


