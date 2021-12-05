package FourDepartments;

    class Department {     //Class Department is Super Class.

		public void departmentName() {     //Method 1 created under class Department(Super class).
			System.out.println("Super Department");
		}
		public void getTodaysWork() {       //Method 2 created under class Department(Super class). 
			System.out.println("No Work as of now");
		}
		public void getWorkDeadline() {      //Method 3 created under class Department(Super class).
			System.out.println("Nil");
		}
		public void isTodayAHoliday() {      //Method 4 created under class Department(Super class).
			System.out.println("Today is not a holiday");
		}
	}
    
    class AdminDepartment extends Department{   
    	
    	// class AdminDepartment inherits class Department using extend keyword.
    	// class Department is Super class.
    	// class AdminDepartment is Sub class.
    	
    	public void departmentName() {       //Method 1 created under class AdminDepartment(Sub class).
			System.out.println("Welcome to Admin Department");
		}
		public void getTodaysWork() {         //Method 2 created under class AdminDepartment(Sub class).
			System.out.println("Complete your documents submission");
		}
		public void getWorkDeadline() {       //Method 3 created under class AdminDepartment(Sub class).
			System.out.println("Complete by EOD ");
		}
		public void isTodayAHoliday() {       //Method 4 created under class AdminDepartment(Sub class).
			System.out.println("Today is not a holiday");
		}

    }
    
    class HRDepartment extends Department {
    	
    	// class HRDepartment inherits class Department using extend keyword.
    	// class Department is Super class.
    	// class HRDepartment is Sub class.
    	
    	public void departmentName() {         //Method 1 created under class HRDepartment(Sub class).
			System.out.println("Welcome to HR Department");
		}
		public void getTodaysWork() {          //Method 2 created under class HRDepartment(Sub class).
			System.out.println("team Lunch");
		}
		public void getWorkDeadline() {        //Method 3 created under class HRDepartment(Sub class).
			System.out.println("Fill today's timesheet an mark your attendance ");
		}
		public void doActivity() {             //Method 4 created under class HRDepartment(Sub class).
			System.out.println("Complete by EOD");
		}
		public void isTodayAHoliday() {        //Method 5 created under class HRDepartment(Sub class).
			System.out.println("Today is not a holiday");
		}
    }
    
    class TechDepartment extends Department {
    
    // class TechDepartment inherits class Department using extend keyword.
	// class Department is Super class.
	// class TechDepartment is Sub class. 
    	
    	public void departmentName() {         //Method 1 created under class TechDepartment(Sub class).
			System.out.println("Welcome to Tech Department");
		}
		public void getTodaysWork() {          //Method 2 created under class TechDepartment(Sub class).
			System.out.println("Complete coding of module 1");
		}
		public void getWorkDeadline() {        //Method 3 created under class TechDepartment(Sub class).
			System.out.println("Complete by EOD ");
		}
		public void getTechStackInformation() { //Method 4 created under class TechDepartment(Sub class).
			System.out.println("core Java");
		}
		public void isTodayAHoliday() {         //Method 5 created under class TechDepartment(Sub class).
			System.out.println("Today is not a holiday");
		}
}
	
