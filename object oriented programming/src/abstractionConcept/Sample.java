package abstractionConcept;
import java.util.Scanner;
public class Sample {

	public static void main(String[] args) {
		 Scanner s=new Scanner (System.in);
		 System.out.println("enter the name :");
		 String name=s.next();
		 System.out.println("Enter The ID :");
		 int id=s.nextInt();
		 Student st=new Student();
		 st.totalmark(name,id);
		}

}
abstract class rank
{
	abstract void totalmark(String name,int id);
	public void rank1()
	{
		System.out.println("rank 2");
	}
}
class Student extends rank
{
	void totalmark(String name,int id)
	{
		System.out.println("name :"+name);
		System.out.println("student id"+id);
		super.rank1();
	}
}