package Q22;

class Emp {
	public int id = 10;

	public void dispInfo() {
		System.out.println("Hello");
	}
}

class Acc extends Emp {
	public void dispInfos() {
		super.dispInfo();
		System.out.println(super.id);
		System.out.println("Super Keyword");
	}
}

public class Main {
public static void main(String[] args) {
	Acc acc=new Acc();
	acc.dispInfos();
}
}
