
import javax.swing.*;
import java.util.*;




public class mainclass {

	
	public static void main(String args[])throws Exception
	{    
		 courselist.courses=new ArrayList<>();
		 courselist.expired=new ArrayList<>();
		 courselist.ff=new fileclass(courselist.courses,courselist.expired); 
		
		firstpage sids=new firstpage();
		
		sids.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sids.setSize(706,611);
		sids.setVisible(true);
		
		try {
			courselist.ff.updatefile(courselist.courses,courselist.expired);
		  } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }  
		
		courselist.ff.closefile(); //closing the text file
	}
	//end of main program
	
}
//end of main class

//courselist.ff.updatefile(courselist.courses,courselist.expired);
