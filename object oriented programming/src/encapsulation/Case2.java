package encapsulation;

import java.util.Scanner;

public class Case2 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
detail1 d=new detail1();
		
		
		System.out.println("registration\nenter the name:");
		d.setName(s.next());
		System.out.println("enter the addres");
		d.setAdrs(s.next());
		System.out.println("enter the contact number");
		d.setContact(s.next());
		System.out.println("enter the email");
		d.setEmail(s.next());
		System.out.println("enter the proof");
		d.setProof(s.next());
		System.out.println("enter the proof id");
		d.setProofid(s.next());
		d.check();
		}

}
