// The "HRDRDRD" class.
import java.awt.*;
import hsa.Console;

public class HRDRDRD
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	String mob_name = "Crystal Dragon";
	
	Color light_blue = new Color (0, 191, 255);
	c.setTextBackgroundColor (light_blue);
	c.clear ();
	
	Font largest_letters = new Font ("MingLiU", Font.BOLD, 20);
	c.setFont (largest_letters);
	
	c.drawString ("The next mob you fight will be the final boss, Godfree.", 40, 144);
	
	
    } // main method
} // HRDRDRD class
