package inheritance;
import java.util.Scanner;
public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the car speed");
int a=s.nextInt();
toyota d=new toyota();
d.name();
d.about();
d.speed(a);
	}

}
