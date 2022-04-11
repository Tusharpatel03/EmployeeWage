package Com.bridgelab.employeewagecomp;


		// TODO Auto-generated method stub
		

		/**
		 * Program to Check Whether employee is full time or part time.Calculate wage.
		 * 
		 * @auther:TusharPatel
		 * 
		 */
        public class UC3_PartTime {
		private static int empCheck;

		public static void main(String[] args) {
			
		int IS_PART_TIME = 1; //constant
		int IS_FULL_TIME = 2; //constant
		int EMP_RATE_PER_HOUR = 20; //constant
		
		int empHRS = 0; //variable
		int empWage = 0; //variable
		
		double empchek = Math.floor(Math.random() * 10) % 3 ;
		if (empCheck == IS_FULL_TIME)
			empHRS = 4;
		else if (empCheck == IS_FULL_TIME)
			empHRS = 8;
		else
			empHRS = 0;
		empWage = empHRS * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " + empWage);
		}
        }