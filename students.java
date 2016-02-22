
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.*;
import java.lang.*;


public class students extends JFrame{
	
	
	public ButtonGroup grp3;
	public JRadioButton a3[]=new JRadioButton[10];
	public int index2;
	
	public students() {
		super("Students' Manager");
		getContentPane().setLayout(null);
		Font pf=new Font("Serif",Font.PLAIN,25);
		KGP kgp=new KGP();
		Font pf1=new Font("Serif",Font.PLAIN,22);
		grp3=new ButtonGroup();
		int t=104;
		index2=-1;
		JLabel lblAvailableCourses = new JLabel("AVAILABLE COURSES @ IITKGP:");
		lblAvailableCourses.setFont(pf);
		lblAvailableCourses.setBounds(12, 13, 423, 88);
		getContentPane().add(lblAvailableCourses);
		
       
		if(courselist.courses.size()>0){
		for(int i=0;i<courselist.courses.size();i++)
		{  a3[i] = new JRadioButton(courselist.courses.get(i).name);
		   a3[i].setFont(pf);
		   a3[i].setBounds(55,t, 263, 25);
		   getContentPane().add(a3[i]);
		   grp3.add(a3[i]);
		   t=t+60;
		   a3[i].addItemListener(kgp);
			
		}}
		
		 else
	       {
	    	JLabel lblAvailableCourses1 = new JLabel("No course offered currently..!!");
	   		lblAvailableCourses1.setFont(pf);
	   		lblAvailableCourses1.setBounds(15,139,263,38);
	   		getContentPane().add(lblAvailableCourses1);
	   		lblAvailableCourses1.setFont(pf1);
	       } 
		
		JButton btnNewButton = new JButton("Proceed>>");
		btnNewButton.setBounds(307, 604, 156, 44);
		getContentPane().add(btnNewButton);
		btnNewButton.setFont(pf);
		btnNewButton.addActionListener(
				new ActionListener(){
				public void actionPerformed(ActionEvent es)
				{  if(index2==-1)
				{
					JOptionPane.showMessageDialog(null,"Please select a course to proceed.");
				}
					
					
				else{
					 setVisible(false);
					students1 fd=new students1(index2);
					fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					fd.setSize(618, 566);
					fd.setVisible(true);
				    }
					
				}
				
				});
		

		JButton btnNewButton1 = new JButton("Back to Main menu");
		btnNewButton1.setBounds(12, 604, 283, 44);
		getContentPane().add(btnNewButton1);
		btnNewButton1.setFont(pf);
		btnNewButton1.addActionListener(
				new ActionListener(){
				public void actionPerformed(ActionEvent es)
				{  
					
					setVisible(false);
					class1 mans14=new class1();
					mans14.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					mans14.setSize(669,659);
					mans14.setVisible(true);
					
				}
				
				});
		
		
	}//end of constructor
	
	
	public class KGP implements ItemListener
	{
		
	  public void itemStateChanged(ItemEvent ee)
	  {
		 for(int i=0;i<courselist.courses.size();i++)
		 {
			 if(ee.getItem()==a3[i])
			 {
				 index2=i;
			 }
			 
		 }
		  		  
	  }
		
		
	}//end of KGP
	

	
	
}//end of class students
