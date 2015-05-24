/**********************
*     Aidan Smith     *
* The SAO Arc Project *
**********************/
/*Welcome to the code of the SAO Arc project.
This is a game developed in Java based on the
popular anime and manga, Sword Art Online (SAO).
It is a text based RPG with over 50 different
standard mobs and 4 extremley rare mobs. Character
stats are saved and when you die, you restart.

The four basic statistcs are:

Strength: Determines how much damage you do.
Defence: Detemines how much damage you are able to negate.
Evasion: How easily you can dodge an attack.
Health: Determines how much damage you can take. Restored at the end of every fight.


WRITE ABOUT THE ATTACKS.
*/

import java.awt.*;
import hsa.Console;

public class SAO_ARC
{
    static Console c;           // The output console                  

    public static void main (String[] args)
    {
	c = new Console ();

	int level = 50;
	int strength;
	int defence;
	double evasion = 0.3;                               //Evade at 30%
	int health;
	    
	strength = (int) (Math.random () * (5) + 10); //Strength between 10 and 15
	defence = (int) (Math.random () * (2) + 5);    //Defence between 5 and 7
	health = (int) (Math.random () * (10) + 25);   //Heath between 25 and 35
	
	int mob_rarity;
	int mob_type;
	int mob_strength;
	int mob_defence;
	double mob_evasion;
	int mob_health;
	String mob_name = "Missingno";

	mob_rarity = (int) (Math.random () * (99) + 1); //Generates a random mob rarity                   //17 Common, 12 uncommon, 7 rares, 4 Legendaries
	
	if (level >= 50)
	{
	    if ( (mob_rarity >= 1) && (mob_rarity <= 50) ) //50% Chance, generates common                               
	    {                                                                                                          
		mob_type = (int) (Math.random () * (16) + 1); //Generates 1 - 17          
		mob_name = set_mob_name (mob_type);
	    }
	    
	    else if ( (mob_rarity >= 51) && (mob_rarity <= 80) ) //30% chance of uncommon
	    {
		mob_type = (int) (Math.random () * (11) + 18); //Generates 18 - 29
		mob_name = set_mob_name (mob_type);
	    }
	    
	    else if ( (mob_rarity >= 81) && (mob_rarity <= 95) ) //15% chance of rare                           
	    {
		mob_type = (int) (Math.random () * (6) + 30); //Generates 30 - 36
		mob_name = set_mob_name (mob_type);
	    }
	    
	    else if ( (mob_rarity >= 96) && (mob_rarity <= 100) )//LEGENARY GENERATED 5%
	    {
		mob_type = (int) (Math.random () * (3) + 37); //Generates 37 - 40
		mob_name = set_mob_name (mob_type);
	    }

	}
	
	else if (level < 50)
	{
	    if ( (mob_rarity >= 1) && (mob_rarity <= 53) ) //53% Chance, generates common
	    {
		mob_type = (int) (Math.random () * (16) + 1); //Generates 1 - 17          
		mob_name = set_mob_name (mob_type);
	    }
	    
	    else if ( (mob_rarity >= 54) && (mob_rarity <= 85) ) //32% chance of uncommon
	    {
		mob_type = (int) (Math.random () * (11) + 18); //Generates 18 - 29
		mob_name = set_mob_name (mob_type);
	    }
	    
	    else if ( (mob_rarity >= 86) && (mob_rarity <= 100) ) //15% chance of rare
	    {
		mob_type = (int) (Math.random () * (6) + 30); //Generates 30 - 36
		mob_name = set_mob_name (mob_type);
	    }
	}//ELSE IF

	
    } // main method
    
