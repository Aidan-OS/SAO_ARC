// The "ThisIsGOnnaLag" class.
import java.awt.*;
import hsa.Console;

public class ThisIsGOnnaLag
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
       
	int uugg = 0; 
	int level = 1;
	int strength = (int) (Math.random () * (5) + 10); //Strength between 10 and 15
	int defence = (int) (Math.random () * (2) + 5);    //Defence between 5 and 7
	int health = (int) (Math.random () * (10) + 25);   //Heath between 25 and 35
	
	int totalstr = 0, totaldef = 0, totalhp = 0;
	
	for (int q = 0; q < 10000; q++)
	{
	
	    int temp_level = level;

	    for (int i = 1 ; i < (100 - temp_level) ; i++)
	    {
		level += 1; //ADDS LEVEL
		strength += ((int) (Math.random () * (5)) + 5) * level;
		defence += ((int) (Math.random () * (4)) + 4) * level;
		health += ((int) (Math.random () * (2)) + 8) * level;
	    } //FOR
	    
	    totalstr += strength;
	    strength = 0;
	    
	    totaldef += defence;
	    defence = 0;
	    
	    totalhp += health;
	    health = 0;
	    
	    uugg = level;
	    
	    level = 1;
	 }
	 
	 double avrstr = totalstr / 10000.0;
	 double avrdef = totaldef / 10000.0;
	 double avrhp = totalhp / 10000.0;
	 c.println (avrstr);
	 c.println (avrdef);
	 c.println (avrhp);
	 c.print (uugg);
	    
    } // main method
} // ThisIsGOnnaLag class
