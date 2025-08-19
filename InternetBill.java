package gth.pck;
class Recharge
{
	int customerId;
	String customerName;
	float dataUsedInGB;
	String planType;
	
	Recharge(int cid, String cname , float datause)
	{
		customerId=cid;
		customerName=cname;
		dataUsedInGB=datause;
	}
	Recharge(int cid, String cname , float datause,String planT)
	{
		customerId=cid;
		customerName=cname;
		dataUsedInGB=datause;
		planType=planT;
	}
	void FinallBill()
	{
		double cost=dataUsedInGB * 50;
		
		if(dataUsedInGB > 100)
		{
			cost=cost*0.15;
			System.out.println("Total bill is :"+cost);
		}
		else
		{
			System.out.println("Total bill is:"+cost);
		}
	}
	
	void FinallBill1()
	{
		double cost;
		if(planType.equalsIgnoreCase("Premium"))
		{
			cost=dataUsedInGB * 40;
		}
		else
		{
			cost=dataUsedInGB * 50;
		}
	
		if(dataUsedInGB > 100)
		{
			cost=cost*0.15;
			System.out.println("Total bill is :"+cost);
		}
		else
		{
			System.out.println("Total bill is:"+cost);
		}
	}
	void display()
	{
		System.out.println("customerId is :"+customerId);
		System.out.println("customerName is :"+customerName);
		System.out.println("dataUsedInGB is :"+dataUsedInGB);
		
	}
	
	void display1()
	{
		System.out.println("customerId is :"+customerId);
		System.out.println("customerName is :"+customerName);
		System.out.println("dataUsedInGB is :"+dataUsedInGB);
		System.out.println("planType is :"+planType);
	}
}
public class InternetBill {

	public static void main(String[] args) {
  
		Recharge re=new Recharge(1,"Rahul",50);
		         re.display();
		         re.FinallBill();
		        System.out.println();
	    Recharge re1=new Recharge(2,"Pranjali",120,"Premium");
	             re1.display1();
	             re1.FinallBill1();
 	}

}
