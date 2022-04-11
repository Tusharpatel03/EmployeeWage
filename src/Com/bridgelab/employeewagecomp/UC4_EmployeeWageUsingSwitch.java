package Com.bridgelab.employeewagecomp;


/**
 * Calculate Employee Wage Using Switch
 * 
 * @auther:TusharPatel.
 */

    public class UC4_EmployeeWageUsingSwitch {
	// Constants
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_WAGE_PER_HR = 20;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");


		// Variables
		int empHrs = 0;
		int empWage = 0;
		
		int Emp_Check = (int) Math.floor(Math.random() * 10) % 3; // Create random number
		System.out.println("Random value for emp Attendence check is: " + Emp_Check);

		switch (Emp_Check) { // Use switch case to check employee is full time, part time or absent
		case IS_FULL_TIME:
		System.out.println("Employee Present : Full Time");
		empHrs = 8;
		break;

		case IS_PART_TIME:
		System.out.println("Employee is Present : Part Time");
		empHrs = 4;
		break;

		default:
		System.out.println("Employee is Absent");
		empHrs = 0;
		}
	
		empWage = empHrs * EMP_WAGE_PER_HR; // Calculate Employee Wage
		System.out.println("Employee Wage is : " + empWage);
	}
}



