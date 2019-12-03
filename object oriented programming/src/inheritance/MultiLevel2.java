package inheritance;
import java.util.Scanner;
public class MultiLevel2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("child name");
		String c=s.nextLine();
		System.out.println("parent name");
		String p=s.nextLine();
		System.out.println("grandparent name");
		String g=s.nextLine();
		child child=new child();
		
		child.chiname(c);
		child.parent(p);
		child.grandparent(g);

	}

}
class child extends parent1{
	void chiname(String c) {
		System.out.println("child name  :"+c);
		
	}
}
class parent1 extends grandparent1{
	void parent(String p) {
		System.out.println(" paternt  :"+p);
	}
	
}
class  grandparent1{
	void grandparent(String g) {
	System.out.println("grandpaternt  :"+g);
	}
}
