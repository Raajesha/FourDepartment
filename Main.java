package FourDepartments;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdminDepartment Obj_AD = new AdminDepartment();         //Objects creation for Admin,HR and Tech Department.
		Obj_AD.departmentName();
		Obj_AD.getTodaysWork();
		Obj_AD.getWorkDeadline();
		Obj_AD.isTodayAHoliday();
		
		HRDepartment Obj_HD = new HRDepartment();
		Obj_HD.departmentName();
		Obj_HD.getTodaysWork();
		Obj_HD.getWorkDeadline();
		Obj_HD.doActivity();
		Obj_HD.isTodayAHoliday();
		
		TechDepartment Obj_TD = new TechDepartment();
		Obj_TD.departmentName();
		Obj_TD.getTodaysWork();
		Obj_TD.getWorkDeadline();
		Obj_TD.getTechStackInformation();
		Obj_TD.isTodayAHoliday();
		
		}

	private void doActivity() {
		// TODO Auto-generated method stub
		
	}

	private void getWorkDeadline() {
		// TODO Auto-generated method stub
		
	}

	private void getTodaysWork() {
		// TODO Auto-generated method stub
		
	}

	private void departmentName() {
		// TODO Auto-generated method stub
		
	}

}
