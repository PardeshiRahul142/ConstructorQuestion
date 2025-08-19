//Q4. Question:
// Create a Java class Product with constructor overloading:
//First constructor takes productId, productName, and price.
//Second constructor takes productId, productName, price, and discountPercent.
//Perform the following:
//If discount is provided, calculate final price = price - (price × discount/100).
//If no discount is provided, keep price as it is.
//If price > 5000, apply an extra 5% discount automatically.

package gth.pck;
class Prod1
{
	int productId;
	String productName;
	int price;
	double discountPercent;
	
	Prod1(int pi, String pn,int p)
	{
		productId=pi;
		productName=pn;
		price=p;
	}
	
	Prod1(int pi, String pn,int p, double dp)
	{
		productId=pi;
		productName=pn;
		price=p;
		discountPercent=dp;
	}
	void discount()
	{
		double finalPrice = ( price - (price * discountPercent)/100);
	    if(finalPrice > 5000)
	    {
	    	   finalPrice+=finalPrice*0.05;
	    		System.out.println("after discount price is :"+finalPrice);
	    }
	    else
	    {
	       	System.out.println("after discount price is :"+finalPrice);
	    }
	}
	void Display()
	{
		System.out.println("productId :"+productId);
		System.out.println("productName :"+productName);
		System.out.println("price :"+price);
		
	}
	void Display1()
	{
		System.out.println("productId :"+productId);
		System.out.println("productName :"+productName);
		System.out.println("price :"+price);
		System.out.println("discountPercent :"+discountPercent);
	}
	
}
public class ProductConStructor {

	public static void main(String[] args) {
		
		Prod1 p=new Prod1(1,"Bag",500);
		      p.Display();
		System.out.println();
		Prod1 p1=new Prod1(1,"Book",1340,10);
		      p1.Display();
		      p1.discount();
		     
	}

}
