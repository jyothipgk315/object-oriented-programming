package inheritance;
import java.util.Scanner;
class car2
{
	
}

class Audi extends car2
{
void name2(){
	System.out.println("car");	
}
}
class model extends Audi
{
	void name(int a) {
		System.out.println("Audi"+a);	
	}
     
}
public class MultiLevel {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("model name:");
		int a=s.nextInt();
	model m=new model();
	m.name(a);
	m.name2();
	}

}
