import java.util.ArrayList;
public class UapCse {
ArrayList<Employee> Employees=new ArrayList<>();
String Department;
//Constructor
public UapCse(String department) {
	this.Department=department;		
}
private void addNewEmployee(Employee e) {
	Employees.add(e);
}
public void addNewEmployee(String nm, String id, String des, double sal) {
Employee e=new Employee(nm,id,des,sal);
addNewEmployee(e);
}
private Employee findEmployee(String id) {
	
	for(int i=0;i<Employees.size();i++) {
		Employee e=Employees.get(i);
		if(e!=null && e.getId().equals(id)) {
			return e;
		} 
	}return null;
}
public void increaseSalary(String id, double amt) {
	Employee e=findEmployee(id);
	if(e!=null){
	e.increaseSalary(amt);
	}
}
public void promote(String id, String newDesignation, double newSalary) {
Employee e=findEmployee(id);	
if(e!=null){
	e.promote(newDesignation,newSalary);
	}
}
public double getSalary(String id) {
	Employee e=findEmployee(id);
	if(e!=null){
	return	e.getSalary();
	}else {
		return 0;
	}

}
public void display(String id) {
Employee e=findEmployee(id);
if(e!=null){
	System.out.println(e);
	}
else {
	System.out.println("not found");
}
}
public void display() {
	for(Employee e:Employees) {
		System.out.println(e);
	}
} 
}
