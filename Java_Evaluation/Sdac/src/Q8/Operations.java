package Q8;

import java.util.List;

public interface Operations {
	void add(List<Emp> emps);
	void update(int id ,String name,double salary);
	void search(int id);
	void delete(int id);
	
	
}
