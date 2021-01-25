import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;

class calc {
	public List<DayOfWeek> countWeekDaysMath ( LocalDate start , LocalDate stop ) {
	    // Code taken from Answer by Roland.
	    // https://stackoverflow.com/a/44942039/642706

		    EnumSet<DayOfWeek> weekend = EnumSet.of(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY);
		    List<LocalDate> list = new ArrayList<LocalDate>();
		    List<DayOfWeek> daysList=new ArrayList<DayOfWeek>();

		    while (start.isBefore(stop)) {
		        list.add(start);
		        daysList.add(start.getDayOfWeek());
		        start = start.plus(1, ChronoUnit.DAYS);
		    }
		    java.time.DayOfWeek dayOfWeek = start.getDayOfWeek();
		    long numberOfDays = list.stream().filter(d -> !weekend.contains(d.getDayOfWeek())).count();
		    daysList.removeIf(x->weekend.contains(x));

		    return daysList;
		}
	
	}
class businessDays
{
	public static void main(String args[])
	{
		LocalDate start = LocalDate.of( 2021 , Month.JANUARY , 23 );
		 java.time.DayOfWeek dayOfWeek = start.getDayOfWeek();
		    System.out.println(start + " was a " + dayOfWeek);
		
		LocalDate end = LocalDate.of( 2021 , Month.JANUARY , 30);
		
		calc days=new calc();
		List<DayOfWeek> dayslist=((calc) days).countWeekDaysMath( start,  end);
		dayslist.forEach(day->System.out.println(day));
		
	}

}
