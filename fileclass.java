
import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;


public class fileclass{
       File file;
	   PrintStream filestream;
	   FileReader fr;
	   BufferedReader br;
	  
	  //constructor
	  public fileclass(ArrayList<course> c,ArrayList<course> exp)throws Exception
	  {   Date now=new Date();
	      int diff;
	      SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
		  try {

				file = new File("course database.txt");

				// if file doesnt exists, then create it
				if (!file.exists())
				{
					file.createNewFile();
		        }
				
				else
				{  
					
					fr=new FileReader("course database.txt");
					br=new BufferedReader(fr);
					
					String line;	
				
					
					 
					 
					while((line=br.readLine())!=null)
					{   
					
					 while(line!=null&&line.equals("c"))
					 {   
						 
						 course cc=new course();
					     Date startdate=new Date();
						 line=br.readLine();
						 cc.name=line;
						 line=br.readLine();
						 cc.date=line;
						 startdate=dateFormatter.parse(line);
						 line=br.readLine();
						 cc.fees=(line);
						 line=br.readLine();
						 cc.duration=(line);
						 line=br.readLine();
						 cc.coordinator.name=line;
						 line=br.readLine();
						 cc.coordinator.department=line;
						 line=br.readLine();
						 cc.coordinator.address=line;
						 line=br.readLine();
						 cc.coordinator.mobileno=line;
						 line=br.readLine();
						 cc.coordinator.email=line;
						 
						
						 while((line=br.readLine())!=null&&line.equals("f"))
						 {  //fcount++;
							faculty x=new faculty();
							line=br.readLine();
							x.name=line;
							line=br.readLine();
							x.department=line;
							line=br.readLine();
							x.address=line;
							line=br.readLine();
							x.mobileno=line;
							line=br.readLine();
							x.email=line;
							cc.instructor.add(x);
						 }//end of instructor while
						 
						 
						 while((line=br.readLine())!=null&&line.equals("s"))
						 {  //scount++;
							participant y=new participant();
							line=br.readLine();
							y.name=line;
							line=br.readLine();
							y.orgname=line;
							line=br.readLine();
							y.address=line;
							line=br.readLine();
							y.mobileno=line;
							line=br.readLine();
							y.email=line;
							cc.student.add(y);
							
						 }
					    
					     
					      diff=(int)Math.abs(( (now.getTime()-startdate.getTime())/(1000*60*60*24)) );
					      
					     //If the difference between the two dates is less than 1 year, add that course to arraylist) 
					     if(diff<1826) {
				    	 c.add(cc); //adding course to the arraylist
					     }
					     else
					     {
					      exp.add(cc);	  
					     }
						 
					 } //end of course while(c)
					
			
					}//end of while(null)
				}//end of outer else
				
		     }//end of try
		  
		  
		  catch (IOException e) {
				e.printStackTrace();
			}
		  
	  }
	  //end of constructor
	  
	  
	  
	  //Function to update file
	  public void updatefile(ArrayList<course> c,ArrayList<course> ex)throws Exception
	  {   
	
		  filestream=new PrintStream("course database.txt");
		//course s=new course();
		//  faculty f=new faculty();
		  if(c!=null){
		  for(course s:c)
		  {   
			  filestream.println("c");
			  filestream.println(s.name);
			  filestream.println(s.date);
			  filestream.println(s.fees);
			  filestream.println(s.duration);
			  filestream.println(s.coordinator.name);
			  filestream.println(s.coordinator.department);
			  filestream.println(s.coordinator.address);
			  filestream.println(s.coordinator.mobileno);
			  filestream.println(s.coordinator.email);
			  
			 
			  for(faculty f:s.instructor)
			  {    filestream.println("f"); 
				   filestream.println(f.name);
			       filestream.println(f.department);
			       filestream.println(f.address);
			       filestream.println(f.mobileno);
			       filestream.println(f.email);
			  }
			    
			   
			// paticipant p=new participant();
			  for(participant p:s.student)
			  {    filestream.println("s");
			       filestream.println(p.name);
			       filestream.println(p.orgname);
			       filestream.println(p.address);
			       filestream.println(p.mobileno);
			       filestream.println(p.email);
			  }
			    
			  filestream.println(" ");
		  }//end of for (outer)
		  }
		  
		  if(ex!=null){
		  // coming to expired Arraylist
		  for(course s:ex)
		  {
			  filestream.println("c");
			  filestream.println(s.name);
			  filestream.println(s.date);
			  filestream.println(s.fees);
			  filestream.println(s.duration);
			  filestream.println(s.coordinator.name);
			  filestream.println(s.coordinator.department);
			  filestream.println(s.coordinator.address);
			  filestream.println(s.coordinator.mobileno);
			  filestream.println(s.coordinator.email);
			  
			 
			  for(faculty f:s.instructor)
			  {    filestream.println("f"); 
				   filestream.println(f.name);
			       filestream.println(f.department);
			       filestream.println(f.address);
			       filestream.println(f.mobileno);
			       filestream.println(f.email);
			  }
			    
			   
			// paticipant p=new participant();
			  for(participant p:s.student)
			  {    filestream.println("s");
			       filestream.println(p.name);
			       filestream.println(p.orgname);
			       filestream.println(p.address);
			       filestream.println(p.mobileno);
			       filestream.println(p.email);
			  }
			    
			  filestream.println(" ");    
			  
		  }//end of expired for loop
		  }
		    
		  filestream.close();
		  
	  }
	  //end of updatefile() function
	  
	  
	  //To close the file
	  public void closefile()throws Exception
	  {   
		 if(fr!=null&&br!=null){
		  fr.close();
		  br.close();
		 }
		  
	  }
	  //end of closefile()
	  
	  
	  
	}  
	  //end of f
	
	
	
	
	
	
	
	
	
	
	
	
