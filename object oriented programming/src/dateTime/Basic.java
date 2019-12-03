package dateTime;
import java.time.*;


public class Basic {

	public static void main(String[] args) {
		
		
		System.out.println("Today Date");
		LocalDate date=LocalDate.now(); //create object to print date
		System.out.println(date);
		
		System.out.println("current Time");
		LocalTime time=LocalTime.now();   //create object to print time
		System.out.println(time);
		
		System.out.println(" Current date and time");
		LocalDateTime dt=LocalDateTime.now();   //create object to print date & time
		System.out.println(dt);
	}

}
