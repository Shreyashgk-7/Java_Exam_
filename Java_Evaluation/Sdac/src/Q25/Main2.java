package Q25;

class Accountant {
	public void calSal(double salary) {
		System.out.println(salary);
	}

	public void calSal(double salary, double bonus) {
		System.out.println(salary + bonus);
	}
}

class Emps extends Accountant {
	@Override
	public void calSal(double salary) {
		System.out.println(salary);
	}

	@Override
	public void calSal(double salary, double bonus) {
		System.out.println(salary + bonus);
	}
}

public class Main2 {
public static void main(String[] args) {
	Accountant accountant=new Accountant();
	accountant.calSal(221);
	accountant.calSal(2111, 110);
	Emps emps=new Emps();
	emps.calSal(784);
	emps.calSal(7894, 140);
}
}
