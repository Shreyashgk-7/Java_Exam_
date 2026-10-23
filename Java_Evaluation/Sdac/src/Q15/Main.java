package Q15;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Main extends Emp {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.setId(10);
		emp.setName("shreyash");
		Emp emp2 = new Emp();
		emp2.setId(23);
		emp2.setName("raj");

		List<Emp> emps = new ArrayList<Emp>();
		emps.add(emp);
		emps.add(emp2);

		for (Emp emp3 : emps) {
			System.out.println(emp3);
			
			Enumeration<Emp>enumeration=(Enumeration<Emp>) emps.listIterator();
			while (enumeration.hasMoreElements()) {
				Emp emp4 = (Emp) enumeration.nextElement();
				System.out.println(emp4);
			}
		}
	}
}
