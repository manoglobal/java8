import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class rolefilter {
	public static void main(String args[])
	{
		System.out.println("*******ROLE BASED EMPLOYEE LIST**********");
	List<EmployeeDetails> al=new ArrayList<EmployeeDetails>();
	
	
	LocalDate emp1 = LocalDate.of( 1988 , Month.JANUARY , 23 );
	LocalDate emp2 = LocalDate.of( 2010 , Month.JANUARY , 25);
	LocalDate emp3=LocalDate.of(2000, Month.JANUARY, 29);
	LocalDate emp4=LocalDate.of(2015, Month.JANUARY, 24);
	LocalDate emp5=LocalDate.of(1934, Month.JANUARY, 01);
	LocalDate emp6=LocalDate.of(2020, Month.JANUARY, 18);
	LocalDate emp7=LocalDate.of(2017, Month.JANUARY, 18);
	LocalDate emp8=LocalDate.of(2014, Month.JANUARY, 20);
	//Along with time input
	LocalDateTime femp1 = LocalDateTime.of( 1988 , Month.JANUARY , 23,11,10,06,30 );
	LocalDateTime semp2 = LocalDateTime.of( 2010 , Month.JANUARY , 25,9,30,10,30);
	LocalDateTime temp3=LocalDateTime.of(2000, Month.JANUARY, 29,12,20,10,10);
	LocalDateTime femp4=LocalDateTime.of(2015, Month.JANUARY, 24,10,20,07,06);
	LocalDateTime fiemp5=LocalDateTime.of(1934, Month.JANUARY, 01,02,11,10,16);
	LocalDateTime semp6=LocalDateTime.of(2014, Month.JANUARY, 20,04,21,10,18);
	LocalDateTime seemp7=LocalDateTime.of(2017, Month.JANUARY, 18,9,20,10,10);
	LocalDateTime eiemp8=LocalDateTime.of(2014, Month.JANUARY, 20,03,20,20,30);		
	

	al.add(new EmployeeDetails("mano", "Salem", "manager",emp1,femp1));
	al.add(new EmployeeDetails("karan", "india", "Associate",emp2,semp2));
	al.add(new EmployeeDetails("ram", "Banagalore", "manager",emp3,temp3));
	al.add(new EmployeeDetails("Raj", "Karnataka", "manager",emp4,femp4));
	al.add(new EmployeeDetails("Kauam", "TN", "Associate",emp5,fiemp5));
	al.add(new EmployeeDetails("Kavin", "Tamilnadu", "manager",emp6,semp6));
	al.add(new EmployeeDetails("Java", "Tamilnadu", "manager",emp7,seemp7));
	al.add(new EmployeeDetails("Spring", "India", "manager",emp8,eiemp8));
	

	
	
	/*8072006109
	 * Map<String, List<EmployeeDetails>> noOfMaleAndFemaleEmployees=
	 * al.stream().collect(Collectors.groupingBy(EmployeeDetails::getRole,
	 * Collectors.counting()));
	 */
	
	// Map<String, List<EmployeeDetails>> list=al.stream().collect(Collectors.groupingBy(EmployeeDetails::getRole=='manager'));
	
	al.stream().filter(e->e.getRole()=="manager").forEach(System.out::println);
	System.out.println("*******ROLE BASED EMPLOYEE LIST ENDS**********");
	
	
	System.out.println();
	
	System.out.println("*******>7 YEARS EMPLOYEE LIST**********");
	LocalDate comdate = LocalDate.parse("2015-01-01");
	
	al.stream().filter(e->e.getJoindate().isBefore(comdate)).forEach(System.out::println);
	
	}
}
