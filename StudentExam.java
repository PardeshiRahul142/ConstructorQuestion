//Q2. Write a Java program with a default constructor to store Student details (rollNo, name, marks in 3 subjects).
// Operations:
//Calculate total and average marks.
//
//
//Display "Pass" if average ≥ 40, else "Fail".
//
//
//Find and display the highest subject mark.

package gth.pck;
class StDetails
{
  int rollNo;
  String name;
  int marks1;
  int marks2;
  int marks3;
  
  StDetails()
  {
	   rollNo=1;
	   name="Rahul";
	   marks1=80;
	   marks2=87;
	   marks3=90;
  }
  void dislpay()
  {
	  int totalAvg=(marks1 + marks2 + marks3)/3;
	  System.out.println("RollNo :"+rollNo +"   "+"Name :"+name+"   "+"marks1 :"+marks1 +"   "+"marks2 :"+marks2+"   "+"marks3 :"+marks3);
	  if(totalAvg >=40)
	  {
		  System.out.println("Pass");
	  }
	  else
	  {
		  System.out.println("Fail");
	  }
  }
  void higestMarks()
  {
	  if(marks1 > marks2 && marks1 > marks3)
	  {
		  System.out.println("Higest marks is :"+marks1);
	  }
	  else if(marks2 > marks1 && marks2 > marks3)
	  {
		  System.out.println("Higest marks is :"+marks2);
	  }
	  else
	  {
		  System.out.println("Higest marks is :"+marks3);
	  }
	  
  }
  
}
public class StudentExam {

	public static void main(String[] args) {
		StDetails sd=new StDetails();
		sd.dislpay();
		sd.higestMarks();

	}

}
