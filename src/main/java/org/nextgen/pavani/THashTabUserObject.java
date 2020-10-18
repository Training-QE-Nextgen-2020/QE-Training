package org.nextgen.pavani;

import java.util.Hashtable;



public class THashTabUserObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Employee ,String> theUserObject=new Hashtable<Employee ,String>();
		theUserObject.put(new Employee(123, "Ram", 23),"RAM");
		theUserObject.put(new Employee(235, "John", 69),"JOHN");
		theUserObject.put(new Employee(876, "Krish", 28),"KRISH");
		theUserObject.put(new Employee(512, "Tom", 29),"TOM");
		System.out.println("fetching values by creating ");
		Employee e=new Employee(512,"Tom",29);
		System.out.println(e+"==>"+theUserObject.get(e));

		Employee objEmp=new Employee(20000,"jane", 1234);
		System.out.println("thw employee details are  "+objEmp);

	}

}
class Employee{
	
	int salary;
	String name;
	int id;
	public Employee(int sal,String n,int i) {
		this.salary=sal;
		this.name=n;
		this.id=i;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
}
