package inheritance;
import java.util.Scanner;
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("1.add\n2.sub\n3.mul");
		int n=s.nextInt();
		Operation c=new Operation(a,b);
		switch(n)
		{
		case 1:
			Operation.add(a,b);
			break;
		case 2:
			Operation.sub(a,b);
			break;
		case 3:
			Operation.mul(a,b);
			break;
			
		}

	}

}
class Operation{
	int a,b;
	public Operation(int a,int b)
	{
		a=a;
		b=b;
	}
	public static void add(int a,int b)
	{
		System.out.println("added value  :"+(a+b));
	}
	public static void sub(int a,int b)
	{
		System.out.println("subtracted value  :"+(a-b));
	}
	public static void mul(int a,int b)
	{
		System.out.println("multipied  value  :"+(a*b));
	}
}
