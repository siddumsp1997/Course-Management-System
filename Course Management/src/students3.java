import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class students3 extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	public int kp,pk;
	int a,a1,a2,a3,a4,c;
	
	
	public students3(int i,int cno)
	{   
		super("Edit Student details");
		getContentPane().setLayout(null);
		
		 kp=cno;
		 pk=i;
		
		 Font pf=new Font("Serif",Font.ITALIC,14);
		JLabel lblName = new JLabel("NAME:");
		lblName.setBounds(51, 30, 65, 50);
		getContentPane().add(lblName);
		
		textField = new JTextField(courselist.courses.get(cno).student.get(i).name);
		textField.setBounds(112, 30, 443, 50);
		getContentPane().add(textField);
		textField.setColumns(10);
		textField.setFont(pf);
		textField.setUI(new HintTextFieldUI(" Enter full name",true));
		
		textField_1 = new JTextField(courselist.courses.get(cno).student.get(i).orgname);
		textField_1.setColumns(10);
		textField_1.setBounds(112, 101, 443, 50);
		getContentPane().add(textField_1);
		textField_1.setFont(pf);
	
		
		JLabel lblDepartment = new JLabel("DEPARTMENT:");
		lblDepartment.setBounds(16, 101, 100, 50);
		getContentPane().add(lblDepartment);
		
		JLabel lblAddress = new JLabel("ADDRESS:");
		lblAddress.setBounds(40, 174, 200, 50);
		getContentPane().add(lblAddress);
		
		textField_2 = new JTextField(courselist.courses.get(cno).student.get(i).address);
		textField_2.setBounds(112, 174, 443, 82);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		textField_2.setFont(pf);
		textField_2.setUI(new HintTextFieldUI(" Enter full address",true));
		
		JLabel lblMobileNo = new JLabel("MOBILE NO:");
		lblMobileNo.setBounds(31, 275, 85, 50);
		getContentPane().add(lblMobileNo);
		
		textField_3 = new JTextField(courselist.courses.get(cno).student.get(i).mobileno);
		textField_3.setBounds(112, 275, 246, 50);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		textField_3.setFont(pf);
		textField_3.setUI(new HintTextFieldUI("+91",true));
		
		JLabel lblEmailId = new JLabel("EMAIL ID:");
		lblEmailId.setBounds(45, 338, 71, 50);
		getContentPane().add(lblEmailId);
		
		textField_4 = new JTextField(courselist.courses.get(cno).student.get(i).email);
		textField_4.setBounds(112, 338, 271, 50);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		textField_4.setFont(pf);
		textField_4.setUI(new HintTextFieldUI("@gmail.com",true));
		
		JButton btnNewButton = new JButton("DONE !");
		btnNewButton.setBounds(424, 288, 141, 69);
		getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener()
		{ public void actionPerformed(ActionEvent h)
			{ a=a1=a2=a3=a4=c=0;

			 if(!textField.getText().equals(""))
		      {  
		    	  courselist.courses.get(kp).student.get(pk).name=textField.getText();
		    	  a=1;
		      }
		      
		      if(!textField_1.getText().equals(""))
		      {  
		    	  courselist.courses.get(kp).student.get(pk).orgname=textField_1.getText();
		    	  a1=1;
		      }
		      
		      if(!textField_2.getText().equals(""))
		      {  
		    	  courselist.courses.get(kp).student.get(pk).address=textField_2.getText();
		    	  a2=1;
		      }
		      
		      if(!textField_3.getText().equals(""))
		      {  
		    	  courselist.courses.get(kp).student.get(pk).mobileno=textField_3.getText();
		    	  a3=1;
		    	  
		    	  if(textField_3.getText().length()!=10)
				  {  c=1;
					 }
					
				else{
					courselist.courses.get(kp).student.get(pk).mobileno=textField_3.getText();
					a3=1;}
		    	  
		      }
		      if(!textField_4.getText().equals(""))
		      {  
		    	  courselist.courses.get(kp).student.get(pk).email=textField_4.getText();
		    	  a4=1;
		      }	
			
		      if(a==1&&a1==1&&a2==1&&a3==1&&a4==1){
			//update file
			try {
				courselist.ff.updatefile(courselist.courses,courselist.expired);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			JOptionPane.showMessageDialog(null,"Editing successfull !!");
		        setVisible(false);
				students1 fd=new students1(kp);
				fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fd.setSize(618, 566);
				fd.setVisible(true);
		     }
		      
		      else
		      {   if(c!=1)
		    	  JOptionPane.showMessageDialog(null,"Please dont leave any field empty.");
		      else
		    	  JOptionPane.showMessageDialog(null,"Mobile number should be a 10 digit integer!!");
				 
		      }
	
			}		
		});
		
		
	}//end of constructor
	
	


}//end of class
