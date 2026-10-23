package Q2;

public class Emp implements Company {

	@Override
	public void rules() {
	System.out.println("Follow these Rules ");}

	@Override
	public void salary(int salary, int bonus) {
System.out.println(salary+bonus);
		
	}
public static void main(String[] args) {
	Emp emp=new Emp();
	emp.rules();
}
}
