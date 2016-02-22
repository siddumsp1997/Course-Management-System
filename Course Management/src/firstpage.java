import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;
import java.util.*;



public class firstpage extends JFrame {
	public firstpage() {
		
		
		 super("IITKGP COURSE MANAGER");
		 getContentPane().setLayout(null);
		 Font pf=new Font("Serif",Font.ITALIC,23);
		 Font pf1=new Font("Serif",Font.ITALIC,19);
		 Font pf2=new Font("Serif",Font.ITALIC,16);
		 
		 JButton btnNewButton_1 = new JButton(" OKAY, GOT IT !!");
			btnNewButton_1.setBounds(376, 445, 273, 70);
		
			
			getContentPane().add(btnNewButton_1);
			


		JLabel lblWelcomeToIitkharagpur = new JLabel("   WELCOME TO IIT-KHARAGPUR COURSE MANAGEMENT !!");
		lblWelcomeToIitkharagpur.setBounds(10, 0, 624, 55);
		getContentPane().add(lblWelcomeToIitkharagpur);
		lblWelcomeToIitkharagpur.setFont(pf);
		
		JTextArea txtrDasda = new JTextArea();
		txtrDasda.setText("This software helps you create, modify courses and its contents at just a \nclick of your mouse!!\nYou can click on CREATE NEW COURSE button to create a NEW course.(maximum 10 courses)\nMANAGE AVAILABLE COURSES Button helps you to handle all kinds of editing stuffs-\nEditing course details,adding/deleting/editing instructors and their details and so on.(max. 5 instructors)\nSTUDENTS' DATABASE PORTAL focuses only on the students enrolled in the courses \ncreated. This includes enrolling/deleting students from a particular course and\nediting their details(max. 5 students can enroll in a course). You can further\ngo through the limitations and warnings mentioned in the README file. Dont worry\nabout saving the stuffs you enter, because it will get auto-saved everytime you\nenter anything that concerns the database.\nA kind remainder that clicking the CLOSE(X) button will terminate the entire program.\nThanks for downloading our software !!\nCOPYRIGHT © 2016 SIDDHARRTH_PRIYADHARSAN_M ALL RIGHTS RESERVED\n");
		txtrDasda.setBounds(0, 111, 778, 310);
		txtrDasda.setEditable(false);
		txtrDasda.setFont(pf2);
		getContentPane().add(txtrDasda);
		
		JButton btnNewButton = new JButton("EXIT PROGRAM");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				setVisible(false);
			}
		});
		btnNewButton.setBounds(33, 445, 311, 70);
		getContentPane().add(btnNewButton);
		
	
		
		JLabel lblNoteToThe = new JLabel("NOTE TO THE USER :");
		lblNoteToThe.setBounds(22, 55, 200, 50);
		getContentPane().add(lblNoteToThe);
		lblNoteToThe.setFont(pf1);
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				setVisible(false);
				
				class1 sid=new class1();
				
				sid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				sid.setSize(669,659);
				sid.setVisible(true);
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		 
	}
}
