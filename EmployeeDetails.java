

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;


public class EmployeeDetails {
		
	  //  private String panno;
		private LocalDate joindate;
		
		private LocalDateTime joinwithtime;
		/*
		 * private String joindate;
		 * 
		 * 
		 * 
		 * 
		 * 
		 * public String getJoindate() { return joindate; }
		 * 
		 * 
		 * public void setJoindate(String date) { this.joindate = date; }
		 * 
		 */
		/*
		 * public void setPanno(String panno) { this.panno = panno; }
		 */

		public LocalDateTime getJoinwithtime() {
			return joinwithtime;
		}

		public void setJoinwithtime(LocalDateTime joinwithtime) {
			this.joinwithtime = joinwithtime;
		}

		public LocalDate getJoindate() {
			return joindate;
		}

		public void setJoindate(LocalDate joindate) {
			this.joindate = joindate;
		}

		public String getEmpname() {
			return empname;
		}

		public void setEmpname(String empname) {
			this.empname = empname;
		}

		public String getEmpaddress() {
			return empaddress;
		}

		public void setEmpaddress(String empaddress) {
			this.empaddress = empaddress;
		}

		/*
		 * public String getMobileno() { return mobileno; }
		 * 
		 * public void setMobileno(String mobileno) { this.mobileno = mobileno; }
		 */


		private String empname;

	    private String empaddress;
	    private String role;
	    
		public String getRole() {
			return role;
		}


		public void setRole(String role) {
			this.role = role;
		}

		@Override
		public String toString() {
			return "EmployeeDetails [joindate=" + joindate + ", joinwithtime=" + joinwithtime + ", empname=" + empname
					+ ", empaddress=" + empaddress + ", role=" + role + "]";
		}

		public EmployeeDetails(String empname, String empaddress,
				String role,LocalDate joindate, LocalDateTime joinwithtime) {
			super();
			this.joindate = joindate;
			this.joinwithtime = joinwithtime;
			this.empname = empname;
			this.empaddress = empaddress;
			this.role = role;
		}

		



		

		

		


	   // private String targetOwnerName;

	  //  private String  mobileno;
	    

		/*
		 * public String getPanno() { // TODO Auto-generated method stub return panno; }
		 */

}