    public static String set_mob_name (int mob_number)
    {
	/////////////////////////COMMONS////////////////////////////////////////
											    //Common Mobs: Blazing Zealot - 1, Kobold Soldier - 2, 
											    //Centaur Archer - 3, Raging Tusker - 4, Stable Water Elemental - 5
	if (mob_number == 1)
	{
	    return ("Blazing Zealot");
	}
	
	else if (mob_number == 2)
	{
	    return ("Kobold Soldier");
	}
	
	else if (mob_number == 3)
	{
	    return ("Centaur Archer");
	}
	
	else if (mob_number == 4)
	{
	    return ("Raging Tusker");
	}
	
	else if (mob_number == 5)
	{
	    return ("Stable Water Elemental");
	}
	
	else if (mob_number == 6)
	{
	    return ("Stable Fire Elemental");
	}

	else if (mob_number == 7)
	{
	    return ("Kobold Archer");
	}
	
	else if (mob_number == 8)
	{
	    return ("Kobold Shaman");
	}
	
	else if (mob_number == 9)
	{
	    return ("Stable Shadow Elemental");
	}
	
	else if (mob_number == 10)
	{
	    return ("Stable Light Elemental");
	}
	
	else if (mob_number == 11)
	{
	    return ("Centaur Soldier");
	}
	
	else if (mob_number == 12)
	{
	    return ("Centaur Shaman");
	}
	
	else if (mob_number == 13)
	{
	    return ("Freezing Zealot");
	}
	
	else if (mob_number == 14)
	{
	    return ("Shadow Zealot");
	}
	
	else if (mob_number == 15)
	{
	    return ("Light Zealot");
	}
	
	else if (mob_number == 16)
	{
	    return ("Passive Tusker");
	}
	
	else if (mob_number == 17)
	{
	    return ("Vampiric Bat");
	}
	/////////////////////////UNCOMMONS//////////////////////////////////////////////
												//18 - Unstable Water Elemental, 19 - Voidborn Bladesman, 20 - Goblin Changling
												//21 - Orc Tribe Leader
	else if (mob_number == 18)
	{
	    return ("Unstable Water Elemental");
	}
	
	else if (mob_number == 19)
	{
	    return ("Voidborn Bladesman");
	}
	
	else if (mob_number == 20)
	{
	    return ("Goblin Changling");
	}
	
	else if (mob_number == 21)
	{
	    return ("Orc Soldier");
	}
	
	else if (mob_number == 22)
	{
	    return ("Unstable Water Elemental");
	}
	
	else if (mob_number == 23)
	{
	    return ("Unstable Shadow Elemental");
	}
	
	else if (mob_number == 24)
	{
	    return ("Unstable Light Elemental");
	}
	
	else if (mob_number == 25)
	{
	    return ("Centaur War-Leader");
	}
	
	else if (mob_number == 26)
	{
	    return ("Kobold War-Leader");
	}
	
	else if (mob_number == 27)
	{
	    return ("Orc Archer");
	}
	
	else if (mob_number == 28)
	{
	    return ("Orc Shaman");
	}
	
	else if (mob_number == 29)
	{
	    return ("Vampiric Swarm");
	}
	
	//////////////////////////////RARES///////////////////////
	

	else if (mob_number == 30)
	{
	    return ("Orc War-Leader");
	}
	
	else if (mob_number == 31)
	{
	    return ("Enraged Giant");
	}
	
	else if (mob_number == 32)
	{
	    return ("Triton Assasin");
	}
	
	else if (mob_number == 33)
	{
	    return ("Desta-Ghoul");
	}
	
	else if (mob_number == 34)
	{
	    return ("Kaiser Frog");
	}
	
	else if (mob_number == 35)
	{
	    return ("Marg Don");
	}
	
	else if (mob_number == 36)
	{
	    return ("Air Manta");
	}
	
	////////////////////////LEGENDARY/////////////////////
	
	
	else if (mob_number == 37)
	{
	    return ("Gleam Eyes");
	}
	
	else if (mob_number == 38)
	{
	    return ("The Crystal Dragon");
	}
	
	else if (mob_number == 39)           //Main bosses from ANIME (Godfree for level 100)
	{
	    return ("The Skull Reaper");
	}
	
	else if (mob_number == 40)
	{
	    return ("Nicholas, The Renegade");
	}
	return ("Bad Egg");
    }
    
} // SAO_ARC class
