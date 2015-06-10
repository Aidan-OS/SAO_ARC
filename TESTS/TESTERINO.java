// The "TESTERINO" class.
import java.awt.*;
import hsa.Console;

public class TESTERINO
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console (); 
	
	Font largest_letters = new Font ("MingLiU", Font.BOLD, 20);
	c.setFont (largest_letters);
	
	c.drawString ("Sorry, there was no drop", 200, 230);
	c.drawString ("Press any key to continue", 195, 250);
    } // main method
    
    public static void delay (int x)        ////////////////////////////DELAY
    {
	try
	{
	    Thread.currentThread ().sleep (x);
	}

	catch (Exception e)
	{
	}
    }
    
} // TESTERINO class
