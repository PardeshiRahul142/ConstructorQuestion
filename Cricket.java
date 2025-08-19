package gth.pck;
class CricketInfo
{
    String name;
    int matches;
    int runsm1;
    int runsm2;
    int runsm3;
    
    CricketInfo()
    {
    	 name="Rahul";
    	 matches=3;
    	 runsm1=90;
    	 runsm2=120;
    	 runsm3=59;
    }
    void Display()
    {
    	  int totalRun=runsm1+runsm2+runsm3;
    	  if(runsm1 >runsm2 &&runsm1 > runsm3 )
    	  {
    		  System.out.println("Higest score is :"+runsm1);
    	  }
    	  else if(runsm2 > runsm1 && runsm2 > runsm1)
    	  {
    		  System.out.println("Higest score is :"+runsm2);
    	  }
    	  else
    	  {
    		  System.out.println("Higest score is :"+runsm3);

    	  }
    	  int avg=totalRun/matches;
    	  System.out.println("batting average is :"+avg);
    	  if(avg >= 50)
    	  {
    		  System.out.println("Player is star");
    	  }
    }
    void PlayDisp()
    {
    	System.out.println("player name is :"+name);
    	System.out.println("player played mates is :"+matches);
    	System.out.println("All matches run is :"+ runsm1 +" "+runsm2 +" "+runsm3);
    }
}
public class Cricket {

	public static void main(String[] args) {
     CricketInfo ci=new CricketInfo();
     ci.Display();
     ci.PlayDisp();
	}

}
