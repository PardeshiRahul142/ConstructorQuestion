package gth.pck;
class BankIn
{
	int accNo;
	String name;
	double balance;
	double deposite;
	double withdrawal;
	BankIn()
	{
		accNo=7037;
		name="Rahul";
		balance=121000;
		deposite=5000;
		withdrawal=10000;
	}
	void BankOperation()
	{
		System.out.println("after deposite amount in account :"+(balance+=deposite));	
		if(balance > withdrawal)
		{
			System.out.println("after withdrawal amount :"+(balance-=withdrawal));
		}
		else
		{
			System.out.println("low Balance ");
		}
		double interest=balance*0.03;
		balance+=interest;
		System.out.println("Interst 3% :"+interest);
		System.out.println("total amount after interst :"+balance);
	}
	void FinalDetails()
	{
		System.out.println("-------------final Account details-----------------------");
		System.out.println("accNo is :"+accNo);
		System.out.println("Name is :"+name);
		System.out.println("balance :"+balance);
	}
}
public class ConstructorBank {

	public static void main(String[] args) {
		BankIn bi= new BankIn();
			bi.BankOperation();
			bi.FinalDetails();
	}
}
