package Q24_Overloading;
class Emp{
	public void calSal(double salary) {
		System.out.println(salary);
	}
	public void calSal(double salary,double bonus) {
System.out.println(salary-bonus);
	}
}
public class Main1 {
	public static void main(String[] args) {
		Emp emp=new Emp();
		emp.calSal(2512);
		emp.calSal(1000, 200);
	}

}
