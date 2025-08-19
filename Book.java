//Q1. Create a Java program with a default constructor that initializes details of a Book (title, price, quantity).
// Perform the following in one program:
//Display all book details.
//
//
//Apply a 10% discount if quantity > 5.
//
//
//Calculate the total cost after discount.

package gth.pck;
class BookDetail
{
	String title;
	int price;
	int quantity;
	
	BookDetail()
	{
		title="java";
		price=250;
		quantity=10;
	}
	void dipsplay()
	{
		System.out.println("title is :"+title +"\t"+"Price is : "+price+"\t"+"quantity is :"+quantity); 
	}
	void discount()
	{
        double total=price * quantity;
		if(quantity > 5)
		{
			 total=total-(total *0.10);
			System.out.println("Apply dicount 10% ");
		}
		System.out.println("Total cost is :"+total);
	}
}
public class Book {

	public static void main(String[] args) {
		BookDetail bd=new BookDetail();
		bd.dipsplay();
		bd.discount();

	}

}
