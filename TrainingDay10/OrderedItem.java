import java.util.*;
public class OrderedItem 
{
	public static void main(String[] str)
	{
		
		List<String> lst = new ArrayList();
		
		lst.add("Madurai");
		lst.add("Chennai");
		lst.add("Bangalore");
		lst.add("Coimbatore");
		
		Collections.sort(lst);
		
		System.out.println(lst);
		
		
		List<Employee> emp_lst = new ArrayList();
		
		Employee emp1 = new Employee("emp-1","abc",35000.00);
		Employee emp2 = new Employee("emp-2","def",18000.00);
		Employee emp3 = new Employee("emp-3","ghi",40000.00);
		
		emp_lst.add(emp1);
		emp_lst.add(emp2);		
		emp_lst.add(emp3);
		
		Collections.sort(emp_lst);
		
		Iterator<Employee> emp_ite = emp_lst.iterator();
		while(emp_ite.hasNext()) {
			Employee emp = emp_ite.next();
			
			System.out.println("Employee ID : " + emp.emp_id);
			System.out.println("Employee Name : " + emp.emp_name);
			System.out.println("Salary : " + emp.salary);
			
			System.out.println("--------------------");
		}
	}
}
