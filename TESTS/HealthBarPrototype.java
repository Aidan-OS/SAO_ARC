//TESTING OF THE HEALTH BAR USED FOR SAO ARC
import java.awt.*;
import hsa.Console;

public class HealthBarPrototype
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	double health = 800.0;
	int battle_health = (int) health;
	int mob_health;
	int decrease = 0;

	int health_percent = (int) ((battle_health / health) * 100);

	c.fillRect (100, 100, health_percent, 10);
	c.drawRect (100, 100, 100, 10);
	c.drawString (battle_health + " HP", 165, 125);

	do
	{
	    c.print ("Enter a number to decrease this bar by (enter negative to quit): ");
	    decrease = c.readInt ();

	    battle_health -= decrease;
	    health_percent = (int) ((battle_health / health) * 100);          //ONE OF THESE NEEDS TO BE A DOUBLE TO RESULT IN A PROPERLY CREATED EQUATION
	    
	    if (decrease >= 0)
	    {
		c.clear ();
		c.fillRect (100, 100, health_percent, 10);
		c.drawRect (100, 100, 100, 10);
		
		if (battle_health < 0)
		{
		    c.drawString ("0 HP", 165, 125);
		} //SMALL IF

		else
		{
		    c.drawString (battle_health + " HP", 165, 125);
		} //ELSE
	    } //BIG IF

	}while (decrease >= 0 && (battle_health > 0));

	if (decrease <= 0)
	{
	    c.print ("You fled!");
	}

	else
	{
	    c.print ("DEATH!");
	}

    } // main method
} // HealthBarPrototype class
