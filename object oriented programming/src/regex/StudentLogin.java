package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentLogin {

	public static void main(String[] args) {
		// email
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
		Pattern pattern = Pattern.compile(regex);
		//name
		String regex1 ="[A-Z][a-z]*";
		Pattern pattern1 = Pattern.compile(regex1);	
		//register no
		String regex2 ="(?=.*\\d).{6,15}";
		Pattern pattern2 = Pattern.compile(regex2);	
		//rank
		String regex3 ="(?=.*\\d).{1,15}";
		Pattern pattern3 = Pattern.compile(regex3);	
		//year
		String regex4 ="(?=.*\\d).{4,15}";
		Pattern pattern4 = Pattern.compile(regex4);
		//dpt
		String regex5 ="^[a-z][.][a-z ]*$";
		Pattern pattern5 = Pattern.compile(regex5);
		
		Scanner s= new Scanner (System.in);
		System.out.println("Enter the name :");
		String name=s.next();
		Matcher nam=pattern1.matcher(name);
		if(nam.matches())
		{
		System.out.println("Enter the email ID");
		String email=s.next();
		Matcher em=pattern.matcher(email);
		if(em.matches())
		{
		System.out.println("Enter the Register no");
		String reg=s.next();
		Matcher re=pattern2.matcher(reg);
		if(re.matches())
		{
		System.out.println("Enter the  rank");
		String rank=s.next();
		Matcher ra=pattern3.matcher(rank);
		if(ra.matches())
		{
		System.out.println("Enter the year");
		String year =s.next();
		Matcher ye=pattern4.matcher(year);
		if(ye.matches())
		{
		System.out.println("Enter the department");
		String dpt=s.next();
		Matcher dp=pattern5.matcher(dpt);
		if(dp.matches())
		{
			System.out.println("enter user name");
			String user=s.next();
			System.out.println("Enter the password");
			String pass=s.next();
			System.out.println("login sucsess");
		}
		else
		{
			System.out.println("invaid dpt");
		}
		}
		else
		{
			System.out.println("invalid year");
		}
		}
		else
		{
			System.out.println("invalid rank");
		}
		}
		else
		{
			System.out.println("invalid register no");
		}
		}
		else
		{
			System.out.println("invalid email");
		}
		}
		else
		{
			System.out.println("invalid name");
		}
		
	}

}
