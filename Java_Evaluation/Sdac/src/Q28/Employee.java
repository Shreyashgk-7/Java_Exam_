package Q28;

class Emp {
	private int id;
	private String name;
	private double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}

public class Employee {
	public static void main(String[] args) {
		Emp emp=new Emp();
		emp.setId(10);
		emp.setName("Shreyash");
		emp.setSalary(4522);
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
	}

}
