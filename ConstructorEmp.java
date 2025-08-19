package gth.pck;
class EmployeeIn
{
	int id;
	String name;
	double basicSalary;
	
	EmployeeIn()
	{
		id=1;
		name="Rohan";
		basicSalary=200000;
	}
	void salaryOperation()
	{
		double hra=basicSalary *0.10;
		double da=basicSalary*0.05;
		double grossSalary=basicSalary + hra + da;
		 System.out.println("Employee ID: " + id + "\tName: " + name);
	        System.out.println("Basic Salary: " + basicSalary);
	        System.out.println("HRA (10%): " + hra);
	        System.out.println("DA (5%): " + da);
	        System.out.println("Gross Salary: " + grossSalary);

	        if (grossSalary > 50000) {
	            System.out.println("Gross salary is greater than 50,000");
	        } else {
	            System.out.println("Gross salary is less than or equal to 50,000");
	        }
	}
}
public class ConstructorEmp {

	public static void main(String[] args) {
		EmployeeIn e=new EmployeeIn();
		e.salaryOperation();

	}

}
