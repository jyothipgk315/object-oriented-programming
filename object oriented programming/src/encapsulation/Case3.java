package encapsulation;
import java.util.Scanner;
public class Case3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		book b=new book();
		System.out.println("Enter The Price Of Ticket :");
		b.setP(s.nextInt());
		System.out.println("enter the no. of persons :");
		b.setN(s.nextInt());
		int a=b.getN();
		for(int i=1;i<=a;i++)
		{
		System.out.println("Enter The Details For "+i+" Person :\n Name :");
		b.setName(s.next());
		System.out.println("Gender (M or F) :");
		b.setGen(s.next());
		System.out.println("Age :");
		b.setAge(s.nextInt());
		
		}
		b.calc(b.getP(),b.getN(),b.getGen(),b.getAge());
		
		
	}

}
class book{
	int n;
	String name;
	String gen;
	int age;
	double tot=0;
	
	public int getN() {
		return n;
	}
	public void calc(int p2, int n2, String gen2, int age2) {
		
		int nu=n2;
		while(n2!=0)
		{
		if(age2<16)
		{
			tot=tot+(p2-(p2/2));
			n2--;
		}
		else if(age2>16&&age2<64)
		{
			if(gen2=="f")
			{
				tot=tot+(p2-(p2*.1));
				n2--;
			}
			else if(gen2=="m")
			{
				tot=tot+p2;
				n2--;
			}
		}
		if(age2>=64)
		{
			tot=tot+(p2-(p2/4));
			n2--;
		}
		
		
		
		}
	System.out.println("Ticket Details are ");
	System.out.println("------------------------");
		System.out.println("Number of passengers :"+nu);
		System.out.println("Number of price per ticket :"+p2);
		System.out.println("Total Amount :"+tot);
	}
	public void setN(int n) {
		this.n = n;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	int p;
	public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
	
	
}
