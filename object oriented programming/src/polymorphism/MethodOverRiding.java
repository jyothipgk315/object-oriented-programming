package polymorphism;
import java.util.Scanner;


public class MethodOverRiding {
	
public static void main(String[] args) {
		
		abc ob1=new abc();
		ob1.disp();
		demo obj=new demo();
		obj.disp();

	}

}
class abc{
	public void disp() {
		System.out.println("parent class");
	}
}	
		

	class demo extends abc{

		public void disp() {
			System.out.println("child class");
		}

	}

	
