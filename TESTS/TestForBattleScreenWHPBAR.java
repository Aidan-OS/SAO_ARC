// The "TestForBattleScreenWHPBAR" class.
import java.awt.*;
import hsa.Console;

public class TestForBattleScreenWHPBAR
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	String mob_name = "The Crystal Dragon";/////////////
	int [] mob_stats = {42, 0, 0};//////////////////
	double mob_health_healthbar = mob_stats [0];
	int mob_health = mob_stats [0];//////////
	int mob_health_percent;
	
	Font standard_text = new Font ("MingLiU", Font.PLAIN, 20);
	
	Font hp_letters = new Font ("MingLiU", Font.BOLD, 15);
	
	c.setFont (standard_text);
	c.drawString ("" + mob_name, 1, 22);
	
	c.setFont (hp_letters);
	c.drawString (mob_health + "HP", 30, 44);
	
	mob_health_percent = (int) ((mob_health_healthbar / mob_stats [0]) * 100);

	c.fillRect (120, 34, mob_health_percent, 10);
	c.drawRect (120, 34, 100, 10);
	
	/////////////////////////////////////////////////
	
	String player_name = "Leone Shamoth";/////////////
	int player_health = 69;///////////////////////////
	int player_fight_health = player_health;///////////////
	double player_fight_healthbar = player_health;
	int player_health_percent;
	
	c.setFont (standard_text);
	c.drawString ("" + player_name, 400, 330);
	
	c.setFont (hp_letters);
	c.drawString (player_fight_health + "HP", 429, 352);
	
	player_health_percent = (int) ((player_fight_healthbar / player_health) * 100);
	
	c.fillRect (519, 342, player_health_percent, 10);
	c.drawRect (519, 342, 100, 10);
	
	// Place your program here.  'c' is the output console
    } // main method
} // TestForBattleScreenWHPBAR class
