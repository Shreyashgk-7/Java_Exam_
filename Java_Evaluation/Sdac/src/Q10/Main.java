package Q10;

class Emp {
	int id = 10;

	public void dispInfo() {

		class Local {
			public void dispInfos() {
				System.out.println(id);
			}
		}
		Local local = new Local();
		local.dispInfos();
	}
}

public class Main {
public static void main(String[] args) {
	Emp emp=new Emp();
	emp.dispInfo();
}
}
