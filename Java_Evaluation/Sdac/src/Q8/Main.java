package Q8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main extends Implementor {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.setId(10);
		emp.setName("shreyash");
		emp.setSalary(159);
		Emp emp2 = new Emp();
		emp2.setId(45);
		emp2.setName("raj");
		emp2.setSalary(55444);

		List<Emp> emps = new ArrayList<Emp>();
		emps.add(emp);
		emps.add(emp2);

		Implementor implementor = new Implementor();
		implementor.add(emps);

		
		Iterator<Emp> iterator=emps.iterator();{
		while (iterator.hasNext()) {
			Emp emp3 = (Emp) iterator.next();
			
			if (emp.getId()==id) {
				System.out.println(emp3);
				
				
				
			}
			
			Iterator<Emp> iterator2=emps.iterator(){
				while (iterator2.hasNext()) {
					if (emp.getId()==id) {
						emp.setName(name);
						emp.setSalary(salary);
					}
				}
			}
		}
	}
}
}