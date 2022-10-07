
public class Employee {
private String name,id,designation;
private double salary;
//Constructor
public Employee(String Name,String Id,String Designation,double Salary) {
	this.name=Name;
	this.id=Id;
	this.designation=Designation;
	this.salary=Salary;
}
public void increaseSalary(double amt) {
	salary=salary+amt;
}
public void  promote(String newDesignation, double newSalary){
	designation=newDesignation;
	salary=newSalary;
}
public String getId() {
	return id;
}
public double getSalary() {
	return salary;
}
public String toString() {
	return "[Name="+ name +",id="+ id +",Designation="+ designation  +",Salary="+  salary +"]";
}
}
