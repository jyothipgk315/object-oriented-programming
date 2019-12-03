package encapsulation;

import java.util.Scanner;

public class Regi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		detail d=new detail();
		
		display r=new display();
		System.out.println("registration\nenter the name:");
		d.setName(s.next());
		System.out.println("enter the addres");
		d.setAdrs(s.next());
		System.out.println("enter the contact number");
		d.setContact(s.nextInt());
		System.out.println("enter the email");
		d.setEmail(s.next());
		System.out.println("enter the proof");
		d.setProof(s.next());
		System.out.println("enter the proof id");
		d.setProofid(s.nextInt());
		
r.display(d.getName(),d.getAdrs(),d.getContact(),d.getEmail(),d.getProof(),d.getProofid());
	}

}
