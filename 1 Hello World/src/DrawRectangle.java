import java.awt.*; 
import javax.swing.*; 


public class DrawRectangle extends JApplet{

	public void init() 
    { 
        // set size 
        setSize(400, 400); 
        repaint(); 
    } 
  
    // paint the applet 
    public void paint(Graphics g) 
    {   // set Color for rectangle 
        g.setColor(Color.red); 
  
        // draw a rectangle by drawing four lines 
        g.drawLine(100, 100, 100, 300); 
        g.drawLine(100, 300, 300, 300); 
        g.drawLine(300, 300, 300, 100); 
        g.drawLine(300, 100, 100, 100); 
    } 
}
