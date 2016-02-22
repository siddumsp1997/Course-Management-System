import java.util.ArrayList;
import java.util.Scanner;

public class course {
	  public String name;   //course name
	  public String date;  // starting date of the course
	  public String fees;    // course fees
	  public String duration; //maximum value for duration can be 14 days
	//  public int studentcount,instructcount; // no of students and instructors present
	  public faculty coordinator;         
	  public ArrayList<faculty> instructor=new ArrayList<>();
	  public ArrayList<participant> student=new ArrayList<>();
	
//	  
	  //constructor
	  public course()
	  {
		  name=date="";
		  fees=duration="";
		 
		  coordinator=new faculty();
	  }
	  
	 
	  

}
//end of the class course


