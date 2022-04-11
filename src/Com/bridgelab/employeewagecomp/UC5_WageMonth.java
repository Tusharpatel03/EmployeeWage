package Com.bridgelab.employeewagecomp;
/**
 * Calculate Employee Wage Month
 * 
 * @auther:TusharPatel.
 */


public class UC5_WageMonth {
// Constants
public static final int IS_FULL_TIME = 1;
public static final int IS_PART_TIME = 2;
public static final int EMP_WAGE_PER_HR = 20;
public static final int MAX_WORKING_DAYS = 20;
public static final int MAX_HRS_IN_MONTH = 100;

public static void main(String[] args) {
				
int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 1; //Variable
while ((totalEmpHrs <= MAX_HRS_IN_MONTH) && (totalWorkingDays <= MAX_WORKING_DAYS)) {
int Emp_Check = (int) Math.floor(Math.random() * 10) % 3;

switch (Emp_Check) {    // Use switch case to check employee is full time, part time or absent
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
					
totalEmpHrs += empHrs; // Calculate Employee Wage
System.out.println("Employee Wage is : " + empHrs);
					
totalWorkingDays++;  // Incrementing Day by 1 after every iteration
 }
				
int totalMonthlyWage = totalEmpHrs * EMP_WAGE_PER_HR; // Calculating Monthly wage
System.out.println("Employee worked " + totalEmpHrs + " Hrs in " + (totalWorkingDays - 1) + " days.");
System.out.println("Monthly Wage of employee is : " + totalMonthlyWage);
 }
 }
