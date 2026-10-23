package Q8;

import java.util.ArrayList;
import java.util.List;

public class Implementor implements Operations {
List<Emp> emps=new ArrayList<Emp>();
	@Override
	public void add(List<Emp> emps) {
		emps.addAll(emps);
		
	}

	@Override
	public void update(int id, String name, double salary) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
