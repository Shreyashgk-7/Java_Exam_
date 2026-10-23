package Q29;
class Emp{
	public static int id=10;
	public String name="Shreyash";
	public void dispInfo(int id){
		System.out.println(id);
	}
	
}
public class Main {
public static void main(String[] args) {
	Emp emp=new Emp();
	System.out.println(Emp.id);
	System.out.println(emp.name);
	emp.dispInfo(15);
}
}
