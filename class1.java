import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class class1 extends JFrame{

	public JButton newcourse;
	public JButton manage;
	public JButton students;
    public JLabel asd;
	
	
	public class1()
	{ 
		super("Short-Term Course Manager");
		getContentPane().setLayout(null);
		Font pf=new Font("Serif",Font.PLAIN,23);
		Font pf1=new Font("Serif",Font.PLAIN,20);
		
		newcourse=new JButton("Add new course");
		newcourse.setBounds(93, 131, 425, 89);
		getContentPane().add(newcourse);
		newcourse.setFont(pf1);
		
		manage=new JButton("Manage available courses");
		manage.setBounds(93, 273, 425, 89);
		getContentPane().add(manage);
		manage.setFont(pf1);
		
		students=new JButton("Students' Database Portal");
		students.setBounds(93, 413, 425, 89);
		getContentPane().add(students);
		students.setFont(pf1);
		
		asd = new JLabel(" IIT KHARAGPUR SHORT TERM COURSE MANAGEMENT");
		asd.setBounds(12, 28, 623, 105);
		getContentPane().add(asd);
		asd.setFont(pf);
	
		
		newcourse.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent event)
			{
				if(courselist.courses.size()==10)
				{
					JOptionPane.showMessageDialog(null,"Max. no of courses allowed is 10. New course not possible !!");
				}
				else{
					setVisible(false);
				class2 sidd=new class2();
				sidd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				sidd.setSize(610,710);
				sidd.setVisible(true);
				}
				
			}
				}
			
			);
		
		
		manage.addActionListener(new  ActionListener()
				{
			public void actionPerformed(ActionEvent event)
			{
				setVisible(false);
				management man=new management();
				man.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				man.setSize(623,720);
				man.setVisible(true);
			}
			
			
		
		});
		students.addActionListener(new  ActionListener()
				{
			public void actionPerformed(ActionEvent event)
			 {
				setVisible(false);
			   students stu=new students();
			    stu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				stu.setSize(506,714);
				stu.setVisible(true);
			
			
			 }		
		       }
           );
		
	}//end of constructor
	

	

	}//end of class1
	
	
	
	
	
	

