package Q4;

class InvalidOperations extends Exception{
System.out.println("Invalid operations");

}

class Emp extends InvalidOperations {
	public void calS(int n1, int n2, String operations) {
		if (operations.equals("+")) {
			System.out.println(n1 + n2);
		} else {
			throw  new InvalidOperations;
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		try {
			emp.calS(45, 480, "+");
		} catch (InvalidOperations e) {
			System.out.println(e);
		}
	}

}
