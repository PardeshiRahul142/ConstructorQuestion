package gth.pck;
class StdIn
{
	int rollNo;
	String name;
	int sub1;
	int sub2;
	int sub3;
	int sub4;
	int sub5;

	 StdIn(int roll , String n , int s1 , int s2,int s3)
	 {
		 this.rollNo=roll;
		 this.name=n;
		 this.sub1=s1;
		 this.sub2=s2;
		 this.sub3=s3;
	 }
	 StdIn(int roll , String n , int s1 , int s2,int s3,int s4 , int s5)
	 {
		 this.rollNo=roll;
		 this.name=n;
		 this.sub1=s1;
		 this.sub2=s2;
		 this.sub3=s3;
		 this.sub4=s4;
		 this.sub5=s5;
	 }
	 void totalMark()
	 {   
		 int totalmarks=sub1+sub2+sub3;
		 int per=totalmarks/3;
		 System.out.println("total marks ="+totalmarks);
		 System.out.println("Percentage is ="+per);
		 
		 if(per >= 75 )
		 {
			 System.out.println("Grade A ");
		 }
		 else if(per >= 60 && per <75)
		 {
			 System.out.println("Grade B");
		 }
		 else
		 {
			 System.out.println("Grade C");
		 }
	 }
	 void totalMark1()
	 {   
		 int totalmarks=sub1+sub2+sub3+sub4+sub5;
		 int per=totalmarks/5;
		 System.out.println("total marks ="+totalmarks);
		 System.out.println("Percentage is ="+per);
		 
		 if(per >= 75 )
		 {
			 System.out.println("Grade A ");
		 }
		 else if(per >= 60 && per <75)
		 {
			 System.out.println("Grade B");
		 }
		 else
		 {
			 System.out.println("Grade C");
		 }
	 }
	 void display()
	 {
		 System.out.println("roll no is :"+rollNo);
		 System.out.println("Name is :"+name);
		 System.out.println("all subject marks is : "+( sub1 +" "+sub2+" "+sub3));
	 }
	 void display1()
	 {
		 System.out.println("roll no is :"+rollNo);
		 System.out.println("Name is :"+name);
		 System.out.println("all subject marks is : "+( sub1 +" "+sub2+" "+sub3+" "+sub4+"  "+sub5));
	 }
}
public class StudConOver {

	public static void main(String[] args) {
		StdIn st=new StdIn(1,"Rahul",80,70,78);
	          st.display();
		      st.totalMark();
		 System.out.println();
	    StdIn st1=new StdIn(2,"Pranju",68,76,79,70,78);
	          st.display1();
	          st1.totalMark1();
	         
	}

}
