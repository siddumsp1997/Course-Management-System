import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.util.*;


public class instredit extends JFrame{
	
	public ButtonGroup grp1;
	public JRadioButton a1[]=new JRadioButton[5];
	public int index1;
	public int ik;
	
	public instredit(int i)
	{ 
		super("Course Instructors");
        getContentPane().setLayout(null);
        Font pf=new Font("Serif",Font.PLAIN,25);
        Font pf1=new Font("Serif",Font.PLAIN,19);
        index1=-1;
        ik=i;
        JLabel label = new JLabel("  Available Instructors for this course:");
        label.setBounds(98, 13, 451, 50);
        getContentPane().add(label);
        label.setFont(pf);
        int it=79;
        grp1=new ButtonGroup();
        GK gk=new GK();
        
        if(courselist.courses.get(i).instructor.size()==0)
        {
        	JLabel label1=new JLabel("No instructors alloted for this course so far...");
        	label1.setBounds(98,65,451,50);
        	 getContentPane().add(label1);
             label1.setFont(pf1);
        }
        
        else{
        for(int im=0;im<courselist.courses.get(i).instructor.size();im++)
		{  a1[im] = new JRadioButton(courselist.courses.get(i).instructor.get(im).name);
		   a1[im].setFont(pf);
		   a1[im].setBounds(106,it, 200, 50);
		   getContentPane().add(a1[im]);
		   grp1.add(a1[im]);
		   it=it+60;
		   a1[im].addItemListener(gk);
			
		}
        }
        
        
        JButton btnAddNewInstructor = new JButton("Add new Instructor ");
        btnAddNewInstructor.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e1) {
        	   
        		if(courselist.courses.get(ik).instructor.size()<5)
        		{
        		 setVisible(false);	
        		 instr pp=new instr(courselist.courses.get(ik).instructor.size(),ik);
        		 pp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 pp.setSize(640,500);
				 pp.setVisible(true);
        		}
        		
        		else
        		{
        			JOptionPane.showMessageDialog(null,"Sorry !! Max. no of instructors(5) for a course is reached !! ");
        			
        			
        		}
        			
        			
        			
        	}
        });
        btnAddNewInstructor.setBounds(12, 419, 177, 50);
        getContentPane().add(btnAddNewInstructor);
        
        JButton btnNewButton = new JButton("Delete Instructor");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		
        		if(courselist.courses.get(ik).instructor.size()==0)
        		{
        			JOptionPane.showMessageDialog(null,"Sorry !! No instructor to delete !! ");
        		}
        		else
        		{
        			courselist.courses.get(ik).instructor.remove(index1);
        			try {
    					courselist.ff.updatefile(courselist.courses,courselist.expired);
    				  } catch (Exception e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				    }   	
        			JOptionPane.showMessageDialog(null,"Successfully deleted !! ");
        			setVisible(false);
					editcourse1 fd=new editcourse1(ik);
					fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					fd.setSize(660,630);
					fd.setVisible(true);
        			
        		}
        		
        		
        	}
        });
        
        
        btnNewButton.setBounds(214, 419, 177, 50);
        getContentPane().add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Edit Instructor's details");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e2) {
        		if(index1==-1)
        		{
        			JOptionPane.showMessageDialog(null,"Please select an instructor and then proceed.. ");
        		}
        		
        		
        	else{ 
        		  setVisible(false);
        		 instredit1 ff=new instredit1(index1,ik);
        		 ff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 				 ff.setSize(640,500);
 				 ff.setVisible(true);
        	}
        		
        		
        	}
        });
        btnNewButton_1.setBounds(406, 419, 200, 50);
        getContentPane().add(btnNewButton_1);
        
        JButton btnNewButton2 = new JButton("Back to Main menu");
		btnNewButton2.setBounds(12, 482, 606, 44);
		getContentPane().add(btnNewButton2);
		btnNewButton2.setFont(pf);
		btnNewButton2.addActionListener(
				new ActionListener(){
				public void actionPerformed(ActionEvent es)
				{  
					
					setVisible(false);
					
				}
				
				});
		
        
        
	}//end of constructor
	

	public class GK implements ItemListener
	{
		
	  public void itemStateChanged(ItemEvent ee)
	  {
		 for(int p=0;p<courselist.courses.get(ik).instructor.size();p++)
		 {
			 if(ee.getItem()==a1[p])
			 {
				 index1=p;
			 }
			 
		 }
		  		  
	  }
		
		
	}//end of GK
	
	
}
