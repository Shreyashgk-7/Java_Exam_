package Q27;

class Emp {
	public static int id = 10;
	public String name = "Shreyash";

	public static void disInfo() {
		System.out.println(id);
	}

	public void dispInfos() {
		System.out.println(name);
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();

		emp.dispInfos();
		Emp.disInfo();
		
	}
}
