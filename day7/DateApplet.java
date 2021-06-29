package dayseven.java.files.com;
import java.applet.Applet;
import java.awt.Graphics;
import java.util.Date;
  
/*
<applet code="DateApplet" width=200 height=60>

</applet>
*/
public class DateApplet extends Applet {

	
		
		@Override
	    public void paint(Graphics g) 
	    {
	        //g.drawString("Hello World", 20, 20);
			Date dt = new Date();
			super.showStatus("Today is" + dt);
	    }
	

}
