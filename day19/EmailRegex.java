package day19.reflection.java.com;

import java.awt.*;
import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
 
import javax.swing.JPanel;

public class Email implements ActionListener 
{
	
	TextField t1 ;
	
	  Label ques,answer ;
	  
	  Button b1;
	  
	  Frame f;
	  
	  
	  
	  Email ()
	  {
		  f = new Frame("Email Validation");

	       ques = new Label("Enter Email:");
	       
	       ques.setBackground(Color.cyan);
	       
	       ques.setBounds(5, 50, 150, 30);
	        
	       f.add(ques);
	       
	       t1 = new TextField();
	        
	        t1.setBounds(180, 50, 150, 30);
	        
	        f.add(t1);
	        
	        answer = new Label("Result will be printed here :");
	        
	        answer.setBounds(90, 140, 200, 30);
	        
	        f.add(answer);
	        
	        b1 = new Button("Validate");
	        
	        b1.setBounds(90, 200, 180, 30);
	        
	        f.add(b1);

	        b1.addActionListener(this);
	        
	        f.addWindowListener(new WindowAdapter() 
	        {
	            @Override
	            public void windowClosing(WindowEvent we) 
	            {
	                System.exit(0);
	            }
	        });

	        f.setLayout(null);
	        f.setSize(500, 400);
	        f.setVisible(true);
		  
//		    t.addActionListener(this);
//		    setVisible(true); 
		  
	  }

	public static void main(String[] args) 
	{
		Email pa=new Email();

	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String r=t1.getText();
		 
		      if (validateEmailAddress(r))
		       answer.setText("valid");
		      else
		       answer.setText("not valid");
		
	}
	 boolean validateEmailAddress(String userName) 
	 {
		 Pattern emailNamePtrn = Pattern.compile(
				    "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		 Matcher mtch = emailNamePtrn.matcher(userName);
	        if(mtch.matches()){
	            return true;
	        }
	        return false;
		  } 

}
