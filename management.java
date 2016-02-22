import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class management extends JFrame {
	
	public ButtonGroup grp;
	public JRadioButton a[]=new JRadioButton[10];
	public int index;
	
	public management() {
		super("Course Manager");
		getContentPane().setLayout(null);
		Font pf=new Font("Serif",Font.PLAIN,25);
		Font pf1=new Font("Serif",Font.PLAIN,22);
		KG kg=new KG();
		grp=new ButtonGroup();
		int t=104;
		index=-1;
		JLabel lblAvailableCourses = new JLabel("  AVAILABLE COURSES @ IITKGP:");
		lblAvailableCourses.setFont(pf);
		lblAvailableCourses.setBounds(12, 13, 423, 88);
		getContentPane().add(lblAvailableCourses);
		
       if(courselist.courses.size()>0){
		for(int i=0;i<courselist.courses.size();i++)
		{  a[i] = new JRadioButton(courselist.courses.get(i).name);
		   a[i].setFont(pf);
		   a[i].setBounds(55,t, 263, 25);
		   getContentPane().add(a[i]);
		   grp.add(a[i]);
		   t=t+60;
		   a[i].addItemListener(kg);
			
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
		btnNewButton.setBounds(376, 601, 205, 44);
		getContentPane().add(btnNewButton);
		btnNewButton.setFont(pf);
		btnNewButton.addActionListener(
				new ActionListener(){
				public void actionPerformed(ActionEvent es)
				{  if(index==-1)
				{
					JOptionPane.showMessageDialog(null,"Please select a course to proceed.");
				}
					
					
				else{
					setVisible(false);
					editcourse1 fd=new editcourse1(index);
					fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					fd.setSize(660,630);
					fd.setVisible(true);
				    }
					
				}
				
				});
		
		
		JButton btnNewButton1 = new JButton("Back to Main menu");
		btnNewButton1.setBounds(12, 601, 335, 44);
		getContentPane().add(btnNewButton1);
		btnNewButton1.setFont(pf);
		btnNewButton1.addActionListener(
				new ActionListener(){
				public void actionPerformed(ActionEvent es)
				{  
					
					setVisible(false);
					class1 mans=new class1();
					mans.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					mans.setSize(669,659);
					mans.setVisible(true);
				}
				
				});
		
		
		
		
	}//end of constructor
	
	
	public class KG implements ItemListener
	{
		
	  public void itemStateChanged(ItemEvent ee)
	  {
		 for(int i=0;i<courselist.courses.size();i++)
		 {
			 if(ee.getItem()==a[i])
			 {
				 index=i;
			 }
			 
		 }
		  		  
	  }
		
		
	}//end of KG
	
	
	
	
}//end of class
