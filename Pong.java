
// Lab Chapter 19 -  Lab Pong    2022

// Uses files Main.java, Pong.java, Paddle.java, Ball.java, and Block.java

// IMPORTANT! PLEASE READ!!!!!!!
// YOU WILL NEED TO USE THE Java Swing compiler (scroll down)

// DO NOT DO ANYTHING WITH THIS FILE
// OTHER THAN PUT YOUR NAME ON IT AND RUN IT

// PLEASE READ!!!!!!!!!
// DO THE Block.java class first 
// then do Ball.java and Paddle.java

// My name is Justin Naicker

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Component;

public class Main extends JFrame
{
  private static final int WIDTH = 800;
  private static final int HEIGHT = 600;

  public Main()
  {
    super("PONG");
    setSize(WIDTH,HEIGHT);
    
    Pong game = new Pong();
    
    ((Component)game).setFocusable(true);     
    getContentPane().add(game);
            
    setVisible(true);
    
      
    // DO NOT REMOVE THIS LINE OF CODE
    System.out.println("2022 version.");

    System.out.println("My name is Justin Naicker");
  }
  
  public static void main( String args[] )
  {
    Main run = new Main();
  }
} // END of Main.java


// NOTE: PLEASE READ

// DO NOT DO ANYTHING WITH THIS FILE
// OTHER THAN:
// Change GTE to the Java Greater Than or Equal to symbol
// Change LTE to the Java Less Than or Equal to symbol
// the main program is Main.java

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
  // Instance variables (attributes, properties, fields, global)
  private int xSpeed;
  private int ySpeed;

  // default constructor to give beginning values
  // to our instance variables (No parameters)
  public Ball()
  {
    // You must always call the super constructor first!
    // The Block super class holds your x and y variables
    super(200,200); // calls the Block constructor
    xSpeed = 3;
    ySpeed = 1;
  }

  //add the other Ball constructors
  public Ball(int x, int y)
  {
    // initialize your super variables in the Block portion of your object
    super(x, y);
    // now set your xSpeed and ySpeed
    this.xSpeed = 3;
    this.ySpeed = 1;
    
    // do ySpeed right here and give it the default value of 1
  }

  public Ball(int x, int y, int width, int height)
  {
    // initialize your super variables in the Block portion of your object
    super(x,y,width,height);
    
    // now set your xSpeed and ySpeed
    this.xSpeed = 3;
    this.ySpeed = 1;
    
    // do ySpeed right here
    
  }

  public Ball(int x, int y, int width, int height, Color color)
  {
    // initialize your super variables in the Block portion of your object
    super(x,y,width,height,color);
    
    // now set your xSpeed and ySpeed
    this.xSpeed = 3;
    
    // do ySpeed right here
    this.ySpeed = 1;
  }

  public Ball(int x, int y, int width, int height, Color color, int xSpeed, int ySpeed)
  {
    // initialize your super variables in the Block portion of your object
    super(x,y,width,height,color);
    
    // now set your xSpeed and ySpeed
    this.xSpeed = x;
    this.ySpeed = y;
    
    // do ySpeed right here
  }

  public void setXSpeed(int xSpeed)
  {
    this.xSpeed = xSpeed;
  }
  public int getXSpeed()
  {
    return xSpeed;
  }

    public void setYSpeed(int ySpeed)
  {
    this.ySpeed = ySpeed;
  }
  public int getYSpeed()
  {
    return ySpeed;
  }
  
  
   // DO NOT REWRITE getX(), setX(), etc. 
   // you did those in the Block class and you inherited them    
   // add the set methods for xSpeed and ySpeed
   // add the get methods for xSpeed and ySpeed
   
   
   // NOTE: THERE ARE 2 draw methods that we will write
   // we will override the draw method in the Block class
   public void draw(Graphics window)
   {
      window.setColor(getColor());
      // change me so that I draw a round ball
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   // we will override the draw method in the Block class
   public void draw(Graphics window, Color col)
   {
      // pass it the parameter col
      window.setColor(col);
      // change me so that I draw a round ball
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void moveAndDraw(Graphics window)
   {
      // draw a white ball at old ball location
      // so that we erase the current ball
    draw(window,Color.WHITE);

      // change your x and y variables
      setX(getX()+xSpeed);
    // now call setY to change your y value
      setY(getY() + ySpeed);
    // draw the ball at its new location
    // by calling the draw method
    // do not pass it a color, let the draw method 
    // use the Block color
     draw(window);
         
   }
   
  public boolean equals(Object obj)
  {
    Ball other = (Ball) obj;
    // 2 ball objects are considered equal if their attributes (properties,
    // instance variables are the same
    // if (getX()=other.getX() && etc.


    if (getXSpeed() == other.getXSpeed() && getYSpeed() == other.getYSpeed())
      {
      return true;
      }


    return false;
  }   

  public String toString()
  {
    return super.toString() + " " + xSpeed + " " + ySpeed;
  }

   // add a toString() method and return your super.toString() and xSpeed and ySpeed
   // remember that toString() methods should return the values of your instance variables
   
}  // end of class Ball

// FINISH THIS CODE

// Ball.java and Paddle.java will inherit from this class
// Remember that these methods can be called from these classes


import java.awt.Color;
import java.awt.Graphics;

public class Block
{
  // instance variables
  private int x;
  private int y;
  private int width;
  private int height;

  private Color color;

  // a constant variable
  public final Color defaultBlockColor = Color.RED;


  // NOTE: There are several Block constructors that can
  //       be called from some other class.  
  //       We will use default values in these constructors
  //       depending on the constructor called.
  public Block()
  {
    // set all variables to meaningful default values
    // use this to call the appropriate constructor   
    this(300,300,10,10,Color.RED);
  }


  public Block (int x, int y)
  {
    // call a constructor to init your instance variables
    this(x,y,10,10,Color.RED);
  }

  public Block (int x, int y, int width, int height)
  {
    // call a constructor to init your instance variables
    // use this(.....);

    this(x,y,width,height,Color.RED);
  }

  public Block (int x, int y, int width, int height, Color color)
  {
    // use this.x  = x;  etc. since the parameter names are the same as the instance variables
    // this.x refers to the instance variable x
    // set all of your instance variables here

    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.color = color;
    
  }
    
  
   public void setColor(Color color)
   {
      // the keyword this allows you to refer to the 
      // instance variable color
      // where as color refers to the parameter variable
    this.color = color;
   }


    // getter (accessor) and setter (modifier) methods
    // notice that I don't have to use the keyword abstract
    // I also don't have to use the keyword public
    
    // FINISH THESE METHODS
        
    
    public Color getColor( )
    {
    return color;
    }
  
    public void setPos( int x, int y)
    {
    this.x = x;
      this.y = y;
    }

    public int getX()
    {
    return x;
    }
    
    public void setX( int x )
    {
    this.x = x;
    }

    public int getY()
    {
      return y;
    }
    
    public void setY( int y )
    {
    this.y = y;
    }

    public int getWidth()
    {
      return width;
    }
    
    public void setWidth( int width )
    {
    this.width = width;
    }
    
    public int getHeight()
    {
    return height;
    }
    
    public void setHeight( int height )
    {
    this.height = height;
    }


   public void draw(Graphics window)
   {
      window.setColor(getColor());
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
      window.setColor(col);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
  public boolean equals(Object obj)
  {
    Block other = (Block) obj;
    
    // two block objects are considered equal if all
    // of their attributes (instance variables or properties or fields)
    // are the same
    // if (getX()==other.getX() && etc.
    //    then return true

    if (getX() == other.getX() && getY() == other.getY() && getWidth() == other.getWidth() && getHeight() == other.getHeight() && getColor() == other.getColor())
    {
      return true;
    }
    return false;
  }   
    

   // add a toString() method  - return x , y , width, height, color
   
   public String toString()
  {
    return x + " " + y + " " + width + " " + height + " " + color;
  }
}  // end of class Block




import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
    super(10,10);
        speed =5;
   }

  public Paddle(int x, int y)
  {
    // initialize your super variables in the Block portion of your object
    super(x,y);
    // now set your speed to the default value
    this.speed = 5;   
  }

  public Paddle(int x, int y, int width, int height)
  {
    // initialize your super variables in the Block portion of your object
    super(x,y,width,height);
    // now set your speed to the default value
    this.speed = 5;   
  }

  public Paddle(int x, int y, int width, int height, Color color)
  {
   super(x,y,width,height,color);
    this.speed = 5;

  }

  public Paddle(int x, int y, int width, int height, Color color, int speed)
  {
        super(x,y,width,height,color);
        this.speed = speed;
  }




   public void moveUpAndDraw(Graphics window)
   {

     draw(window, Color.WHITE);
      // call your draw method and draw a white paddle
      // to erase your current paddle
      
    // change your y value (call getY() and setY())

     setY(getY() - speed );
    // now call your draw method

     draw(window);

    
   }

   public void moveDownAndDraw(Graphics window)
   {

     draw(window, Color.WHITE);
      // call your draw method and draw a white paddle
      // to erase your current paddle
      
    // change your y value (call getY() and setY())

     
     setY(getY() + speed );
    // now call your draw method

     draw(window);
    
   }

  public void setSpeed(int speed)
  {
    this.speed = speed;
  }

  public int getSpeed()
  {
    return speed;
  }
   // add a get method for speed
   // add a set method for speed
   // DO NOT REWRITE getX(), setX(), etc. 
   // you did those in the Block class and you inherited them    


  public String toString()
  {
    return super.toString() + " " + speed;
  }
   
   // add a toString() method
   
}  // end of class Paddle



