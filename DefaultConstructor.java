package gth.pck;
class Student1
{
	int id;
	String name;
	int age;
	int fee;
	String cource;
	Student1()
	{
		id=1;
		name="Rahul";
		age=21;
		fee=40000;
		cource="Java";
	}
	void display()
	{
		System.out.println("id:"+id+"\t"+"Name:"+name +"\t"+ "age:"+age+"\t"+" fee:"+fee+"\t"+"cource:"+cource);
	}
}
public class DefaultConstructor {

	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.display();

	}

}
