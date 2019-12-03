package abstractionConcept;
import java .util.Scanner;

public class Casestudy {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		register r=new  register();
		r.reg();
	}
}
abstract class print{
	abstract void reg();
	
}
class register extends print{
	String mai;	
		static int reg[]=new int[25];
		public void reg() {
			int i=1;
			String ns="",nss="";
			Scanner s=new Scanner(System.in);
				
			
			do
			{
			System.out.println("registration");
			System.out.println("enter your name");
			String name=s.next();
			System.out.println("enter your address");
			String adrs=s.next();
			System.out.println("enter your contact no.");
			String con=s.next();
			System.out.println("enter your email");
			String email=s.next();
			System.out.println("enter your proof");
			String proof=s.next();
			System.out.println("enter your proofid");
			String proofid=s.next();
	reg[i]=1;
			System.out.println("Thank you for registering. Your id is "+i);
			System.out.println("do u wnt cntnue(ys/no)");
			 nss=s.next();
			if(nss.contentEquals("no")==true)
			{
		System.out.println("do u wnt to update mail(ys/no)");
		 ns= s.next();
		if(ns.contentEquals("ys")==true)
		{
			System.out.println("updte mail\nenter new mail");
		 mai=s.next();
		System.out.println("mail updated");
		
		}
		System.out.println("your details are");
		System.out.println("name"+name);
		System.out.println("adrs"+adrs);
		System.out.println("contact no."+con);
		System.out.println("email"+mai);
		System.out.println("proof"+proof);
		System.out.println("prood id"+proofid);
		
			}

		}
	while(nss.contentEquals("ys")==true);
	}
	}
