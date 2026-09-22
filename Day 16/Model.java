package comparitor;

public class Model {
	int id;
	String name;
	int age;
	int marks;
	public Model(int id, String name, int age, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Model [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	} 
	
	

}
