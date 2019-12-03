package encapsulation;
import java.util.Scanner;
public class Detais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
Student st=new Student();
System.out.println("enter the name:");
st.setName(s.next());
System.out.println("enter the id");
st.setId(s.nextInt());
System.out.println("Student details");
System.out.println("Name        : "+st.getName());
System.out.println("Student ID  : "+st.getId());
	}

}
