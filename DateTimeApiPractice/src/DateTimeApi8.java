import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTimeApi8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DateTimeApi8 javaTester = new DateTimeApi8();
		javaTester.dateTimeTest();

	}
	
	
	public void dateTimeTest() {
		
		LocalDateTime currenTime=  LocalDateTime.now();
		System.out.println(currenTime);
		LocalDate currentDate= LocalDate.now();
		System.out.println(currentDate);
		LocalTime currenTime1= LocalTime.now();
		System.out.println(currenTime1);
		System.out.println(currentDate.getEra());
		
		  LocalDateTime date2 = currenTime.withMonth(12).withDayOfMonth(3);
	      System.out.println("date2: " + date2);
	      
	      LocalDate date3 = LocalDate.of(2014,Month.DECEMBER, 12);
	      System.out.println("date3: " + date3);
	      
	      LocalTime date4 = LocalTime.NOON;
	      System.out.println("date4: " + date4);
	      
	      LocalTime date5 = LocalTime.parse("20:15:30");
	      System.out.println("date5: " + date5);
		
		
	}

}
