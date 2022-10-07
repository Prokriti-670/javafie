import java.util.Scanner;

public class Uap {
	public static void main(String[] args) {
UapCse myUap=new UapCse("CSE Department");
Scanner scan= new Scanner(System.in);
String Name,Id,Designation;
Double Salary,Amount;
int opt;
while(true) {
	System.out.println("0.Exit");	
System.out.println("1.Add new employee");
System.out.println("2.Get salary of one employee");
System.out.println("3.Increase salary of one employee");
System.out.println("4.To promote an employee");
System.out.println("5.Display details of one employee");
System.out.println("6.Display the list of all employee");
System.out.println("Enter your choice");
opt=scan.nextInt();
switch(opt) {
case 1:
System.out.println("Enter name,id,designation,salary");
Name=scan.next();
Id=scan.next();
Designation=scan.next();
Salary=scan.nextDouble();
myUap.addNewEmployee(Name,Id,Designation,Salary);
break;
case 2: 
System.out.println("enter id");
	Id=scan.next();
double d=myUap.getSalary(Id);
System.out.printf("%f\n",d);
break;	
case 3: 
	System.out.println("enter id,amount");
	Id=scan.next();
	Amount=scan.nextDouble();
myUap.increaseSalary(Id,Amount);
break;		
case 4: 
	System.out.println("enter id,designation,newsalary");
	Id=scan.next();
	Designation=scan.next();
	Salary=scan.nextDouble();
	myUap.promote(Id,Designation,Salary);
	break;
case 5: 
	System.out.println("enter id");
	Id=scan.next();
	myUap.display(Id);
break;
case 6: 	
	myUap.display();
	break;
case 0:
	System.exit(0);
	break;
}
}

	}
}
