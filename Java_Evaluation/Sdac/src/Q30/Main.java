package Q30;

class Emp {
	public String name;
	public int id;

	public Emp(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp=new Emp("Shreyash", 410);
		System.out.println(emp);
	}

}
