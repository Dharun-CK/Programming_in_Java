import java.util.*;
public class Employee implements Comparable<Employee>{

	public String emp_id , emp_name;
	public double salary;
public Employee(String emp_id, String emp_name, double salary) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.salary = salary;
	}
	
	
	public int compareTo(Employee emp) {
		
		if(salary == emp.salary) {
			return 0;
		}else if(salary > emp.salary) {
			return 1;
		}else {
			return -1;
		}
	}
	
}
