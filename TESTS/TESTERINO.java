// The "TESTERINO" class.
import java.awt.*;
import hsa.Console;

public class TESTERINO
{
    static Console c;           // The output console
    static int [] character_gear = {27, 19, 3, 6, 17, 22, 29, 26, 11, 17};
    
    public static void main (String[] args)
    {
	c = new Console (); 

	Font inventory_letters = new Font ("MingLiU", Font.PLAIN, 20);
	Font selected_inventory = new Font ("MingLiU", Font.BOLD, 20);
	Font largest_letters = new Font ("MingLiU", Font.BOLD, 100);
	c.setFont (largest_letters);

	c.setColor (Color.red);
	c.drawString ("You can't", 100, 150);
	c.drawString ("Delete this!", 0, 250);
	c.setColor (Color.black);
	delay (3000);
		    
	c.clear ();

	c.setFont (inventory_letters);
	
	int y = 100;
	
	for (int i = 0; i < 10; i++)
	{
	    c.drawString ("" + gen_weapon_name (character_gear [i]), 180, y );
	    y += 40;
	}
	
	c.setFont (selected_inventory);
	c.drawString ("Selected Weapon:", 0, 100);
	c.drawString ("Selected Armour:", 0, 140);
	
	int deletion_selected = 0;
	char key_pressed_delete;
	int p = 80; //Text box position
	
	do
	{
	    draw_selection_box_no_fill (175, (p + (40 * deletion_selected) ) );
	    key_pressed_delete = c.getChar ();
	    clear_selection_box (175, (p + (40 * deletion_selected) ) );
	    
	    if (key_pressed_delete == 'w' && deletion_selected == 0)//Cases of nothing happening
	    {
	    }
	    
	    else if (key_pressed_delete == 's' && deletion_selected == 9)//Cases of nothing happening
	    {
	    }
	    
	    else if (key_pressed_delete == 'w')
	    {
		deletion_selected --;
	    }
	    
	    else if (key_pressed_delete == 's')
	    {
		deletion_selected ++;
	    }
	    
	}while (key_pressed_delete != '\n' && key_pressed_delete != '=');
	
	draw_selection_box_no_fill (145, (p + (40 * deletion_selected) ) );
	
	if (key_pressed_delete == '=')//exiting
	{
	}
	
	else if (key_pressed_delete == '\n')
	{
	}

    } // main method
    
    public static void draw_selection_box_no_fill (int x, int y)
    {
	c.setColor (Color.black);
	c.drawRect (x, y, 410, 30);
	c.drawRect ( (x + 1), (y + 1), 408, 28);
	c.drawRect ( (x + 2), (y + 2), 406, 26);
    }
    
    public static void clear_selection_box (int x, int y)
    {
	c.setColor (Color.white);
	c.drawRect (x, y, 410, 30);
	c.drawRect ( (x + 1), (y + 1), 408, 28);
	c.drawRect ( (x + 2), (y + 2), 406, 26);
	c.setColor (Color.black);
    }
    
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
    
    public static String gen_weapon_name (int number)
    {
	String name = "Excalibur";
	
	switch (number)
	{
	    case 1:{
		name = "Standard Rapier";
		break;
	    }
	    case 2:{
		name = "Standard Shortsword";
		break;
	    }
	    case 3:{
		name = "Standard Claymore";
		break;
	    }
	    case 4:{
		name = "Standard Longsword";
		break;
	    }
	    case 5:{
		name = "Standard One-Handed Sword";
		break;
	    }
	    case 6:{
		name = "Basic Kunai";
		break;
	    }
	    case 7:{
		name = "Standard Samurai Sword";
		break;
	    }
	    case 8:{
		name = "Greater Rapier";
		break;
	    }
	    case 9:{
		name = "Greater One-Handed Sword";
		break;
	    }
	    case 10:{
		name = "Greater Samurai Sword";
		break;
	    }
	    case 11:{
		name = "Greater Claymore";
		break;
	    }
	    case 12:{
		name = "Greater Longsword";
		break;
	    }
	    case 13:{
		name = "Excellent Claymore of the Blood Oath";
		break;
	    }
	    case 14:{
		name = "Samurai Sword of the Moonlight Cats";
		break;
	    }
	    case 15:{
		name = "Lambent Light";
		break;
	    }
	    case 16:{
		name = "Elucidator";
		break;
	    }
	    case 17:{
		name = "Dark Repulser";
		break;
	    }
	    case 18:{
		name = "Broken Chainmail";
		break;
	    }
	    case 19:{
		name = "Villagers Clothes";
		break;
	    }
	    case 20:{
		name = "Tatterd Leather Armour";
		break;
	    }
	    case 21:{
		name = "Standard Chainmail";
		break;
	    }
	    case 22:{
		name = "Standard Leather Armour";
		break;
	    }
	    case 23:{
		name = "Reinforced Villagers Clothes";
		break;
	    }
	    case 24:{
		name = "Strengthened Leather Armour";
		break;
	    }
	    case 25:{
		name = "Strengthened Chainmail";
		break;
	    }
	    case 26:{
		name = "Standrad Plate Mail";
		break;
	    }
	    case 27:{
		name = "Taloned Plate Mail of the Moonlight Cats";
		break;
	    }
	    case 28:{
		name = "Heavy Armour of the Blood Oath";
		break;
	    }
	    case 29:{
		name = "The Blackwyrm Coat";
		break;
	    }
	}
	
	return (name);
    }
    
} // TESTERINO class
