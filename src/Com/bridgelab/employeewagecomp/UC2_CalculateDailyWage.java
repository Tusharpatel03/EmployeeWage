package Com.bridgelab.employeewagecomp;

/**
 * Program to Check Employee Attendance.\\
 * 
 * @author:Tusharpatel
 * 
 */
    public class UC2_CalculateDailyWage {
	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;
		
		int empHrs = 0;
		int empWage = 10;
		
		double empCheck = Math.floor(Math.random () * 10) % 2;
		if (empCheck == IS_FULL_TIME)
			empHrs = 8;
		else
			empHrs = 0;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " + empWage);
	}
    }
		
		  
				
