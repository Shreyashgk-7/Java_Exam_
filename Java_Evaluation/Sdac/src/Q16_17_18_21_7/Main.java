
package Q16_17_18_21_7;

import java.util.Objects;

class Emp implements Cloneable {
	int id;
	String name;

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}

	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object Deleted");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
}

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
		int a = 10;
		Integer integer = new Integer(a);
		System.out.println(integer);
		int z = integer;
		System.out.println(z);
		Emp emp = new Emp(10, "Shreyash");
		System.out.println(emp);
		Emp emp2 = (Emp) emp.clone();
		System.out.println(emp.equals(emp2));
		System.out.println(emp2);
		System.out.println(emp2.getClass());
		
		emp = null;
		System.gc();
	}
}
