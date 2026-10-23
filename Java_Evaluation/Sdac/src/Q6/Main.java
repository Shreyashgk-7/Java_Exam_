package Q6;

class Accountant {
	public void calSal(int n1, int n2) throws ArithmeticException {
		System.out.println(n1 + n2);

	}

	public void calSalf(int n1, int n2, String operations) throws ArithmeticException {
		if (operations.equals("+")) {
			calSal(n1, n2);

		}
	}
}

public class Main {
	public static void main(String[] args) {
		Accountant accountant = new Accountant();
		try {
			accountant.calSalf(45, 4555, "+");
			;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
}
