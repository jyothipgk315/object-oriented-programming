package calender;
import java.util.Calendar;
public class Calender {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println("At present Year:" + c.get(Calendar.YEAR)); //get year
		System.out.println("At present Day: " + c.get(Calendar.DATE)); //get date
		System.out.println("The current date : " + c.getTime());  //current date
		c.add(Calendar.DATE, -7);
		System.out.println("7 days ago: " + c.getTime());  //before 7 days
		c.add(Calendar.MONTH, 10);
		System.out.println("10 months later: " + c.getTime());  //after 10 month
		c.add(Calendar.YEAR, 10);
		System.out.println("10 years later: " + c.getTime());   //after 10 year
		}

}
