package dateTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;;
public class Formatting {

	public static void main(String[] args) {
		
		LocalDateTime dt=LocalDateTime.now();
		System.out.println("before :"+dt);
		
		DateTimeFormatter f=DateTimeFormatter.ofPattern(" dd/mm/yyyy   HH:MM:SS");
		String f1=dt.format(f);
		System.out.println("after :"+f1);
	}

}
