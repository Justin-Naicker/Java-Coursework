// Main.java and BigHouse.java
// Draw a house with a roof, a door,
// 2 windows, and a sun in the sky.
// Use different colors.
// FINISH ME
// Name: Justin Naicker
//NOTE: YOU MUST USE the JavaSwing class type compiler,
//NOT the Java language compiler.
import javax.swing.JFrame;
import java.awt.*;
public class Main extends JFrame
{
// The keyword static means that there will be only 1 variable called
//WIDTH
// and it will be loaded into memory at the start of the run.
// The keyword final means that you cannot change the value of the
//variable.
// (thus it is a constant)
private static final int WIDTH = 800;
private static final int HEIGHT = 600;
public Main()
{
// FINISH ME
super("Graphics Runner written by Justin Naicker");
setSize(WIDTH,HEIGHT);
getContentPane().add(new BigHouse());
setVisible(true);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
// This is where your program gets started
public static void main( String args[] )
{
Main run = new Main();
}
} // end of class Main
class BigHouse extends Canvas
{
public BigHouse() //constructor - sets up the class
{
setSize(800,600);
setBackground(Color.BLUE);
setVisible(true);
System.out.println("Running BigHouse");
// FINISH ME
System.out.println("Written by Justin Naicker");
}
public void paint( Graphics window )
{
bigHouse(window);
}
public void bigHouse( Graphics window )
{
window.setColor(Color.BLUE);
// (0,0) is the upper left point of the window.
// move over 35 pixels and then down 40 pixels (x,y)
// and start drawing the text

window.drawString( "BIG HOUSE", 35, 40 );
window.drawString("Justin Naicker", 35, 60);
window.setColor(Color.YELLOW);
window.fillRect( 200, 100, 400, 400 );
window.setColor(Color.ORANGE);
window.fillOval( 650, 0, 100, 100 );
window.setColor(Color.BLACK);
window.fillRect( 500, 200, 75, 75 );
window.fillRect( 225, 200, 75, 75 );
window.setColor(Color.RED);
window.fillRect( 362, 300, 75, 125 );
      int [] xvars  = {180,400,620};
      int [] yvars   = {100,0,100};
     window.fillPolygon(xvars, yvars, 3);
//window.fillPolygon( int [200] , int [200] , int [52]);
// FINISH ME
//*Tip - run the program as is first. Then start adding in shapes.
//See below for names of methods to call to change and add shapes and
//colors.*
//**Tip 2 - Think of the window like graph paper. The TOP LEFT CORNER
//IS 0, 0! As you go from left to right, your x-axis value increases. As you
//go from top to bottom, your y-axis value INCREASES TOO! (there are no
//negative numbers here! :) )

} // end of method bigHouse

} // end of class BigHouse

/*
(0,0) is the upper left point of the window.
Built in methods:
Call with the graphics reference variable
which we called window.
Example: window.drawLine(100, 50, 200, 50);
void drawLine(int x1, int y1, int x2, int y2)
void fillRect(int x, int y, int width, int height)
void drawRect(int x, int y, int width, int height)
void clearRect(int x, int y, int width, int height)
void drawRoundRect(int x, int y, int width, int height, int arcWidth, int
arcHeight)
void fillRoundRect(int x, int y, int width, int height, int arcWidth, int
arcHeight)
void draw3DRect(int x, int y, int width, int height, boolean raised)
void fill3DRect(int x, int y, int width, int height, boolean raised)
void drawOval(int x, int y, int width, int height)
void fillOval(int x, int y, int width, int height)
void drawArc(int x, int y, int width, int height, int startAngle, int
arcAngle)
void fillArc(int x, int y, int width, int height, int startAngle, int
arcAngle)
void drawPolyline(int[] xPoints, int[] yPoints, int nPoints)
void drawPolygon(int[] xPoints, int[] yPoints, int nPoints)
void drawPolygon(Polygon p)
void fillPolygon(int[] xPoints, int[] yPoints, int nPoints)
void fillPolygon(Polygon p)
void drawString(String str, int x, int y)
window.setColor(Color.red);
window.setColor(Color.blue);

etc;

Font myFont = new Font(&quot;Serif&quot;, Font.ITALIC, 24);
window.setFont(myFont);
window.setColor(Color.blue);
window.drawString(&quot;Here is a message&quot;, 15, 25);
*/