// FINISH THIS CODE

// NOTE: PLEASE READ

// DO NOT DO ANYTHING WITH THIS FILE
// OTHER THAN:
// Change GTE to the Java Greater Than or Equal to symbol
// Change LTE to the Java Less Than or Equal to symbol
// the main program is Main.java


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
  public final Color backgroundColor = Color.WHITE;

  private Ball ball;
  private Paddle leftPaddle;
  private Paddle rightPaddle;
  private boolean[] keys;
  private BufferedImage back; 
  private int leftScore;
  private int rightScore;

  public Pong()
  {
    //set up all variables related to the game
    ball = new Ball(400,300,10,10,Color.blue,2,1);
    leftPaddle = new Paddle(20,200,10,40,Color.orange,2);
    rightPaddle = new Paddle(760,200,10,40,Color.orange,2);
    keys = new boolean[4];
    leftScore=0;
    rightScore=0;
    
    setBackground(backgroundColor);
    setVisible(true);
    
    new Thread(this).start();
    addKeyListener(this);   //starts the key thread to log key strokes
  }
  
   public void update(Graphics window){
     paint(window);
   }

   public void paint(Graphics window)
   {
    Graphics2D twoDGraph = (Graphics2D)window;

    //take a snap shop of the current Frame and same it as an image
    //that is the exact same width and height as the current Frame
    // remove the if in order to resize the window properly
    if(back==null)
       back = (BufferedImage)(createImage(getWidth(),getHeight()));

    //create a graphics reference to the back ground image
    //we will draw all changes on the background image
    Graphics graphToBack = back.createGraphics();

    graphToBack.setColor(Color.red);

    // draw a rectangle around the play area
    graphToBack.drawRect(10,20,770,440);
    
    ball.moveAndDraw(graphToBack);
    leftPaddle.draw(graphToBack);
    rightPaddle.draw(graphToBack);

    //see if ball hits left wall or right wall
    if(!(ball.getX() >= 10 && ball.getX() <= 780))
    {
      ball.setXSpeed(0);
      ball.setYSpeed(0);
      
      if(ball.getX() <= 40)
         rightScore++;
      if(ball.getX() >= 720)
         leftScore++;
         
      try
      {
        Thread.currentThread().sleep(950);
        }catch(Exception e)
        {
        } 

      ball.draw(graphToBack,Color.WHITE);
        ball.setX((int)(Math.random()*50)+400);
        ball.setY((int)(Math.random()*50)+300);
        int whoot = (int)(Math.random()*2);
        if(whoot==0){
           ball.setXSpeed(2);
           ball.setYSpeed(1);
        }
        else{
        ball.setXSpeed(-2);
           ball.setYSpeed(1);         
        }   
    }

    graphToBack.setColor(Color.WHITE);
    graphToBack.fillRect(440,520,80,80);

    graphToBack.setColor(Color.red);

    graphToBack.drawString("rightScore = " + rightScore,400,540);
    graphToBack.drawString("leftScore = " + leftScore,400,560);

    //see if ball hits top wall or bottom wall
    if(!(ball.getY() >= 20 && ball.getY() <= 450))
    {
      ball.setYSpeed(-ball.getYSpeed());
    }

    if((ball.getX() >= leftPaddle.getX()+leftPaddle.getWidth()+Math.abs(ball.getXSpeed()))
             &&
             (ball.getY() >= leftPaddle.getY()&&
             ball.getY() <= leftPaddle.getY()+leftPaddle.getHeight()||
             ball.getY()+ball.getHeight() >= leftPaddle.getY()&&
             ball.getY()+ball.getHeight() <= leftPaddle.getY()+leftPaddle.getHeight()))
    {

      if(ball.getX() <= leftPaddle.getX()+leftPaddle.getWidth()-Math.abs(ball.getXSpeed()))
         ball.setYSpeed(-ball.getYSpeed());
      else
         ball.setXSpeed(-ball.getXSpeed());
    }


    if((ball.getX()+ball.getWidth() >= rightPaddle.getX()-Math.abs(ball.getXSpeed()))
             &&
             (ball.getY()-ball.getHeight() >= rightPaddle.getY()&&
             ball.getY()-ball.getHeight() <= rightPaddle.getY()+rightPaddle.getHeight()||
             ball.getY()+ball.getHeight() >= rightPaddle.getY()&&
             ball.getY()+ball.getHeight() <= rightPaddle.getY()+rightPaddle.getHeight()))
    {
      if(ball.getX()+ball.getWidth() >= rightPaddle.getX()+Math.abs(ball.getXSpeed()))
         ball.setYSpeed(-ball.getYSpeed());
      else
         ball.setXSpeed(-ball.getXSpeed());
    }

    //see if the paddles need to be moved
    if(keys[0] == true)
    {
      leftPaddle.moveUpAndDraw(graphToBack);
    }
    if(keys[1] == true)
    {
      leftPaddle.moveDownAndDraw(graphToBack);
    }
    if(keys[2] == true)
    {
      rightPaddle.moveUpAndDraw(graphToBack);
    }
    if(keys[3] == true)
    {
      rightPaddle.moveDownAndDraw(graphToBack);
    }
    
    twoDGraph.drawImage(back, null, 0, 0);
  }

  public void keyPressed(KeyEvent e)
  {
    switch(toUpperCase(e.getKeyChar()))
    {
      case 'W' : keys[0]=true; break;
      case 'S' : keys[1]=true; break;
      case 'I' : keys[2]=true; break;
      case 'M' : keys[3]=true; break;
    }
  }

  public void keyReleased(KeyEvent e)
  {
    switch(toUpperCase(e.getKeyChar()))
    {
      case 'W' : keys[0]=false; break;
      case 'S' : keys[1]=false; break;
      case 'I' : keys[2]=false; break;
      case 'M' : keys[3]=false; break;
    }
  }

  public void keyTyped(KeyEvent e){}
  
   public void run()
   {
    try
    {
      while(true)
      {
         Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
    } 
} // end of class Pong



// FINISH THIS CODE
