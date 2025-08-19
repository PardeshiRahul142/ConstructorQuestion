package gth.pck;
class Student
{
	int id;
	String name;
	int age;
	Student()
	{
		id=1;
		name="Rahul";
		age=21;
    }
	Student(int id, String name)
	{
		this.id=id;
		name=name;
		age=21;
	}
	Student(int i, String na , int ag)
	{
		id=i;
		name=na;
		age=ag;
	}
	void display()
	{
		System.out.println("id :"+id+"Name :"+name +"Age :"+age);
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student(1,"Rah");
		Student s3=new Student(2,"pran",18);
		s1.display();
		s2.display();
		s3.display();
	}

}
