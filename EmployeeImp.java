package abstractClass;

public class EmployeeImp extends Employee {

	public EmployeeImp(String name) {
		super(name);
		
	}

	@Override
	double calculateSalary() {
		// TODO Auto-generated method stub
		return 75000;
	}
	
	public int contractEmployee() {
		return 20000;
		
		
	}

}
