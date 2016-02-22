
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class students1 extends JFrame {
	
	public ButtonGroup grp4;
	public JRadioButton b1[]=new JRadioButton[5];
	public int index12;
	public int ik;
	
	
	public students1(int ip)
	{ 
		super("Students' Manager");
        getContentPane().setLayout(null);
        Font pf=new Font("Serif",Font.PLAIN,25);
        Font pf1=new Font("Serif",Font.PLAIN,20);
        index12=-1;
        ik=ip;
        grp4=new ButtonGroup();
   //     l=courselist.courses.get(ik).student.size();
        JLabel label = new JLabel(" Students enrolled for this course:");
        label.setBounds(61, 13, 488, 50);
        getContentPane().add(label);
        label.setFont(pf);
        int it=79;
        
        GKF gkf=new GKF();
        
        if(courselist.courses.get(ip).student.size()==0)
        {
        	JLabel label1=new JLabel("No student enrolled in this course so far...");
        	label1.setBounds(80,65,451,50);
        	 getContentPane().add(label1);
             label1.setFont(pf1);
        }
        
        else{
        for(int im=0;im<courselist.courses.get(ip).student.size();im++)
		{  b1[im] = new JRadioButton(courselist.courses.get(ip).student.get(im).name);
		   b1[im].setFont(pf);
		   b1[im].setBounds(106,it, 200, 50);
		   getContentPane().add(b1[im]);
		   grp4.add(b1[im]);
		   it=it+60;
		   b1[im].addItemListener(gkf);
			
		}
         }//end of else
        
        
        JButton btnAddNewInstructor = new JButton("Enroll new student ");
        btnAddNewInstructor.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e1) {
        	   
        		if(courselist.courses.get(ik).student.size()<5)
        		{
        		 setVisible(false);	
            	 students2 pp=new students2(courselist.courses.get(ik).student.size(),ik);
        		 pp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 pp.setSize(640,500);
				 pp.setVisible(true); 
        		}
        		
        		else
        		{
        			JOptionPane.showMessageDialog(null,"Sorry !! Max. no of students for a course (5) is reached !! ");	
        		}
        			
        			
        			
        	}
        });
        btnAddNewInstructor.setBounds(12, 391, 190, 50);
        getContentPane().add(btnAddNewInstructor);
        
        JButton btnNewButton = new JButton("Delete Student");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		
        	
        		   if(index12==-1){
        			   JOptionPane.showMessageDialog(null,"Please select a student and then proceed.. ");
        		   }
        			
        			
        		
        		else{
        			
        			courselist.courses.get(ik).student.remove(index12);
        			// update file
        			try {
    					courselist.ff.updatefile(courselist.courses,courselist.expired);
    				  } catch (Exception e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				    }   
        			JOptionPane.showMessageDialog(null,"Successfully deleted !! ");
        			setVisible(false);
        			class1 sid=new class1();
    				sid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    				sid.setSize(669,659);
    				sid.setVisible(true);
        			
        		}
        		
        	}
        	
        });
        
        
        btnNewButton.setBounds(214, 391, 174, 50);
        getContentPane().add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Edit student's details");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e2) {
        		if(index12==-1)
        		{
        			JOptionPane.showMessageDialog(null,"Please select a student and then proceed.. ");
        		}
        		
        		
        	else{
        		 setVisible(false);
        		 students3 ff=new students3(index12,ik);
        		 ff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 				 ff.setSize(640,500);
 				 ff.setVisible(true);
        	}
        		
        		
        	}
        });
        btnNewButton_1.setBounds(410, 391, 174, 50);
        getContentPane().add(btnNewButton_1);
        
        JButton btnNewButton2 = new JButton("Back to Main menu");
		btnNewButton2.setBounds(12, 452, 572, 44);
		getContentPane().add(btnNewButton2);
		btnNewButton2.setFont(pf);
		btnNewButton2.addActionListener(
				new ActionListener(){
				public void actionPerformed(ActionEvent es)
				{  
					
					setVisible(false);
				/*	class1 sid=new class1();
					sid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					sid.setSize(669,659);
					sid.setVisible(true);*/
				}
					
				
				
				});
    
		
	}//end of constructor
	

	public class GKF implements ItemListener
	{
		
	  public void itemStateChanged(ItemEvent ee)
	  {
		 for(int i=0;i<courselist.courses.get(ik).student.size();i++)
		 {
			 if(ee.getItem()==b1[i])
			 {
				 index12=i;
			 }
			 
		 }
		  		  
	  }
		
		
	}//end of GKF
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//end of students1
