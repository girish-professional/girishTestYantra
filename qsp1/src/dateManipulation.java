import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.IsoChronology;

public class dateManipulation {
	
	public static void main(String[] args) {
		LocalDate ls=LocalDate.now();
	    System.out.println(ls);
	    LocalDate minus15 = ls.minusDays(15);
	    System.out.println(minus15);
		int dayOfmonth=ls.getDayOfMonth();
		 DayOfWeek dayOfweek = ls.getDayOfWeek();
		 int dayofYear = ls.getDayOfYear();
		 IsoChronology chronology = ls.getChronology();
		System.out.println(dayOfmonth);
		System.out.println(dayOfweek);
		System.out.println(dayofYear); // in this year which day
		System.out.println(chronology);
		LocalDateTime startOfDay = ls.atStartOfDay();
		System.out.println(startOfDay);
	}

}
