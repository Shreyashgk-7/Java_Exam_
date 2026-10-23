package Q26;
final class Emp{
	final public  int id=10;
	
	final public void dispInfo(String name) {
		System.out.println(name);
	}
}
public class Main {
public static void main(String[] args) {
	Emp emp=new Emp();
	emp.dispInfo("raj");
	
}
}
