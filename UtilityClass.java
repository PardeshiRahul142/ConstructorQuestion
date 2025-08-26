package gth.pck;
class AU
{
	private AU()
	{
		System.out.println("I am constructor");
	}
	static void show()
	{
		System.out.println("I am show method");
	}
	static void display()
	{
		System.out.println("I am display method ");
	}
}
public class UtilityClass {

	public static void main(String[] args) {
       AU.show();
       AU.display();
	}

}
