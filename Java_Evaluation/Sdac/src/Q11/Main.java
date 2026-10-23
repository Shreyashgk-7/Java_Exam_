package Q11;

class Emp {
	public int id = 10;
	private int id1 = 12;
	protected int id3 = 234;

	public void dispInfo() {
		System.out.println(id1);
	}
}

class Acc extends Emp {

}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		Acc acc = new Acc();
		emp.dispInfo();
		System.out.println(acc.id3);
		System.out.println(acc.id);
	}
}
