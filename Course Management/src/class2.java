import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.*;

import java.util.*;
import java.lang.*;
import java.beans.*;
import java.util.*;
import java.io.*;


public class class2 extends JFrame
{
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_4;
	public JTextField textField_5;
	public JTextField textField_6;
	public JTextField textField_7;
	public JTextField textField_8;
	public JLabel lblName;
	public JLabel lblDepartment;
	public JLabel lblAddress;
	public JLabel lblEmailId;
	public JLabel lblMobileNo;
	
	
    int t,t1,t2,t3,t4,t5,t6,t7,t8,a,a1;
    public course xx1;
	
    
	
    public class2()
	{  
	    
		super("Create new course");
		getContentPane().setLayout(null);
		
		
		 xx1=new course();
		 
		textField = new JTextField(""); //name
		textField.setBounds(83, 84, 435, 46);
		
		getContentPane().add(textField);
		textField.setColumns(10);
		textField.setUI(new HintTextFieldUI(" Enter full name",true));
		
		
		textField_1 = new JTextField(""); //fee
		textField_1.setColumns(10);
		textField_1.setBounds(83, 156, 435, 46);
		getContentPane().add(textField_1); 
		textField_1.setUI(new HintTextFieldUI(" Enter a natural no (without commas)",true));
		
		
		textField_2 = new JTextField("");//duration
		textField_2.setColumns(10);
		textField_2.setBounds(128, 236, 101, 46);
		getContentPane().add(textField_2);
		textField_2.setUI(new HintTextFieldUI(" natural no",true));
		
		
		textField_3 = new JTextField("");//date
		textField_3.setColumns(10);
		textField_3.setBounds(339, 236, 179, 46);
		getContentPane().add(textField_3);
		textField_3.setUI(new HintTextFieldUI(" dd-mm-yyyy format compulsory",true));
	
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(21, 82, 50, 50);
		getContentPane().add(lblNewLabel);
       
		
		
		JLabel label = new JLabel("Fee (INR):");
		label.setBounds(12, 156, 66, 50);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Duration(in days):");
		label_1.setBounds(12, 234, 104, 50);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Starting Date:");
		label_2.setBounds(241, 234, 86, 50);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("ENTER COURSE DETAILS:");
		label_3.setBounds(99, 10, 251, 50);
		getContentPane().add(label_3);
		
		JLabel lblEnterTheDetails = new JLabel("Enter the details of the course Coordinator:");
		lblEnterTheDetails.setBounds(21, 283, 261, 50);
		getContentPane().add(lblEnterTheDetails);
		
		
		
		textField_4 = new JTextField(""); //name
		textField_4.setBounds(83, 346, 418, 30);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		textField_4.setUI(new HintTextFieldUI(" Enter full name",true));
		
		
		textField_5 = new JTextField(""); //dep
		textField_5.setColumns(10);
		textField_5.setBounds(83, 389, 418, 30);
		getContentPane().add(textField_5);
		
		
		textField_6 = new JTextField(""); //add
		textField_6.setColumns(10);
		textField_6.setBounds(83, 432, 418, 38);
		getContentPane().add(textField_6);
		textField_6.setUI(new HintTextFieldUI(" Enter full address",true));
		
		
		textField_7 = new JTextField(""); //email
		textField_7.setColumns(10);
		textField_7.setBounds(83, 493, 418, 30);
		getContentPane().add(textField_7);
		textField_7.setUI(new HintTextFieldUI("@gmail.com",true));
		
		 
		textField_8 = new JTextField("");  //mobile
		textField_8.setColumns(10);
		textField_8.setBounds(83, 536, 243, 30);
		getContentPane().add(textField_8);
		textField_8.setUI(new HintTextFieldUI("+91",true));
		
		
		lblName = new JLabel("Name:");
		lblName.setBounds(21, 336, 50, 50);
		getContentPane().add(lblName);
		
		lblDepartment = new JLabel("Department:");
		lblDepartment.setBounds(12, 379, 78, 50);
		getContentPane().add(lblDepartment);
		
		lblAddress = new JLabel("Address:");
		lblAddress.setBounds(22, 432, 200, 50);
		getContentPane().add(lblAddress);
		
		lblEmailId = new JLabel("Email ID:");
		lblEmailId.setBounds(21, 483, 200, 50);
		getContentPane().add(lblEmailId);
		
		lblMobileNo = new JLabel("Mobile no:");
		lblMobileNo.setBounds(21, 526, 200, 50);
		getContentPane().add(lblMobileNo);
		
		JButton btnNewButton = new JButton("Done>>");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event1){
				  a=a1=0;
				  t=t1=t2=t3=t4=t5=t6=t7=t8=0;
				if(!textField.getText().equals(""))
				{  
					xx1.name= textField.getText();
					t=1;
				}
				  
				if(!textField_1.getText().equals(""))
				{  
					xx1.fees=(textField_1.getText());
					t1=1;
				}
				
				if(!textField_2.getText().equals(""))
				{   if(Integer.parseInt(textField_2.getText())>14)
				 {  a1=1;
					
				 }
				else{
				   xx1.duration=(textField_2.getText());
					t2=1;
				}
					
				}
				
				if(!textField_3.getText().equals(""))
				{   xx1.date=textField_3.getText();
					t3=1;
				}
				
				if(!textField_4.getText().equals(""))
				{   xx1.coordinator.name=textField_4.getText();
					t4=1;
				}
				
				if(!textField_5.getText().equals(""))
				{ xx1.coordinator.department=textField_5.getText();
					t5=1;
				}
				
				if(!textField_6.getText().equals(""))
				{ xx1.coordinator.address=textField_6.getText();
					t6=1;
				}
				
				if(!textField_7.getText().equals(""))
				{ xx1.coordinator.email=textField_7.getText();
					t7=1;
				}
				
				if(!textField_8.getText().equals(""))
				{   if(textField_8.getText().length()!=10)
				  { a=1;
					
				  }
				
					
				else{
					xx1.coordinator.mobileno=textField_8.getText();
					t8=1;}
			    }
				
				
				if(t==1&&t1==1&&t2==1&&t3==1&&t4==1&&t5==1&&t6==1&&t7==1&&t8==1)
				{  
					 Date now=new Date();
					 Date startdate=new Date();
				      int diff;
				      SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
				      try {
						startdate=dateFormatter.parse(xx1.date);
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				      diff=(int)Math.abs(((now.getTime()-startdate.getTime())/(1000*60*60*24)));
				      
					     //If the difference between the two dates is less than 1 year, add that course to arraylist) 
					     if(diff<1826) {
					    	 courselist.courses.add(xx1); //adding course to the arraylist
							 JOptionPane.showMessageDialog(null,"Course successsfully created !!\n To assign instructors, go to Course Management section.\nTo enroll students in this course, go to Students Database Portal.");

					     }
					     else
					     {
					     courselist.expired.add(xx1);
						 JOptionPane.showMessageDialog(null,"The course's not within 5 year frame,so it will be treated as inactive/expired and wont be diplayed in the course list.\nIf u still need to view its contents, check on your Database");

					     }
				
			    	try {
					courselist.ff.updatefile(courselist.courses,courselist.expired);
				  } catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				    }    
				
				    setVisible(false);
					//class3 bn=new class3(courselist.courses.size()-1);
				    class1 sid=new class1();
					sid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					sid.setSize(669,659);
					sid.setVisible(true);
					/*bn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					bn.setSize(400,400);
					bn.setVisible(true);*/
					
				}
				
				else
				{   if(a1!=1){
					if(a!=1){
					JOptionPane.showMessageDialog(null,"Please don't leave any field empty.");}
				else{
					JOptionPane.showMessageDialog(null,"Mobile number should be a 10 digit integer!!");
				}}
				else
					JOptionPane.showMessageDialog(null,"Max duration for a course is 14 days !!");
				}
				
				
			}
		});
		btnNewButton.setBounds(367, 572, 151, 61);
		getContentPane().add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("<<Back to main menu");
		btnNewButton_1.setBounds(21, 589, 306, 44);
		getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener()
		{
	public void actionPerformed(ActionEvent event)
	{
	    setVisible(false);
		class1 siddu=new class1();
		
		siddu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		siddu.setSize(669,659);
		siddu.setVisible(true);
		
		
	
		
	
	}});
		
		
	}//end of button
}//end of class
