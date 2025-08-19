// Create a Java class Employee that uses constructor overloading:
//First constructor takes id, name, and basicSalary.
//Second constructor takes id, name, basicSalary, and yearsOfExperience.
//Perform the following in the constructors:
//If experience is given, add a bonus of 10% of salary if experience > 5 years, otherwise 5%.
//If experience is not given, assume it is 0 and no bonus is added.
//Explanation:
// This question checks the ability to overload constructors, handle optional parameters, and perform logical conditions inside the constructor to modify salary based on experience.
package gth.pck;
class EmpCon
{
	int id;
	String name;
	double salary;
	int yearOfExp;
	
	EmpCon(int i,String n,double sal)
	{
		this.id=i;
		this.name=n;
		this.salary=sal;
		
	}
	EmpCon(int i , String n,double sal,int yearOfEx)
	{
		this.id=i;
		this.name=n;
		this.salary=sal;
		this.yearOfExp=yearOfEx;
	}
	void Bounus()
	{ double bonus;
		if(yearOfExp > 5)
		{
		   bonus=salary * 0.10;
		  System.out.println("year of experience is > 5 :"+bonus);
		}
		else
		{
			bonus=salary *0.05;
			System.out.println("year of experience is < 5 :"+bonus);
		}
	}
	void display()
	{
		System.out.println("id id :"+id);
		System.out.println("Name is :"+name);
		System.out.println("salary is :"+salary);
		System.out.println("years of experience is "+yearOfExp);
	}
	
}
public class EmpConOverloading {

	public static void main(String[] args) {
		EmpCon ec=new EmpCon(1,"Rahul",151000);
		EmpCon ec1=new EmpCon(2,"Pranjali",153100,5);
		ec.display();
		ec1.Bounus();
		ec1.display();

	}

}

