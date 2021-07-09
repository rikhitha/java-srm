package day17.jtab.java.com;

import java.util.Scanner;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.tree.DefaultMutableTreeNode;

class JavaExampleJScrollPane extends JFrame
{
   private JPanel Pnl = new JPanel();
   private JScrollPane Scrl = new JScrollPane(Pnl,
   ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
   ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
   private JLabel Lbl = new JLabel("Since while condition is always true so control keeps on entering the while loop repetetively. In our program given below, when user");
   private Font font = new Font("Arial", Font.PLAIN, 20);
   private Container cntnr;
   public JavaExampleJScrollPane()
       {
           super("JScrollPane in Java Swing Example");
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           cntnr = getContentPane();
           Lbl.setFont(font);
           Pnl.add(Lbl);
       }}

class Menu extends JFrame
{
	JMenuBar mb;
	JMenu x;
	JMenuItem m1, m2, m3;
	JFrame f;
	
	Menu()
	{
		  
        
        f = new JFrame("Menu demo");
  
        
        mb = new JMenuBar();
  
        
        x = new JMenu("Skills");
  
        
        m1 = new JMenuItem("Adversarial");
        m2 = new JMenuItem("SpringBoot");
        m3 = new JMenuItem("ccna");
  
        
        x.add(m1);
        x.add(m2);
        x.add(m3);
  
        
        mb.add(x);
  
        
        f.setJMenuBar(mb);
  
        
        f.setSize(500, 500);
        f.setVisible(true);
    }
}

class Tree extends JFrame {
    JTree tree;
    DefaultMutablTreeNode root, parent1, parent2, child,child1, child2;

    Tree() {
        super("JTree Demo");

        root = new DefaultMutableTreeNode("States");
        parent1 = new DefaultMutableTreeNode("Andhra Pradesh");
        child = new DefaultMutablTreeNode("Vijayawada");
        child1 = new DefaultMutableTreeNode("Vizag");
        parent2 = new DefaultMutableTreeNode("Telangana");
        child2 = new DefaultMutableTreeNode("Hyderabad");

        
        parent1.add(child);
        parent1.add(child1);
        parent2.add(child2);
        
        
        root.add(parent1);
        root.add(parent2);

        
        tree = new JTree(root);

        getContentPane().add(new JScrollPane(tree));
        setSize(300, 300);
        setVisible(true);
    }



class JTableEx {
    JFrame f;
    JTable j;
    JTableEx()
    {
        f = new JFrame();
       
        f.setTitle("JTable");
        String[][] data = {
            { "kiya", "4031", "CSE" },
            { "Anand", "6014", "IT" },
            { "Barry", "6019", "Ece" },
            { "Litika", "6018", "Mca" },
            { "Varna", "6010", "IT" },
            { "Anand", "6011", "IT" }
        };
        String[] columnNames = { "Name", "Roll Number", "Department" };
  
        
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);
        j.setForeground(Color.green);
  
        
        JScrollPane sp = new JScrollPane(j);
        j.setGridColor(Color.cyan);
        f.add(sp);
        
        f.setSize(500, 200);
        
        f.setVisible(true);
    }}
class TabbedPaneEx {  
JFrame f;  
TabbedPanEx(){  
    f=new JFrame();  
    JTextArea ta=new JTextArea(200,200);  
    JPanel p1=new JPanel();  
    p1.add(ta);  
    Panel p2=new Panel();  
    Panel p3=new Panel();  
    JTabbedPane tp=new JTabbedPane();  
    tp.setBounds(50,50,200,200);  
    tp.add("home",p1);  
    tp.add("about",p2);  
    tp.add("contact",p3);   
    JLabel home,about,contact;
    home = new JLabel("inside home");
    about = new JLabel("inside about");
    contact=new JLabel("inside contact");

    
    home.setForeground(Color.pink);
    about.setForeground(Color.green);
    contact.setForeground(Color.orange);
    
    f.add(tp);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);  
} } 
public class Jcompo extends JFrame implements ItemListener {
 
    
    static JFrame f;
 
    
    static JLabel l, l1;
 
    
    static JComboBox c1;
 
    
    public static void main(String[] args)
    {
    	new TabbedPaneEx();  
    	new JTableEx();
    	UIManager.setlookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        new Tree();
        new Menu();
        final int WIDTH = 180;
        final int HEIGHT = 100;
        JavaExampleJscrollPane scroll = new JavaExampleJScrollPane();
        Scroll.setSize(250,300);
        Scroll.setVisible(true);
        

        	
        	
        f = new JFrame("frame");
 
        
        Jcompo s = new Jcompo();
 
        
        f.setLayout(new Flowlayout());
 
        
        String s1[] = { "jframe", "jtable", "jcombobox", "jlabel" };
 
        
        c1 = new JComboBox(s1);
 
        
        c1.addItemListener(s);
 
        
        l = new JLabel("select component ");
        l1 = new JLabel("u selected");
 
        
        l.setForeground(Color.pink);
        l1.setForeground(Color.green);
 
        
        JPanel p = new JPanel();
 
        p.add(l);
        f.getColorModel();
 
        
        p.add(c1);
 
        p.add(l1);
 
        
        f.add(p);
 
        
        f.setSize(400, 400);
 
        f.show();
    }
    public void itemStatechanged(Itemevent e)
    {
        
        if (e.getSource() == c1) {
  
            l1.setText(c1.getSelectedItem() + " selected");
        }
    }
} 
