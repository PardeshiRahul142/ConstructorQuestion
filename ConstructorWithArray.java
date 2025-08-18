package gth.pck;

class Const
{   int s=0;
	int arr[];
	Const(int x[])
	{
		arr=x;
	}
	int getSum()
	{
		for(int i=0;i<arr.length;i++)
		{
			s=s+arr[i];
		}
		return s;
	}
}
public class ConstructorWithArray {

	public static void main(String[] args) {
		 int arr[]= {10,20,30,40,50};
		 Const cs=new Const(arr);
		 int result=cs.getSum();
		 System.out.println("The of array is :"+result);
	}

}
