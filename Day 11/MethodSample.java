package practce;

public class MethodSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ModelClass mc = new ModelClass() ;
		mc.setEmpId(1);
		mc.setName("Harish");
		mc.setDepartment("Dev");
		mc.setSalary(29000.05f);
		
		System.out.println("Id :"+mc.getEmpId());
		System.out.println("Name :"+mc.getName());
		System.out.println("Department :"+mc.getDepartment());
		System.out.println("Salary :"+mc.getSalary());
	}

}
