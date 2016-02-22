import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class editcourse1 extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	public int i;
	int t,t1,t2,t3,t4,t5,t6,t7,t8,y,y1;
	
	public editcourse1(int x)
	{ 
		super(courselist.courses.get(x).name);
		getContentPane().setLayout(null);
		Font pf=new Font("Serif",Font.ITALIC,14);
		Font kf=new Font("Serif",Font.PLAIN,21);
		Font pkf=new Font("Serif",Font.PLAIN,19);
	    i=x;
	   
		JLabel lblEditTheCorresponding = new JLabel("Edit the corresponding fields of the course:");
		lblEditTheCorresponding.setBounds(50, 43, 419, 43);
		getContentPane().add(lblEditTheCorresponding);
		lblEditTheCorresponding.setFont(kf);
		
		JLabel lblEditName = new JLabel("Edit Name:");
		lblEditName.setBounds(33, 120, 77, 16);
		getContentPane().add(lblEditName);
		
		JLabel lblFees = new JLabel("Fees:");
		lblFees.setBounds(33, 167, 56, 16);
		getContentPane().add(lblFees);
		
		JLabel lblDurationinDays = new JLabel("Duration (in days):");
		lblDurationinDays.setBounds(198, 167, 112, 16);
		getContentPane().add(lblDurationinDays);
		
		JLabel lblStartingDate = new JLabel("Starting Date:");
		lblStartingDate.setBounds(386, 167, 90, 16);
		getContentPane().add(lblStartingDate);
		
		JLabel lblCoordinatorOfThe = new JLabel("Coordinator of the course:");
		lblCoordinatorOfThe.setBounds(50, 241, 211, 16);
		getContentPane().add(lblCoordinatorOfThe);
		lblCoordinatorOfThe.setFont(pkf);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(33, 295, 56, 16);
		getContentPane().add(lblName);
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setBounds(25, 342, 77, 16);
		getContentPane().add(lblDepartment);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(33, 387, 56, 16);
		getContentPane().add(lblAddress);
		
		JLabel lblEmailId = new JLabel("Email ID:");
		lblEmailId.setBounds(33, 454, 56, 16);
		getContentPane().add(lblEmailId);
		
		JLabel lblMobileNo = new JLabel("Mobile no:");
		lblMobileNo.setBounds(343, 454, 77, 16);
		getContentPane().add(lblMobileNo);
		
		
		
		textField = new JTextField(courselist.courses.get(i).name);
		textField.setBounds(113, 110, 286, 37);
		getContentPane().add(textField);
		textField.setColumns(10);
		textField.setFont(pf);
		textField.setUI(new HintTextFieldUI("Enter full name",true));
		
		textField_1 = new JTextField((courselist.courses.get(i).fees));
		textField_1.setBounds(70, 164, 116, 22);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		textField_1.setFont(pf);
		textField_1.setUI(new HintTextFieldUI("Enter a natural no(without commas)",true));
		
		textField_2 = new JTextField((courselist.courses.get(i).duration));
		textField_2.setBounds(309, 164, 65, 22);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		textField_2.setFont(pf);
		textField_2.setUI(new HintTextFieldUI("Enter only a natural no",true));
		
		textField_3 = new JTextField(courselist.courses.get(i).date);
		textField_3.setBounds(475, 164, 152, 22);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		textField_3.setFont(pf);
		textField_3.setUI(new HintTextFieldUI("dd-mm-yyyy format compulsory",true));
		
		textField_4 = new JTextField(courselist.courses.get(i).coordinator.name);
		textField_4.setBounds(88, 285, 351, 37);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		textField_4.setFont(pf);
		textField_4.setUI(new HintTextFieldUI("Enter full name",true));
		
		textField_5 = new JTextField(courselist.courses.get(i).coordinator.department);
		textField_5.setBounds(98, 339, 340, 22);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		textField_5.setFont(pf);
		
		textField_6 = new JTextField(courselist.courses.get(i).coordinator.address);
		textField_6.setBounds(101, 384, 351, 43);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		textField_6.setFont(pf);
		textField_6.setUI(new HintTextFieldUI("Enter full address",true));
		
		textField_7 = new JTextField(courselist.courses.get(i).coordinator.email);
		textField_7.setBounds(101, 451, 230, 22);
		getContentPane().add(textField_7);
		textField_7.setColumns(10);
		textField_7.setFont(pf);
		textField_7.setUI(new HintTextFieldUI("@gmail.com",true));
		
		textField_8 = new JTextField(courselist.courses.get(i).coordinator.mobileno);
		textField_8.setBounds(412, 451, 195, 22);
		getContentPane().add(textField_8);
		textField_8.setColumns(10);
		textField_8.setFont(pf);
		textField_8.setUI(new HintTextFieldUI("+91",true));
		
		
		
		JButton btnNewButton = new JButton("Course Instructors>>");
		btnNewButton.setBounds(33, 517, 295, 49);
		getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 t=t1=t2=t3=t4=t5=t6=t7=t8=y=y1=0;
				
				if(!textField.getText().equals(""))
				{  
					 courselist.courses.get(i).name= textField.getText();
					 t=1;
				}
				  
				if(!textField_1.getText().equals(""))
				{  
					 courselist.courses.get(i).fees= (textField_1.getText());
					t1=1;
				}
				
				if(!textField_2.getText().equals(""))
				{   
					if(Integer.parseInt(textField_2.getText())>14)
					 {
						
						y1=1;
					 }
					else{
					   courselist.courses.get(i).duration=(textField_2.getText());
						t2=1;}
						
				}
				
				if(!textField_3.getText().equals(""))
				{    courselist.courses.get(i).date=textField_3.getText();
					t3=1;
				}
				
				if(!textField_4.getText().equals(""))
				{    courselist.courses.get(i).coordinator.name=textField_4.getText();
					t4=1;
				}
				
				if(!textField_5.getText().equals(""))
				{  courselist.courses.get(i).coordinator.department=textField_5.getText();
					t5=1;
				}
				
				if(!textField_6.getText().equals(""))
				{  courselist.courses.get(i).coordinator.address=textField_6.getText();
					t6=1;
				}
				
				if(!textField_7.getText().equals(""))
				{  courselist.courses.get(i).coordinator.email=textField_7.getText();
					t7=1;
				}
				
				if(!textField_8.getText().equals(""))
				{  
					 if(textField_8.getText().length()!=10)
					  { y=1;
						
					  }
						
					else{
						courselist.courses.get(i).coordinator.mobileno=textField_8.getText();
						t8=1;}
				}
				
				
				if(t==1&&t1==1&&t2==1&&t3==1&&t4==1&&t5==1&&t6==1&&t7==1&&t8==1){
					
					Date now=new Date();
					 Date startdate=new Date();
				      int diff;
				      SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
				      try {
						startdate=dateFormatter.parse( courselist.courses.get(i).date);
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				      diff=(int)Math.abs(((now.getTime()-startdate.getTime())/(1000*60*60*24)));
				      
					     //If the difference between the two dates is less than 1 year, add that course to arraylist) 
					     if(diff<1826) {
                                      //peace maar
					     }
					     else
					     {
					     courselist.expired.add(courselist.courses.get(i));
					     courselist.courses.remove(i);
						 JOptionPane.showMessageDialog(null,"Since the course's not within 5 year time-frame, it will be treated as inactive/expired and wont be diplayed in the course list.\nIf u still need to view its contents, check on your Database");

					     }
					

					try {
						courselist.ff.updatefile(courselist.courses,courselist.expired);
					  } catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					    }   
				setVisible(false);
				instredit bb=new instredit(i);
				bb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				bb.setSize(654,595);
				bb.setVisible(true);
				}
				
				else
				{ if(y1!=1){
					if(y!=1){
					JOptionPane.showMessageDialog(null,"Please dont leave any field empty.");}
				else{
					JOptionPane.showMessageDialog(null,"Mobile number should be a 10 digit integer!!");
				}
					}
				else
					JOptionPane.showMessageDialog(null,"Max duration for a course is 14 days !!");
				
				
				
				}
				
				/*
				setVisible(false);
				management fd=new management();
				fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fd.setSize(623,653);
				fd.setVisible(true);
				*/
			}
		});
		
		
		JButton btnNewButton_1 = new JButton("Save and Close");
		btnNewButton_1.setBounds(413, 517, 194, 49);
		getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener(){
			
           public void actionPerformed(ActionEvent arg1) {
        	   t=t1=t2=t3=t4=t5=t6=t7=t8=y=0;
        	   if(!textField.getText().equals(""))
				{  
					 courselist.courses.get(i).name= textField.getText();
					t=1;
				}
				  
				if(!textField_1.getText().equals(""))
				{  
					 courselist.courses.get(i).fees= textField_1.getText();
					t1=1;
				}
				
				if(!textField_2.getText().equals(""))
				{     
					if(Integer.parseInt(textField_2.getText())>14)
					 { y1=1;
					 }
					else{
					   courselist.courses.get(i).duration=(textField_2.getText());
						t2=1;
					}
				}
				
				if(!textField_3.getText().equals(""))
				{    courselist.courses.get(i).date=textField_3.getText();
					t3=1;
				}
				
				if(!textField_4.getText().equals(""))
				{    courselist.courses.get(i).coordinator.name=textField_4.getText();
					t4=1;
				}
				
				if(!textField_5.getText().equals(""))
				{  courselist.courses.get(i).coordinator.department=textField_5.getText();
					t5=1;
				}
				
				if(!textField_6.getText().equals(""))
				{  courselist.courses.get(i).coordinator.address=textField_6.getText();
					t6=1;
				}
				
				if(!textField_7.getText().equals(""))
				{  courselist.courses.get(i).coordinator.email=textField_7.getText();
					t7=1;
				}
				
				if(!textField_8.getText().equals(""))
				{
					 if(textField_8.getText().length()!=10)
					  { y=1;
					  }
						
					else{
						courselist.courses.get(i).coordinator.mobileno=textField_8.getText();
						t8=1;}

				}
				
				
				if(t==1&&t1==1&&t2==1&&t3==1&&t4==1&&t5==1&&t6==1&&t7==1&&t8==1){
					
					try {
						courselist.ff.updatefile(courselist.courses,courselist.expired);
					  }
					catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					    }   
        	   
        	   JOptionPane.showMessageDialog(null,"Course edited successfully!!"); 	   
        	   setVisible(false);
        	    class1 sid=new class1();
				sid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				sid.setSize(669,659);
				sid.setVisible(true);
        	   
				}
				
				else
				{  if(y1!=1){
					if(y!=1){
					JOptionPane.showMessageDialog(null,"Please dont leave any field empty.");}
				else
					JOptionPane.showMessageDialog(null,"Mobile number should be a 10 digit integer!!");
				  }
				else
					{JOptionPane.showMessageDialog(null,"Max duration for a course is 14 days !!");}
               
                }
				
			}	

		});


	}//end of constructor
	

	
	
	
}//end of the class
