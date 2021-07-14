import java.sql.Connection;

import java.awt.event.*;  
import javax.swing.*;   
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 
public class AccessConnectivity 
{
    public static void main(String[] args)
    {
    	JFrame f=new JFrame("Display,Insert,Update,Delete");
    	
    	JButton insertbtn=new JButton("Insert");  
    	JButton updatebtn=new JButton("Update");  
    	JButton displaybtn=new JButton("Display");  
    	JButton deletebtn=new JButton("Delete");  
    	insertbtn.setBounds(50,100,95,30); 
    	updatebtn.setBounds(50,150,95,30); 
    	displaybtn.setBounds(50,200,95,30); 
    	deletebtn.setBounds(50,250,95,30); 
    	
    	JLabel l=new JLabel("Loading...");
    	l.setBounds(100,30,200,90); 
    	f.add(insertbtn);
    	f.add(updatebtn);
    	f.add(displaybtn);
    	f.add(deletebtn);
    	f.add(l);
    	
    	f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
        
        insertbtn.addActionListener(new ActionListener()
        {  
        	public void actionPerformed(ActionEvent e)
        	{  
        		try{
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    Connection connection= DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\HP\\Desktop\\StudentDatabase.accdb");
                    System.out.println("Connected Successfully");
                    
                    PreparedStatement preparedStatement=connection.prepareStatement("insert into Student values(?,?)");
                   
                    preparedStatement.setString(1,"Mumbai");
                    preparedStatement.setString(2,"ashok");
                    
                    preparedStatement.executeUpdate();
                    l.setText("data inserted successfully");
       
                }catch(Exception p){
                	l.setText("Error in connection");
       
                } 
        	        }  
        	    });  
    	
        updatebtn.addActionListener(new ActionListener()
        {  
        	public void actionPerformed(ActionEvent e)
        	{  
        		try{
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    Connection connection= DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\HP\\Desktop\\StudentDatabase.accdb");
                    System.out.println("Connected Successfully");
                    
                    PreparedStatement preparedStatement=connection.prepareStatement("update Student set City=? where Username=?");
                    preparedStatement.setString(1,"Chennai");
                    preparedStatement.setString(2,"shely");
                    preparedStatement.executeUpdate();
                    l.setText("data updated successfully");

                }catch(Exception k){
                	l.setText("Error in connection");

                }
        	              
        	        }  
        	    });  
        
        displaybtn.addActionListener(new ActionListener()
        {  
        	public void actionPerformed(ActionEvent e)
        	{  
        		
        		try{
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    Connection connection= DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\HP\\Desktop\\StudentDatabase.accdb");
                    System.out.println("Connected Successfully");
                    
                    PreparedStatement preparedStatement=connection.prepareStatement("select * from Student");
                    
                    ResultSet resultSet=preparedStatement.executeQuery();
                    while(resultSet.next()){
                         String Username=resultSet.getString("Username");
                         String City=resultSet.getString("City");
                         
                         System.out.println(Username+" "+City);
                    }

                }catch(Exception o){
                    System.out.println("Error in connection");

                }
        	             
        	        }  
        	    });  
    	
        deletebtn.addActionListener(new ActionListener()
        {  
        	public void actionPerformed(ActionEvent e)
        	{  
            	try{
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    Connection connection= DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\HP\\Desktop\\StudentDatabase.accdb");
                    System.out.println("Connected Successfully");
                    
                    PreparedStatement preparedStatement=connection.prepareStatement("delete from Student where City=?");
                    preparedStatement.setString(1,"Madurai");
                    preparedStatement.executeUpdate();
                    l.setText("Data deleted Successfully");

                }catch(Exception t){
                	l.setText("Error in connection");

                }
        	             
        	        }  
        	    });  
    	
    	
    	
    	

    }
}
