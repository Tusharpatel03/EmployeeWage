   package Com.bridgelab.employeewagecomp;


import java.util.Random;

/**
		 * Program to Check Employee Attendance.
		 * 
		 * @author:Tusharpatel
		 * 
		 */
		    public class UC1_CheckAttendance {
			public static void main(String[] args) {
		    
			int Is_FULL_TIME =1;
			double empCheck = Math.floor(Math.random () * 10) % 2;
			if (empCheck == Is_FULL_TIME)
				System.out.println("Employee is present");
			else
				System.out.println("Employee is Absent");
			}
		    }
		
	
