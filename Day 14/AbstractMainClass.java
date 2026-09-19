package abstractClass;

public class AbstractMainClass {

	public static void main(String[] args) {
		
		EmployeeImp emp= new EmployeeImp("Harish");
		System.out.println(emp.calculateSalary());
		emp.login();
		System.out.println("Contarct Employee :"+emp.contractEmployee());
		
		
		
	}

}
