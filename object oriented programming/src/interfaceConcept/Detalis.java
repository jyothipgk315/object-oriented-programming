package interfaceConcept;
import java.util.Scanner ;
public class Detalis {
                          //student details in interface
	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println("enter the name :");
		String name =s.next();
		System.out.println("enter the id :");
		int id=s.nextInt();
		System.out.println("enter the total :");
		int t=s.nextInt();
		Studen st=new Studen();
		st.detail(name,id);
		st.total(t);
	}

}
interface rank5
{
	public void detail(String name,int id);
}
interface total5
{
public	void total(int t);
}
class Studen implements rank5,total5
{
public void detail(String name,int id)
{
	System.out.println("name"+name);
	System.out.println("student ID :"+id);
}
public void total(int t)
{
	System.out.println("total :"+t);
}
}