// The "Test_levelup" class.
import java.awt.*;
import hsa.Console;

public class Test_levelup
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	int level = 1;
	int xp_to_gain = 100;
	double xp_given;
	double kills_needed;
	
	c.println ("xp_to_gain  ----  xp_given  ---- kills_needed");
	
	for (int i = 0; i < 10; i++)
	{
	    if (level != 1)
	    {
		xp_to_gain += 100 + (40 * (level - 1) );
	    }
	    
	    xp_given = 20 * level;
	    kills_needed = xp_to_gain / xp_given;
	    level ++;
	    c.println (xp_to_gain + "----" + xp_given + "----" + kills_needed);
	}
	
	
    } // main method
} // Test_levelup class
