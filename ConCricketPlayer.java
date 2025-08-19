//Q9. Create a class CricketPlayer with overloaded constructors:
//Constructor 1: Accepts playerId, playerName, runsScored, ballsFaced.
//Constructor 2: Accepts playerId, playerName, runsScored, ballsFaced, fours, sixes.
// Inside the constructors:
//Calculate strike rate = (runsScored / ballsFaced) × 100
//If fours and sixes are given, also calculate boundary runs percentage = ( (fours×4 + sixes×6) / runsScored ) × 100
//Display strike rate and boundary run percentage.
package gth.pck;
class Cricket1
{
	int  playerId;
	String playerName;
	int runsScored;
	int ballsFaced;
	int fours;
	int sixes;
	
	Cricket1(int pi,String pn,int rs,int bf)
	{
		playerId=pi;
		playerName=pn;
		runsScored=rs;
		ballsFaced=bf;	
	}
	Cricket1(int pi,String pn,int rs,int bf,int f,int s)
	{
		playerId=pi;
		playerName=pn;
		runsScored=rs;
		ballsFaced=bf;	
		fours=f;
		sixes=s;
	}
	void StrickRate()
	{
		double Strick= 100 *(runsScored / ballsFaced);
		System.out.println("The strick rate is : "+Strick);
	}
	void StrickRate1()
	{
		double Strick= 100 *(runsScored / ballsFaced);
		System.out.println("The strick rate is : "+Strick);
		float percentage =100*( (fours * 4 + sixes * 6) / runsScored );
		System.out.println("boundary runs percentage is :"+percentage);
	}
	void display()
	{
		System.out.println("playerId :"+playerId);
		System.out.println("playerName :"+playerName);
		System.out.println("runsScored :"+runsScored);
		System.out.println("ballsFaced :"+ballsFaced);
	}
	void display1()
	{
		System.out.println("playerId :"+playerId);
		System.out.println("playerName :"+playerName);
		System.out.println("runsScored :"+runsScored);
		System.out.println("ballsFaced :"+ballsFaced);
		System.out.println("fours :"+fours);
        System.out.println("sixes :"+sixes);
    }
}
public class ConCricketPlayer {

	public static void main(String[] args) {
		
		Cricket1 cr1=new Cricket1(1,"Rahul",1000,600);
		         cr1.display();
		         cr1.StrickRate();
		         System.out.println();
	    Cricket1 cr2=new Cricket1(1,"Rohan",800,800,4,5);
	             cr2.display();
	             cr2.StrickRate();
		
		         
	}

}
