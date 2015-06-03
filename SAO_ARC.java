/************************
*      Aidan Smith      *
*  The SAO Arc Project  *
*     June 16th 2015    *
************************/
/*
Welcome to the code of the SAO Arc project.
This is a game developed in Java based on the
popular anime and manga, Sword Art Online (SAO).
It is a text based RPG with over 50 different                                                               MAKE A HEALTH BAR IN FIGHT THAT DEPLEATES BASED ON %
standard mobs and 4 extremley rare mobs. Character
stats are saved and when you die, you restart.

The four basic statistcs are:

Strength: Determines how much damage you do.
Defence: Detemines how much damage you are able to negate.
Evasion: How easily you can dodge an attack.
Health: Determines how much damage you can take. Restored at the end of every fight.

When you are in battle, you have 5 options as your moves:

Slash: Deals damage, countered by parry
Stab: Deals damage, countered by block
Parry: Counters slash, deals reduced damage to enemy if proper counter
Block: Counters stab, deals reduced damage to enemy if proper counter
Flee: Run away, has a 50% chance of faliure, you take half damage whenever you try to flee

*/

import java.awt.*;
import hsa.Console;
import java.io.*;
import hsa.*;

public class SAO_ARC
{
    static Console c; // The output console
    static int strength; //ALL STATS UNDERNEATH BEFORE MAIN ARE CONSTANTLY USED, AND CHANGED, MADE STATIC SO THAT I DONT NEED TO CONSTANTLY PASS THEM
    static int defence;
    static int health;
    static double evasion = 30;
    static int level = 1;
    static int xp = 0;
    static int xp_to_next_level = 100;
    static String player_name = "";
    static double[] mob_stats = {1, 1, 1000, 100, 42};                                  //ARRAY POINTS --- 0 = HP --- 1 = DEFENCE --- 2 = STRENGTH --- 3 = EVADE --- 4 = XP
    static String mob_name = "Missingno"; /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static boolean exit = false;
    static String password;
    static boolean death = false;
    static boolean proper_login = false;
    static boolean godfree_fight = false;
    static boolean finished_game = false;

    public static void main (String[] args) throws IOException
    {
	c = new Console ();

	int box_at;
	boolean saved = true;
	int new_player = 0;
	int exit_selected = 0;
	char key_pressed;
	Font small_letters = new Font ("MingLiU", Font.PLAIN, 25);
	Font title_screen = new Font ("Bauhaus 93", Font.ITALIC, 40);
	Font large_letters = new Font ("MingLiU", Font.PLAIN, 50);
	Font largest_letters = new Font ("MingLiU", Font.BOLD, 100);
	Font death_font = new Font ("MingLiU", Font.BOLD, 75);
	
	while (proper_login == false)
	{
	    new_player = start_menu ();
	}

	if (new_player == 0)
	{
	    rules ();
	}

	while (exit == false)
	{
	    box_at = secondary_menu ();
	    switch (box_at)
	    {
		case 0:
		    { //c.drawString ("Battle", 100, 215);//0
			saved = false;
			init_fight ();
			break;
		    }

		case 1:
		    { //c.drawString ("Stats", 115, 335);//1
			//look_at_stats;
			break;
		    }

		case 2:
		    { //c.drawString ("Cheats", 95, 450);//2
			//saved = cheat_page ();///////////////////////////////////////CHEATS PAGE RETURNS A TRUE OR FALSE TO TEST IF CHANGES WERE MADE
			break;
		    }

		case 3:
		    { //c.drawString ("Inventory", 395, 215);//3
			//saved = inventory_check;///////////////////////////////////////SAME FOR INVERNTORY
			break;
		    }

		case 4:
		    { //c.drawString ("Rules", 430, 335);//4
			rules ();
			break;
		    }

		case 5:
		    { //c.drawString ("Save", 440, 450);//5
			save_game ();
			saved = true;
			c.setFont (largest_letters);
			c.setColor (Color.red);
			c.drawString ("Saved!", 150, 250);
			c.setColor (Color.black);
			delay (500);
			break;
		    }
	    } //Switch
	    c.clear ();


	    if (exit == true)
	    {
		if (saved == false)
		{
		    c.setFont (small_letters);
		    c.drawString ("Are you sure you want to quit without saving?", 35, 80);
		    draw_selected_box (175, 100);
		    draw_box (175, 250);

		    c.setFont (title_screen);
		    c.drawString ("Yes", 265, 162);
		    c.drawString ("No", 275, 315);

		    do
		    {
			key_pressed = c.getChar ();

			if (key_pressed == 'w')
			{
			    draw_box (175, 250);
			    draw_selected_box (175, 100);
			    exit_selected = 0;
			}

			else if (key_pressed == 's')
			{
			    draw_box (175, 100);
			    draw_selected_box (175, 250);
			    exit_selected = 1;
			}

			c.drawString ("Yes", 265, 162);
			c.drawString ("No", 275, 315);
		    }
		    while (key_pressed != '\n');

		    if (exit_selected == 0)
		    {
			break;
		    }

		    else
		    {
			exit = false;
			continue;
		    }
		}
	    }

	    if (death == true)
	    {
		break;
	    }
	}

	if (death == false)
	{
	    c.clear ();
	    c.setColor (Color.black);
	    c.setFont (large_letters);
	    c.drawString ("THANKS FOR PLAYING!", 100, 250);
	}

	else
	{
	    c.clear ();
	    c.setColor (Color.red);
	    c.setFont (death_font);
	    c.drawString ("YOU HAVE DIED", 50, 250);
	}

    } // main method


    public static int start_menu () throws IOException
    {

	char key_pressed;
	int title_screen_selected = 0;

	Color light_blue = new Color (0, 191, 255);
	c.setColor (light_blue);
	c.fillRect (0, 0, 640, 500);

	c.setColor (Color.black);
	Font big_letters = new Font ("MingLiU", Font.PLAIN, 50);
	c.setFont (big_letters);
	c.drawString ("Sword Art Online ARC", 60, 80);

	draw_selected_box (175, 100);
	draw_box (175, 250);

	Font title_screen = new Font ("Bauhaus 93", Font.ITALIC, 40);
	c.setFont (title_screen);
	c.drawString ("New Game", 200, 162);
	c.drawString ("Load Game", 200, 315);

	do
	{
	    key_pressed = c.getChar ();

	    if (key_pressed == 'w')
	    {
		draw_box (175, 250);
		draw_selected_box (175, 100);
		title_screen_selected = 0;
	    }

	    else if (key_pressed == 's')
	    {
		draw_box (175, 100);
		draw_selected_box (175, 250);
		title_screen_selected = 1;
	    }

	    c.drawString ("New Game", 200, 162);
	    c.drawString ("Load Game", 200, 315);
	}
	while (key_pressed != '\n');

	c.clear ();

	if (title_screen_selected == 0)
	{
	    create_new_user ();
	}

	else if (title_screen_selected == 1)
	{
	    load_user ();
	}
	return (title_screen_selected);
    }


    public static void draw_box (int x, int y)
    {
	c.setColor (Color.black);
	c.drawRect ((x - 1), (y - 1), 251, 101);
	c.setColor (Color.gray);
	c.fillRect (x, y, 250, 100);
	c.setColor (Color.black);
    }


    public static void draw_selected_box (int x, int y)
    {
	c.setColor (Color.black);
	c.drawRect ((x - 1), (y - 1), 251, 101);
	c.setColor (Color.lightGray);
	c.fillRect (x, y, 250, 100);
	c.setColor (Color.gray);
	c.fillRect ((x + 10), (y + 10), 230, 80);
	c.setColor (Color.black);
    }


    public static void load_user () throws IOException
    {
	String name_on_list;
	String input_password;
	boolean illegal_pass;

	Color light_blue = new Color (0, 191, 255);
	c.setColor (light_blue);
	c.fillRect (0, 0, 640, 500);
	c.setTextBackgroundColor (light_blue);

	c.setColor (Color.black);
	Font title_screen = new Font ("Bauhaus 93", Font.ITALIC, 30);
	c.setFont (title_screen);

	while (1 == 1)
	{
	    BufferedReader read_name_list = new BufferedReader (new FileReader ("name_list.txt")); //Opens the file in a way that can read Null
	    name_on_list = read_name_list.readLine ();

	    c.drawString ("Enter your player name", 135, 100);
	    c.setCursor (8, 33);
	    player_name = c.readLine ();

	    while (name_on_list != null) //Checks if there is nothing let to read
	    {
		if (name_on_list.equals (player_name)) //Checks if the name in the file is the same as the one entered
		{
		    break;
		}

		name_on_list = read_name_list.readLine (); //Gets new word on list
	    }

	    if (name_on_list == null)
	    {
		c.clear ();
		c.setCursor (7, 26);
		c.setTextColor (Color.red);
		c.println ("That username is not in use");
		c.setTextColor (Color.black);
	    }

	    else
	    {
		c.setCursor (7, 26);
		c.println ();
		read_name_list.close ();
		break;
	    }
	} //INFINTE WHILE

	TextInputFile player_save_data = new TextInputFile (player_name + ".txt");
	password = player_save_data.readString ();

	if (!(password.equals ("|")))
	{
	    while (1 == 1)
	    {
		c.drawString ("Enter your password", 150, 300);

		do //TEST FOR ILLEGAL CHARACTERS
		{
		    c.setCursor (17, 35);
		    input_password = c.readLine ();
		    illegal_pass = false;

		    for (int i = 0 ; i < input_password.length () ; i++) //Used to make sure no illegal characters are entered
		    {
			if ((int) input_password.charAt (i) == 57 || (int) input_password.charAt (i) == 134 || input_password.charAt (i) == ':' || input_password.charAt (i) == '*' || input_password.charAt (i) == '?' || (int) input_password.charAt (i) == 34 || input_password.charAt (i) == '<' || input_password.charAt (i) == '>' || input_password.charAt (i) == '|' || input_password.charAt (i) == ' ')
			{
			    illegal_pass = true;
			}

			else
			{
			    illegal_pass = false;
			}
			c.setCursor (1, 1);
			c.print (i);
		    }

		    if (illegal_pass == true)
		    {
			c.setCursor (16, 20);
			c.setTextColor (Color.red);
			c.println ("That password contains illegal characters");
			c.setTextColor (Color.black);
			c.println ();
			input_password = "";
		    }

		}
		while (illegal_pass == true);

		if (!(input_password.equals (password)))
		{
		    c.setCursor (16, 21);
		    c.setTextColor (Color.red);
		    c.println ("That was not the correct password");
		    c.setTextColor (Color.black);
		    c.println ();
		}

		else
		{
		    break;
		}

	    } //END INFINITE WHILE 2

	    strength = player_save_data.readInt ();
	    defence = player_save_data.readInt ();
	    health = player_save_data.readInt ();
	    evasion = player_save_data.readDouble ();
	    level = player_save_data.readInt ();
	    xp = player_save_data.readInt ();
	    xp_to_next_level = player_save_data.readInt ();

	    player_save_data.close ();
	    proper_login = true;
	}

	else if ((password.equals ("|")))
	{
	    c.clear ();
	    c.setFont (title_screen);
	    c.setColor (Color.red);
	    c.drawString ("THIS PLAYER IS DEAD", 200, 200);
	    delay (1000);
	    proper_login = false;
	}

    }


    public static void create_new_user () throws IOException
    {
	boolean name_taken = false;
	String name_on_list;
	boolean illegal_name = false;
	boolean illegal_pass = false;

	Color light_blue = new Color (0, 191, 255);
	c.setColor (light_blue);
	c.fillRect (0, 0, 640, 500);
	c.setTextBackgroundColor (light_blue);

	c.setColor (Color.black);
	Font title_screen = new Font ("Bauhaus 93", Font.ITALIC, 30);
	c.setFont (title_screen);

	PrintWriter input_name_list = new PrintWriter (new FileWriter ("name_list.txt", true));  //Starts writing at the end

	while (1 == 1)
	{
	    BufferedReader read_name_list = new BufferedReader (new FileReader ("name_list.txt")); //Opens the file in a way that can read Null

	    c.drawString ("Please enter a character name", 100, 100);  //Enters username
	    c.setCursor (8, 37);
	    player_name = c.readLine ();

	    name_on_list = read_name_list.readLine (); //takes the first name on the list

	    while (name_on_list != null) //Checks if there is nothing let to read
	    {
		if (name_on_list.equals (player_name)) //Checks if the name in the file is the same as the one entered
		{
		    break;
		}

		name_on_list = read_name_list.readLine (); //Gets new word on list
	    }

	    for (int i = 0 ; i < player_name.length () ; i++)
	    {
		if ((int) player_name.charAt (i) == 57 || (int) player_name.charAt (i) == 134 || player_name.charAt (i) == ':' || player_name.charAt (i) == '*' || player_name.charAt (i) == '?' || (int) player_name.charAt (i) == 34 || player_name.charAt (i) == '<' || player_name.charAt (i) == '>' || player_name.charAt (i) == '|')
		{
		    illegal_name = true;
		}
	    }

	    if (name_on_list != null) //If the name is taken, the name on the list will not be null
	    {
		c.clear ();
		c.setCursor (7, 28);
		c.setTextColor (Color.red);
		c.println ("That username is taken");
		c.setTextColor (Color.black);
	    }

	    else if (illegal_name == true)
	    {
		c.clear ();
		c.setCursor (7, 20);
		c.setTextColor (Color.red);
		c.println ("That username contains illegal characters");
		c.setTextColor (Color.black);
		illegal_name = false;
	    }

	    else
	    {
		input_name_list.println (player_name);
		read_name_list.close ();
		break;
	    }
	    read_name_list.close ();
	}

	c.setCursor (7, 1);
	c.println ();

	c.drawString ("Please enter your password", 120, 300);
	PrintWriter input_save_data = new PrintWriter (new FileWriter (player_name + ".txt"));

	do
	{
	    c.setCursor (18, 35);
	    password = c.readLine ();
	    illegal_pass = false;

	    for (int i = 0 ; i < password.length () ; i++) //Used to make sure no illegal characters are entered
	    {
		if ((int) password.charAt (i) == 57 || (int) password.charAt (i) == 134 || password.charAt (i) == ':' || password.charAt (i) == '*' || password.charAt (i) == '?' || (int) password.charAt (i) == 34 || password.charAt (i) == '<' || password.charAt (i) == '>' || password.charAt (i) == '|' || password.charAt (i) == ' ')
		{
		    illegal_pass = true;
		}

		else
		{
		    illegal_pass = false;
		}
		c.setCursor (1, 1);
		c.print (i);
	    }

	    if (illegal_pass == true)
	    {
		c.setCursor (17, 20);
		c.setTextColor (Color.red);
		c.println ("That password contains illegal characters");
		c.setTextColor (Color.black);
		c.println ();
		password = "";
	    }

	}
	while (illegal_pass == true);

	input_save_data.println (password);

	strength = (int) (Math.random () * (5) + 10); //Strength between 10 and 15
	defence = (int) (Math.random () * (2) + 5);    //Defence between 5 and 7
	health = (int) (Math.random () * (10) + 25);   //Heath between 25 and 35

	input_save_data.println (strength);
	input_save_data.println (defence);
	input_save_data.println (health);
	input_save_data.println (evasion);
	input_save_data.println (level);
	input_save_data.println (xp);
	input_save_data.println (xp_to_next_level);

	input_save_data.close ();
	input_name_list.close ();
	proper_login = true;
    }


    public static int secondary_menu ()  //////////////////////////////////////////////SECONDARY MENU
    {
	int box_at = 0;
	char char_pressed;                                               //    00000   33333
									 //    11111   44444
									 //    22222   55555
	Color light_blue = new Color (0, 191, 255);
	c.setColor (light_blue);                  //Generates and sets Background Color
	c.fillRect (0, 0, 640, 500);

	draw_selected_box_2 (50, 150);  //0
	draw_box_2 (50, 270); //1
	draw_box_2 (50, 390); //2
	draw_box_2 (370, 150); //3
	draw_box_2 (370, 270); //4
	draw_box_2 (370, 390); //5

	Font big_letters = new Font ("MingLiU", Font.PLAIN, 50);
	c.setFont (big_letters);
	c.drawString ("Sword Art Online ARC", 60, 100);

	Font small_letters = new Font ("MingLiU", Font.PLAIN, 15);
	c.setFont (small_letters);
	c.drawString ("Use 'w', 's', 'a', and 'd', to navigate. Press enter to select, '=' to quit.", 55, 130);

	c.setColor (Color.black);
	Font title_screen = new Font ("Bauhaus 93", Font.ITALIC, 40);
	c.setFont (title_screen);

	c.drawString ("Battle", 100, 215); //0
	c.drawString ("Stats", 115, 335); //1
	c.drawString ("Cheats", 95, 450); //2
	c.drawString ("Inventory", 395, 215); //3
	c.drawString ("Rules", 430, 335); //4
	c.drawString ("Save", 440, 450); //5

	do
	{
	    char_pressed = c.getChar ();

	    if (char_pressed == 'w')
	    {
		switch (box_at)
		{
		    case 0:
			{
			    box_at = 2;
			    draw_selected_box_2 (50, 390); //2
			    draw_box_2 (50, 150); //0
			    c.drawString ("Battle", 100, 215); //0
			    c.drawString ("Cheats", 95, 450); //2
			    break;
			}

		    case 1:
			{
			    box_at = 0;
			    draw_selected_box_2 (50, 150); //0
			    draw_box_2 (50, 270); //1
			    c.drawString ("Battle", 100, 215); //0
			    c.drawString ("Stats", 115, 335); //1
			    break;
			}

		    case 2:
			{
			    box_at = 1;
			    draw_selected_box_2 (50, 270); //1
			    draw_box_2 (50, 390); //2
			    c.drawString ("Stats", 115, 335); //1
			    c.drawString ("Cheats", 95, 450); //2
			    break;
			}

		    case 3:
			{
			    box_at = 5;
			    draw_selected_box_2 (370, 390); //5
			    draw_box_2 (370, 150); //3
			    c.drawString ("Inventory", 395, 215); //3
			    c.drawString ("Save", 440, 450); //5
			    break;
			}

		    case 4:
			{
			    box_at = 3;
			    draw_selected_box_2 (370, 150); //3
			    draw_box_2 (370, 270); //4
			    c.drawString ("Inventory", 395, 215); //3
			    c.drawString ("Rules", 430, 335); //4
			    break;
			}

		    case 5:
			{
			    box_at = 4;
			    draw_selected_box_2 (370, 270); //4
			    draw_box_2 (370, 390); //5
			    c.drawString ("Rules", 430, 335); //4
			    c.drawString ("Save", 440, 450); //5
			    break;
			}
		}
	    }

	    else if (char_pressed == 's')
	    {
		switch (box_at)
		{
		    case 0:
			{
			    box_at = 1;
			    draw_selected_box_2 (50, 270); //1
			    draw_box_2 (50, 150); //0
			    c.drawString ("Battle", 100, 215); //0
			    c.drawString ("Stats", 115, 335); //1
			    break;
			}

		    case 1:
			{
			    box_at = 2;
			    draw_selected_box_2 (50, 390); //2
			    draw_box_2 (50, 270); //1
			    c.drawString ("Stats", 115, 335); //1
			    c.drawString ("Cheats", 95, 450); //2
			    break;
			}

		    case 2:
			{
			    box_at = 0;
			    draw_selected_box_2 (50, 150); //0
			    draw_box_2 (50, 390); //2
			    c.drawString ("Battle", 100, 215); //0
			    c.drawString ("Cheats", 95, 450); //2
			    break;
			}

		    case 3:
			{
			    box_at = 4;
			    draw_selected_box_2 (370, 270); //4
			    draw_box_2 (370, 150); //3
			    c.drawString ("Inventory", 395, 215); //3
			    c.drawString ("Rules", 430, 335); //4
			    break;
			}

		    case 4:
			{
			    box_at = 5;
			    draw_selected_box_2 (370, 390); //5
			    draw_box_2 (370, 270); //4
			    c.drawString ("Rules", 430, 335); //4
			    c.drawString ("Save", 440, 450); //5
			    break;
			}

		    case 5:
			{
			    box_at = 3;
			    draw_selected_box_2 (370, 150); //3
			    draw_box_2 (370, 390); //5
			    c.drawString ("Inventory", 395, 215); //3
			    c.drawString ("Save", 440, 450); //5
			    break;
			}
		}

	    }

	    else if (char_pressed == 'a')
	    {
		switch (box_at)
		{
		    case 0:
			{
			    box_at = 3;
			    draw_selected_box_2 (370, 150); //3
			    draw_box_2 (50, 150); //0
			    c.drawString ("Battle", 100, 215); //0
			    c.drawString ("Inventory", 395, 215); //3
			    break;
			}

		    case 1:
			{
			    box_at = 4;
			    draw_selected_box_2 (370, 270); //4
			    draw_box_2 (50, 270); //1
			    c.drawString ("Stats", 115, 335); //1
			    c.drawString ("Rules", 430, 335); //4
			    break;
			}

		    case 2:
			{
			    box_at = 5;
			    draw_selected_box_2 (370, 390); //5
			    draw_box_2 (50, 390); //2
			    c.drawString ("Cheats", 95, 450); //2
			    c.drawString ("Save", 440, 450); //5
			    break;
			}

		    case 3:
			{
			    box_at = 0;
			    draw_selected_box_2 (50, 150); //0
			    draw_box_2 (370, 150); //3
			    c.drawString ("Battle", 100, 215); //0
			    c.drawString ("Inventory", 395, 215); //3
			    break;
			}

		    case 4:
			{
			    box_at = 1;
			    draw_selected_box_2 (50, 270); //1
			    draw_box_2 (370, 270); //4
			    c.drawString ("Stats", 115, 335); //1
			    c.drawString ("Rules", 430, 335); //4
			    break;
			}

		    case 5:
			{
			    box_at = 2;
			    draw_selected_box_2 (50, 390); //2
			    draw_box_2 (370, 390); //5
			    c.drawString ("Cheats", 95, 450); //2
			    c.drawString ("Save", 440, 450); //5
			    break;
			}
		}
	    }

	    else if (char_pressed == 'd')
	    {
		switch (box_at)
		{
		    case 0:
			{
			    box_at = 3;
			    draw_selected_box_2 (370, 150); //3
			    draw_box_2 (50, 150); //0
			    c.drawString ("Battle", 100, 215); //0
			    c.drawString ("Inventory", 395, 215); //3
			    break;
			}

		    case 1:
			{
			    box_at = 4;
			    draw_selected_box_2 (370, 270); //4
			    draw_box_2 (50, 270); //1
			    c.drawString ("Stats", 115, 335); //1
			    c.drawString ("Rules", 430, 335); //4
			    break;
			}

		    case 2:
			{
			    box_at = 5;
			    draw_selected_box_2 (370, 390); //5
			    draw_box_2 (50, 390); //2
			    c.drawString ("Cheats", 95, 450); //2
			    c.drawString ("Save", 440, 450); //5
			    break;
			}

		    case 3:
			{
			    box_at = 0;
			    draw_selected_box_2 (50, 150); //0
			    draw_box_2 (370, 150); //3
			    c.drawString ("Battle", 100, 215); //0
			    c.drawString ("Inventory", 395, 215); //3
			    break;
			}

		    case 4:
			{
			    box_at = 1;
			    draw_selected_box_2 (50, 270); //1
			    draw_box_2 (370, 270); //4
			    c.drawString ("Stats", 115, 335); //1
			    c.drawString ("Rules", 430, 335); //4
			    break;
			}

		    case 5:
			{
			    box_at = 2;
			    draw_selected_box_2 (50, 390); //2
			    draw_box_2 (370, 390); //5
			    c.drawString ("Cheats", 95, 450); //2
			    c.drawString ("Save", 440, 450); //5
			    break;
			}
		}
	    }

	    else if (char_pressed == '=')
	    {
		exit = true;
		box_at = 42;
		break;
	    }

	}while (char_pressed != '\n');
	c.clear ();

	return (box_at);
    }


    public static void draw_box_2 (int x, int y)  //////////////DRAWS SMALL BASIC BOX
    {
	c.setColor (Color.black);
	c.drawRect ((x - 1), (y - 1), 221, 101);
	c.setColor (Color.gray);
	c.fillRect (x, y, 220, 100);
	c.setColor (Color.black);
    }


    public static void draw_selected_box_2 (int x, int y)  //////////DRAWS SMALL SELECTED BOX
    {
	c.setColor (Color.black);
	c.drawRect ((x - 1), (y - 1), 221, 101);
	c.setColor (Color.lightGray);
	c.fillRect (x, y, 220, 100);
	c.setColor (Color.gray);
	c.fillRect ((x + 10), (y + 10), 200, 80);
	c.setColor (Color.black);
    }


    public static void rules ()
    {
	Color light_blue = new Color (0, 191, 255);
	c.setColor (light_blue);                  //Generates and sets Background Color
	c.fillRect (0, 0, 640, 500);
	c.setColor (Color.black);

	Font rules = new Font ("MingLiU", Font.PLAIN, 18);
	c.setFont (rules);
	c.drawString ("Here is your rule breifing " + player_name + ".", 1, 20);
	c.drawString ("The rules are pretty simple. In battle, you have 5 moves.", 1, 40);
	c.drawString ("They are: Slash, Stab, Parry, Block, and Flee.", 1, 60);
	c.drawString ("The amount of damage dealt depends on the attacker's strength, and", 1, 80);
	c.drawString ("the defender's defence. There is also a percentage chance to evade", 1, 100);
	c.drawString ("every turn. Parry counters slash, block counters stab. If a move is", 1, 120);
	c.drawString ("correctly countered, reduced damage will be dealt to the person", 1, 140);
	c.drawString ("whose move was countered takes half damage. When you try to flee,", 1, 160);
	c.drawString ("you have a 50% chance of getting away. No matter if you get away or not,", 1, 180);
	c.drawString ("you will take reduced damage.", 1, 200);

	c.drawString ("There is one more thing to think about during combat, weapons and", 1, 240);
	c.drawString ("armour. Each opponent will have a weapon and a suit of armour. You", 1, 260);
	c.drawString ("will have a chance to pick up their equipment at the end of a fight", 1, 280);
	c.drawString ("and use it for your own. The better your weapons, the stronger you are.", 1, 300);

	c.drawString ("Good luck in the field " + player_name + "!", 1, 340);
	c.drawString ("Press any key to continue.", 1, 380);
	c.getChar ();
	c.clear ();
    }


    public static void save_game () throws IOException
    {
	PrintWriter input_save_data = new PrintWriter (new FileWriter (player_name + ".txt"));

	input_save_data.println (password);
	input_save_data.println (strength);
	input_save_data.println (defence);
	input_save_data.println (health);
	input_save_data.println (evasion);
	input_save_data.println (level);
	input_save_data.println (xp);
	input_save_data.println (xp_to_next_level);

	input_save_data.close ();
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


    public static void init_fight () throws IOException
    {
	int mob_rarity;
	int mob_type = 42;

	mob_rarity = (int) (Math.random () * (99) + 1); //Generates a random mob rarity                   //17 Common, 12 uncommon, 7 rares, 4 Legendaries
	if (godfree_fight == true)
	{
	/////////////////////////////////////////////////////////////////////////////////////////////////////////IF YOU FIGHT GODREE
	}
	
	else if (level >= 50)
	{
	    if ((mob_rarity >= 1) && (mob_rarity <= 50))   //50% Chance, generates common
	    {
		mob_type = (int) (Math.random () * (16) + 1); //Generates 1 - 17
	    }

	    else if ((mob_rarity >= 51) && (mob_rarity <= 80))   //30% chance of uncommon
	    {
		mob_type = (int) (Math.random () * (11) + 18); //Generates 18 - 29
	    }

	    else if ((mob_rarity >= 81) && (mob_rarity <= 95))   //15% chance of rare
	    {
		mob_type = (int) (Math.random () * (6) + 30); //Generates 30 - 36
	    }

	    else if ((mob_rarity >= 96) && (mob_rarity <= 100))  //LEGENARY GENERATED 5%
	    {
		mob_type = (int) (Math.random () * (3) + 37); //Generates 37 - 40
	    }
	} //if

	else if (level < 50)
	{
	    if ((mob_rarity >= 1) && (mob_rarity <= 53))   //53% Chance, generates common
	    {
		mob_type = (int) (Math.random () * (16) + 1); //Generates 1 - 17 ;
	    }

	    else if ((mob_rarity >= 54) && (mob_rarity <= 85))   //32% chance of uncommon
	    {
		mob_type = (int) (Math.random () * (11) + 18); //Generates 18 - 29
	    }

	    else if ((mob_rarity >= 86) && (mob_rarity <= 100))   //15% chance of rare
	    {
		mob_type = (int) (Math.random () * (6) + 30); //Generates 30 - 36
	    }

	} //ELSE IF

	mob_name = set_mob_name (mob_type);
	mob_stats = mob_stat_set (mob_type, level);

	c.println ("Name: " + mob_name);
	c.println ("Health: " + mob_stats [0] + "\t\t " + health);
	c.println ("Defence: " + mob_stats [1] + "\t\t " + defence);
	c.println ("Strength: " + mob_stats [2] + "\t\t " + strength);
	c.println ("Evade: " + mob_stats [3] + "\t\t " + evasion);
	c.println ("XP: " + mob_stats [4]);

	c.getChar ();
	c.clear ();

	fight ();
    }


    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //                                                                    //BATTLE//                                                                           //
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void fight () throws IOException
    {
	int player_choice;
	int mob_choice;
	int player_fight_health = health;                           ////////////////////////////
	int fight_strength = strength;                              //PERFORM MODIFICATIONS TO//
	int fight_defence = defence;                                //      STATS HERE        //
	double fight_evasion = evasion;                             ////////////////////////////
	int mob_health = (int) mob_stats [0];
	int mob_evade_roll;
	int player_evade_roll;
	int flee_work;
	boolean killer = false;


	do
	{
	    do
	    {
		c.print (mob_name + " Health: " + mob_health);

		int space_problem = 71 - (player_name.length () + 5);  //PUTS THE NAME ON THE RIGHT SPOT ON THE LINE, THEN LEAVES SPACE FOR 5 NUMBERS OF HP

		c.setCursor (18, space_problem);
		c.print (player_name + " Health: " + player_fight_health);

		c.setCursor (20, 1);
		c.println ("1: Slash   2: Stab");
		c.print ("3: Parry   4: Block   5: Flee\t");
		player_choice = c.readInt ();


	    }
	    while (!(player_choice == 1) && (player_choice == 2) && (player_choice == 3) && (player_choice == 4) && (player_choice == 5));

	    if (player_choice == 5)
	    {
		flee_work = (int) (Math.random () * (99)) + 1;
		if ((flee_work >= 1) && (flee_work <= 50))
		{
		    //Player choice stays
		}

		else
		{
		    player_choice = 10;
		}

	    }

	    mob_choice = (int) (Math.random () * (4)) + 1;

	    mob_evade_roll = (int) (Math.random () * (99)) + 1;
	    player_evade_roll = (int) (Math.random () * (99)) + 1;

	    if ((player_choice != 5) && (player_choice != 10))  //Cant evade and flee, will cancel flee if evades
	    {
		if ((mob_evade_roll >= 1) && (mob_evade_roll <= mob_stats [3]))  //Test for Mob Evade
		{
		    if ((player_evade_roll >= 1) && (player_evade_roll <= fight_evasion))   //Test For Player Evade
		    {
			player_choice = 7;
		    }

		    else
		    {
			mob_choice = 6;
		    }
		}

		else if ((player_evade_roll >= 1) && (player_evade_roll <= fight_evasion))   //Test For Player Evade
		{
		    player_choice = 6;
		}
	    }

	    if ((mob_choice != 6) && (player_choice != 6) && (player_choice != 7) && (player_choice != 5))   //Makes sure no evasions or flee
	    {
		c.print ("The " + mob_name + " chose: ");
		if (mob_choice == 1)
		{
		    c.print ("Slash");
		}

		else if (mob_choice == 2)
		{
		    c.print ("Stab");
		}

		else if (mob_choice == 3)
		{
		    c.print ("Parry");
		}

		else if (mob_choice == 4)
		{
		    c.print ("Block");
		}
	    }

	    else if (player_choice != 5)
	    {
		if (mob_choice != 6) //If the player evaded
		{
		    c.print ("You evaded the enemy attack and hit them for reduced damage.");
		    //MOB TAKES REDUCED DAMAGE AND DEALS NONE
		    //////////////////////////////////////////////////////////////////////////////////////////////////
		    //                          //
		    if (mob_stats [1] >= (int) (fight_strength / 2))                    //                          //
		    { //                          //
			mob_health -= 1;                                                //                          //
		    } //   PLAYER DAMAGE TO MOB   //
		    //         REDUCED          //
		    else                                                                //                          //
		    { //                          //
			mob_health -= ((int) (fight_strength / 2)) - mob_stats [1];     //                          //
		    } //                          //
		    //////////////////////////////////////////////////////////////////////////////////////////////////
		}

		else if (player_choice != 6) //If the mob evaded
		{
		    c.print ("The " + mob_name + " evaded your attack and dealt reduced damage.");
		    //PLAYER TAKES REDUCED DAMAGE AND DEALS NONE
		    ////////////////////////////////////////////////////////////////////////////////////////////////////////
		    //                          //
		    if (fight_defence >= (int) (mob_stats [2] / 2))                           //                          //
		    { //                          //
			player_fight_health -= 1;                                             //                          //
		    } //   MOB DAMAGE TO PLAYER   //
		    //         REDUCED          //
		    else                                                                      //                          //
		    { //                          //
			player_fight_health -= ((int) (mob_stats [2] / 2)) - fight_defence;   //                          //
		    } //                          //
		    ////////////////////////////////////////////////////////////////////////////////////////////////////////
		}

		else // Both evade
		{
		    c.print ("Both you and the mob evaded eachothers attacks so nothing happens.");
		}
	    }

	    c.setCursor (24, 1);

	    if ((player_choice == 1 && mob_choice == 1) || (player_choice == 1 && mob_choice == 2) || (player_choice == 2 && mob_choice == 1) || (player_choice == 2 && mob_choice == 2))
	    {
		//BOTH DEAL FULL DAMAGE
		///////////////////////////////////////////////////////////////////////////////////
		if (mob_stats [1] >= fight_strength)                     //                      //
		{ //                      //
		    mob_health -= 1;                                     //                      //
		} //                      //
		// PLAYER DAMAGE TO MOB //         //ARRAY POINTS --- 0 = HP --- 1 = DEFENCE --- 2 = STRENGTH --- 3 = EVADE --- 4 = XP
		else                                                     //                      //
		{ //                      //
		    mob_health -= fight_strength - mob_stats [1];        //                      //
		} //                      //
		///////////////////////////////////////////////////////////////////////////////////
		//                      //
		if (fight_defence >= mob_stats [2])                      //                      //
		{ //                      //
		    player_fight_health -= 1;                            //                      //
		} // MOB DAMAGE TO PLAYER //
		//                      //
		else                                                     //                      //
		{ //                      //
		    player_fight_health -= mob_stats [2] - fight_defence; //                      //
		} //                      //
		///////////////////////////////////////////////////////////////////////////////////
		c.print ("Both " + mob_name + " and you take swings and deal full damage.");
	    }

	    else if ((player_choice == 3 && mob_choice == 3) || (player_choice == 3 && mob_choice == 4) || (player_choice == 4 && mob_choice == 3) || (player_choice == 4 && mob_choice == 4))
	    {
		c.print ("Both parties were prepared to counter, so no damage is dealt.");
	    }

	    else if ((player_choice == 3 && mob_choice == 2) || (player_choice == 4 && mob_choice == 1))
	    {
		//PLAYER TAKES FULL MOB TAKES NONE
		////////////////////////////////////////////////////////////////////////////////////
		//                      //
		if (fight_defence >= mob_stats [2])                       //                      //
		{ //                      //
		    player_fight_health -= 1;                             //                      //
		} // MOB DAMAGE TO PLAYER //
		//                      //
		else                                                      //                      //
		{ //                      //
		    player_fight_health -= mob_stats [2] - fight_defence; //                      //
		} //                      //
		////////////////////////////////////////////////////////////////////////////////////
		c.print ("Since you performed the wrong counter, you take full damage.");
	    }

	    else if ((player_choice == 1 && mob_choice == 4) || (player_choice == 2 && mob_choice == 3))
	    {
		//PLAYER DEALS FULL TAKES NONE
		//////////////////////////////////////////////////////////////////////////////////
		if (mob_stats [1] >= fight_strength)                    //                      //
		{ //                      //
		    mob_health -= 1;                                    //                      //
		} //                      //
		// PLAYER DAMAGE TO MOB //         //ARRAY POINTS --- 0 = HP --- 1 = DEFENCE --- 2 = STRENGTH --- 3 = EVADE --- 4 = XP
		else                                                    //                      //
		{ //                      //
		    mob_health -= fight_strength - mob_stats [1];       //                      //
		} //                      //
		//////////////////////////////////////////////////////////////////////////////////
		c.print ("Since " + mob_name + " performed the wrong counter, you deal full damage.");
	    }

	    else if ((player_choice == 1 && mob_choice == 3) || (player_choice == 2 && mob_choice == 4))
	    {
		//PLAYER TAKES REDUCED DAMAGE AND DEALS NONE
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		//                          //
		if (fight_defence >= (int) (mob_stats [2] / 2))                           //                          //
		{ //                          //
		    player_fight_health -= 1;                                             //                          //
		} //   MOB DAMAGE TO PLAYER   //
		//         REDUCED          //
		else                                                                      //                          //
		{ //                          //
		    player_fight_health -= ((int) (mob_stats [2] / 2)) - fight_defence;   //                          //
		} //                          //
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		c.print ("The " + mob_name + " properly countered your blow, so you take reduced damage.");
	    }

	    else if ((player_choice == 3 && mob_choice == 1) || (player_choice == 4 && mob_choice == 2))
	    {
		//MOB TAKES REDUCED DAMAGE AND DEALS NONE
		//////////////////////////////////////////////////////////////////////////////////////////////////
		//                          //
		if (mob_stats [1] >= (int) (fight_strength / 2))                    //                          //
		{ //                          //
		    mob_health -= 1;                                                //                          //
		} //   PLAYER DAMAGE TO MOB   //
		//         REDUCED          //
		else                                                                //                          //
		{ //                          //
		    mob_health -= ((int) (fight_strength / 2)) - mob_stats [1];     //                          //
		} //                          //
		//////////////////////////////////////////////////////////////////////////////////////////////////
		c.print ("You properly anticipated the enemy's attack and countered it, dealing reduced damage.");
	    }

	    else if (player_choice == 5 || player_choice == 10)
	    {
		//PLAYER TAKES REDUCED DAMAGE AND DEALS NONE
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		//                          //
		if (fight_defence >= (int) (mob_stats [2] / 2))                           //                          //
		{ //                          //
		    player_fight_health -= 1;                                             //                          //
		} //   MOB DAMAGE TO PLAYER   //
		//         REDUCED          //
		else                                                                      //                          //
		{ //                          //
		    player_fight_health -= ((int) (mob_stats [2] / 2)) - fight_defence;   //                          //
		} //                          //
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if (player_choice == 5)
		{
		    c.print ("You flee.");
		}

		else if (player_choice == 10)
		{
		    c.print ("You fail to flee and you take reduced damage.");
		}
	    }

	    if ((player_fight_health > 0) && (mob_health > 0))
	    {
		c.setCursor (12, 35);
		c.print ("Press any key to continue.");
		c.getChar ();
	    }

	    c.clear ();
	    c.setCursor (1, 1);

	}
	while ((player_fight_health > 0) && (mob_health > 0) && (player_choice != 5));

	if (player_fight_health > 0 && mob_health <= 0)
	{
	    c.println ("You swing your sword, hitting the enemy hard enough that it is defeated!"); /////////////////////////////////////////////////////////////////MAKE INTO NICE LETTERS
	    killer = true;
	}

	else if (player_fight_health <= 0 && mob_health > 0)//IF YOU DIE
	{
	    if (player_choice == 5 || player_choice == 10)
	    {
		c.println ("You died a coward, running away from your enemy!");
	    }

	    else
	    {
		c.println ("You have been defeated by the mighty " + mob_name + ".");
	    }

	    PrintWriter input_save_data = new PrintWriter (new FileWriter (player_name + ".txt"));

	    input_save_data.println ("|");
	    input_save_data.println ("");
	    input_save_data.println ("");
	    input_save_data.println ("");
	    input_save_data.println ("");
	    input_save_data.println ("");
	    input_save_data.println ("");
	    input_save_data.println ("");

	    input_save_data.close ();

	    c.print ("Press any key to exit the game.");
	    c.getChar ();
	    death = true;
	}

	else if (player_choice == 5)//IF YOU FLEE
	{
	    c.println ("RUN AWAYYYY!");
	    c.print ("Press any key to continue");
	}

	else//SURVIVE WITH 1 HP
	{
	    c.println ("You have barley survived the fight, almost dieing on the final swing. Be more careful   next time.");
	    killer = true;
	}
	
	
	if (killer == true)//If you get the kill
	{   
	    if ( (level == 99) && (xp_to_next_level <= (xp + mob_stats [4]) ) ) //if your next fight is godfree
	    {
		c.print ("The next mob you fight will be the final boss, GODFREE");
		godfree_fight = true;
	    }
	    
	    else if (godfree_fight == true)
	    {
		finished_game = true;
	    }
	    
	    else
	    {   
		xp += mob_stats [4];
		c.println ("You have gained " + mob_stats [4] + " XP.");
		
		if (xp >= xp_to_next_level)
		{   
		    level += 1;//ADDS LEVEL
		    xp = 0 + (xp - xp_to_next_level);
		    xp_to_next_level += 100 + (40 * (level - 1) );//GENERATES NEW AMOUNT OF XP NEEDED
		    strength += ( (int) (Math.random() * (5) ) + 5) * level;
		    defence += ( (int) (Math.random() * (4) ) + 4) * level;
		    health += ( (int) (Math.random() * (2) ) + 8) * level;
		    evasion += 0.2;
		    c.println ("You have leveled up to level " + level + "!");
		}
	    }
	    
	    c.print ("Press any key to loot the mob.");
	    c.getChar ();
	}
    }


    public static double[] mob_stat_set (int mob_type, int level)      //SETS A MOB'S STATS             ARRAY POINTS --- 0 = HP --- 1 = DEFENCE --- 2 = STRENGTH --- 3 = EVADE -- 4 = XP
    {
	double[] mob_stats = new double [5];

	switch (mob_type)
	{
	    case 1:
	    case 2:
	    case 3:
	    case 4:
		{
		    mob_stats [0] = (int) (Math.random () * (10) + 19); //Lower HP commons
		    if (level != 1) //These are to make sure you do not level up mob for level 1, continued throughtout method
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [0] += ((int) (Math.random () * (2) + 5)) * (i + 1);
			}
		    }

		    mob_stats [1] = (int) (Math.random () * (2) + 2); //STANDARD DEF COMMONS
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [1] += ((int) (Math.random () * (4) + 2)) * (i + 1);
			}
		    }

		    mob_stats [2] = (int) (Math.random () * (5) + 7);    //STANDARD STRENGTH
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [2] += ((int) (Math.random () * (4) + 3)) * (i + 1);
			}
		    }

		    mob_stats [3] = 20; //STANDARD EVASION
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [3] += 0.2;
			}
		    }

		    mob_stats [4] = 20 * level;  //COMMON XP
		    break;
		}
	    case 5:
	    case 6:
	    case 7:
	    case 8:
		{
		    mob_stats [0] = (int) (Math.random () * (10) + 21);  //Standard HP Commons
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [0] += ((int) (Math.random () * (2) + 6)) * (i + 1);
			}
		    }

		    mob_stats [1] = (int) (Math.random () * (2) + 1); //LOW DEF COMMONS
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [1] += ((int) (Math.random () * (4) + 1)) * (i + 1);
			}
		    }

		    mob_stats [2] = (int) (Math.random () * (5) + 7);    //STANDARD STRENGTH
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [2] += ((int) (Math.random () * (4) + 3)) * (i + 1);
			}
		    }

		    mob_stats [3] = 20; //STANDARD EVASION
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [3] += 0.2;
			}
		    }

		    mob_stats [4] = 20 * level;  //COMMON XP
		    break;
		}
	    case 9:
	    case 10:
	    case 11:
	    case 12:
		{
		    mob_stats [0] = (int) (Math.random () * (10) + 21);  //Standard HP Commons
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [0] += ((int) (Math.random () * (2) + 6)) * (i + 1);
			}
		    }

		    mob_stats [1] = (int) (Math.random () * (2) + 2); //STANDARD DEF COMMONS
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [1] += ((int) (Math.random () * (4) + 2)) * (i + 1);
			}
		    }

		    mob_stats [2] = (int) (Math.random () * (5) + 6);    //LOW STRENGTH COMMONS
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [2] += ((int) (Math.random () * (4) + 2)) * (i + 1);
			}
		    }

		    mob_stats [3] = 20; //STANDARD EVASION
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [3] += 0.2;
			}
		    }

		    mob_stats [4] = 20 * level;  //COMMON XP
		    break;
		}
	    case 13:
	    case 14:
	    case 15:
	    case 16:
		{
		    mob_stats [0] = (int) (Math.random () * (10) + 21);  //Standard HP Commons
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [0] += ((int) (Math.random () * (2) + 6)) * (i + 1);
			}
		    }

		    mob_stats [1] = (int) (Math.random () * (2) + 2); //STANDARD DEF COMMONS
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [1] += ((int) (Math.random () * (4) + 2)) * (i + 1);
			}
		    }

		    mob_stats [2] = (int) (Math.random () * (5) + 7);    //STANDARD STRENGTH
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [2] += ((int) (Math.random () * (4) + 3)) * (i + 1);
			}
		    }

		    mob_stats [3] = 18; //LOWERED EVASION
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [3] += 0.18;
			}
		    }

		    mob_stats [4] = 20 * level;  //COMMON XP
		    break;
		}
	    case 17:
		{
		    mob_stats [0] = (int) (Math.random () * (10) + 21);  //Standard HP Commons
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [0] += ((int) (Math.random () * (2) + 6)) * (i + 1);
			}
		    }

		    mob_stats [1] = (int) (Math.random () * (2) + 2); //STANDARD DEF COMMONS
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [1] += ((int) (Math.random () * (4) + 2)) * (i + 1);
			}
		    }

		    mob_stats [2] = (int) (Math.random () * (5) + 7);    //STANDARD STRENGTH
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [2] += ((int) (Math.random () * (4) + 3)) * (i + 1);
			}
		    }

		    mob_stats [3] = 20; //STANDARD evasion Commons
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [3] += 0.2;
			}
		    }

		    mob_stats [4] = 20 * level;  //COMMON XP
		    break;
		}
		///////////////////////////////////////////////////UNCOMMONS///////////////////////////////////////////////////////////////////////////////////////////////
	    case 18:
	    case 19:
	    case 20:
		{
		    mob_stats [0] = (int) (Math.random () * (10) + 21);  //LOWER HP UNCOMMONS
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [0] += ((int) (Math.random () * (2) + 6)) * (i + 1);
			}
		    }

		    mob_stats [1] = (int) (Math.random () * (2) + 4); //STANDARD DEF UNCOMMONS
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [1] += ((int) (Math.random () * (4) + 3)) * (i + 1);
			}
		    }

		    mob_stats [2] = (int) (Math.random () * (5) + 9);    //STANDARD STRENGTH UNCOMMONS
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [2] += ((int) (Math.random () * (4) + 4)) * (i + 1);
			}
		    }

		    mob_stats [3] = 25; //STANDARD evasion UNCOMMONS
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [3] += 0.2;
			}
		    }

		    mob_stats [4] = 30 * level;  //UNCOMMON XP
		    break;
		}

	    case 21:
	    case 22:
	    case 23:
		{
		    mob_stats [0] = (int) (Math.random () * (10) + 23); //Standard HP Uncommons
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [0] += ((int) (Math.random () * (2) + 7)) * (i + 1);
			}
		    }

		    mob_stats [1] = (int) (Math.random () * (2) + 2); //LOWER DEF UNCOMMONS
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [1] += ((int) (Math.random () * (4) + 2)) * (i + 1);
			}
		    }

		    mob_stats [2] = (int) (Math.random () * (5) + 9);    //STANDARD STRENGTH UNCOMMONS
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [2] += ((int) (Math.random () * (4) + 4)) * (i + 1);
			}
		    }

		    mob_stats [3] = 25; //STANDARD evasion UNCOMMONS
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [3] += 0.2;
			}
		    }

		    mob_stats [4] = 30 * level;  //UNCOMMON XP
		    break;
		}
	    case 24:
	    case 25:
	    case 26:
		{
		    mob_stats [0] = (int) (Math.random () * (10) + 23); //Standard HP Uncommons
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [0] += ((int) (Math.random () * (2) + 7)) * (i + 1);
			}
		    }

		    mob_stats [1] = (int) (Math.random () * (2) + 4); //STANDARD DEF UNCOMMONS
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [1] += ((int) (Math.random () * (4) + 3)) * (i + 1);
			}
		    }

		    mob_stats [2] = (int) (Math.random () * (5) + 7);    //LOWER STRENGTH UNCOMMONS
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [2] += ((int) (Math.random () * (4) + 3)) * (i + 1);
			}
		    }

		    mob_stats [3] = 25; //STANDARD evasion UNCOMMONS
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [3] += 0.2;
			}
		    }

		    mob_stats [4] = 30 * level;  //UNCOMMON XP
		    break;
		}
	    case 27:
	    case 28:
	    case 29:
		{
		    mob_stats [0] = (int) (Math.random () * (10) + 23); //Standard HP Uncommons
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [0] += ((int) (Math.random () * (2) + 7)) * (i + 1);
			}
		    }

		    mob_stats [1] = (int) (Math.random () * (2) + 4); //STANDARD DEF UNCOMMONS
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [1] += ((int) (Math.random () * (4) + 3)) * (i + 1);
			}
		    }

		    mob_stats [2] = (int) (Math.random () * (5) + 9);    //STANDARD STRENGTH UNCOMMONS
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [2] += ((int) (Math.random () * (4) + 4)) * (i + 1);
			}
		    }

		    mob_stats [3] = 20; //LOWERED evasion UNCOMMONS
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [3] += 0.18;
			}
		    }

		    mob_stats [4] = 30 * level;  //UNCOMMON XP
		    break;
		}
		////////////////////////////////////////////////////////RARES/////////////////////////////////////////////////////////////////////
	    case 30:
	    case 31:
		{
		    mob_stats [0] = (int) (Math.random () * (10) + 23); //Low HP Rares
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [0] += ((int) (Math.random () * (2) + 7)) * (i + 1);
			}
		    }

		    mob_stats [1] = (int) (Math.random () * (2) + 5); //STANDARD DEF RARES
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [1] += ((int) (Math.random () * (4) + 2)) * (i + 1);
			}
		    }

		    mob_stats [2] = (int) (Math.random () * (5) + 10);    //STANDARD STRENGTH RARES
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [2] += ((int) (Math.random () * (5) + 5)) * (i + 1);
			}
		    }

		    mob_stats [3] = 30; //STANDARD evasion RARES
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [3] += 0.2;
			}
		    }

		    mob_stats [4] = 40 * level;  //RARE XP
		    break;
		}

	    case 32:
		{
		    mob_stats [0] = (int) (Math.random () * (10) + 25); //STANDARD HP RARES
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [0] += ((int) (Math.random () * (4) + 2)) * (i + 1);
			}
		    }

		    mob_stats [1] = (int) (Math.random () * (2) + 4); //LOWERED DEF RARES
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [1] += ((int) (Math.random () * (4) + 3)) * (i + 1);
			}
		    }

		    mob_stats [2] = (int) (Math.random () * (5) + 10);    //STANDARD STRENGTH RARES
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [2] += ((int) (Math.random () * (5) + 5)) * (i + 1);
			}
		    }

		    mob_stats [3] = 30; //STANDARD evasion RARES
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [3] += 0.2;
			}
		    }

		    mob_stats [4] = 40 * level;  //RARE XP
		    break;
		}
	    case 33:
		{
		    mob_stats [0] = (int) (Math.random () * (10) + 25); //STANDARD HP RARES
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [0] += ((int) (Math.random () * (4) + 2)) * (i + 1);
			}
		    }

		    mob_stats [1] = (int) (Math.random () * (2) + 5); //STANDARD DEF RARES
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [1] += ((int) (Math.random () * (4) + 2)) * (i + 1);
			}
		    }

		    mob_stats [2] = (int) (Math.random () * (5) + 9);    //LOWERED STRENGTH RARES
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [2] += ((int) (Math.random () * (4) + 4)) * (i + 1);
			}
		    }

		    mob_stats [3] = 30; //STANDARD evasion RARES
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [3] += 0.2;
			}
		    }

		    mob_stats [4] = 40 * level;  //RARE XP
		    break;
		}
	    case 34:
		{
		    mob_stats [0] = (int) (Math.random () * (10) + 25); //STANDARD HP RARES
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [0] += ((int) (Math.random () * (4) + 2)) * (i + 1);
			}
		    }

		    mob_stats [1] = (int) (Math.random () * (2) + 5); //STANDARD DEF RARES
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [1] += ((int) (Math.random () * (4) + 2)) * (i + 1);
			}
		    }

		    mob_stats [2] = (int) (Math.random () * (5) + 10);    //STANDARD STRENGTH RARES
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [2] += ((int) (Math.random () * (5) + 5)) * (i + 1);
			}
		    }

		    mob_stats [3] = 25; //LOWERED evasion RARES
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [3] += 0.18;
			}
		    }

		    mob_stats [4] = 40 * level;  //RARE XP
		    break;
		}
	    case 35:
	    case 36:
		{
		    mob_stats [0] = (int) (Math.random () * (10) + 25); //Regular HP Rares
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [0] += ((int) (Math.random () * (2) + 8)) * (i + 1);
			}
		    }

		    mob_stats [1] = (int) (Math.random () * (2) + 5); //STANDARD DEF RARES
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [1] += ((int) (Math.random () * (4) + 2)) * (i + 1);
			}
		    }

		    mob_stats [2] = (int) (Math.random () * (5) + 10);    //STANDARD STRENGTH RARES
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [2] += ((int) (Math.random () * (5) + 5)) * (i + 1);
			}
		    }

		    mob_stats [3] = 30; //STANDARD evasion RARES
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [3] += 0.2;
			}
		    }

		    mob_stats [4] = 40 * level;  //RARE XP
		    break;
		}
		/////////////////////////////////////////////////LEGENDARIES/////////////////////////////////////////////////////////////////////////
	    case 37:
		{
		    mob_stats [0] = (int) (Math.random () * (10) + 27); //Regular HP LEGENDARIES
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [0] += ((int) (Math.random () * (2) + 9)) * (i + 1);
			}
		    }

		    mob_stats [1] = (int) (Math.random () * (2) + 7); //STANDARD DEF LEGEND
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [1] += ((int) (Math.random () * (4) + 5)) * (i + 1);
			}
		    }

		    mob_stats [2] = (int) (Math.random () * (5) + 12);    //STANDARD STRENGTH LEGENDARIES
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [2] += ((int) (Math.random () * (5) + 6)) * (i + 1);
			}
		    }

		    mob_stats [3] = 30; //LOWERED evasion LEGEND
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [3] += 0.18;
			}
		    }

		    mob_stats [4] = 60 * level;  //LEGEND XP
		    break;
		}
	    case 38:
		{
		    mob_stats [0] = (int) (Math.random () * (10) + 27); //Regular HP LEGENDARIES
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [0] += ((int) (Math.random () * (2) + 9)) * (i + 1);
			}
		    }

		    mob_stats [1] = (int) (Math.random () * (2) + 7); //STANDARD DEF LEGEND
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [1] += ((int) (Math.random () * (4) + 5)) * (i + 1);
			}
		    }

		    mob_stats [2] = (int) (Math.random () * (5) + 10);    //LOWERED STRENGTH LEGENDARIES
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [2] += ((int) (Math.random () * (5) + 5)) * (i + 1);
			}
		    }

		    mob_stats [3] = 33; //STANDARD evasion LEGENDS
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [3] += 0.2;
			}
		    }

		    mob_stats [4] = 60 * level;  //LEGEND XP
		    break;
		}
	    case 39:
		{
		    mob_stats [0] = (int) (Math.random () * (10) + 27); //Regular HP LEGENDARIES
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [0] += ((int) (Math.random () * (2) + 9)) * (i + 1);
			}
		    }

		    mob_stats [1] = (int) (Math.random () * (2) + 5); //LOWERED DEF LEGEND
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [1] += ((int) (Math.random () * (4) + 2)) * (i + 1);
			}
		    }

		    mob_stats [2] = (int) (Math.random () * (5) + 12);    //STANDARD STRENGTH LEGENDARIES
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [2] += ((int) (Math.random () * (5) + 6)) * (i + 1);
			}
		    }

		    mob_stats [3] = 33; //STANDARD evasion LEGENDS
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [3] += 0.2;
			}
		    }

		    mob_stats [4] = 60 * level;  //LEGEND XP
		    break;
		}

	    case 40:
		{
		    mob_stats [0] = (int) (Math.random () * (10) + 25); //LOW HP LEGEND
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [0] += ((int) (Math.random () * (2) + 8)) * (i + 1);
			}
		    }

		    mob_stats [1] = (int) (Math.random () * (2) + 7); //STANDARD DEF LEGEND
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [1] += ((int) (Math.random () * (4) + 5)) * (i + 1);
			}
		    }

		    mob_stats [2] = (int) (Math.random () * (5) + 12);    //STANDARD STRENGTH LEGENDARIES
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [2] += ((int) (Math.random () * (5) + 6)) * (i + 1);
			}
		    }

		    mob_stats [3] = 33; //STANDARD evasion LEGENDS
		    if (level != 1)
		    {
			for (int i = 1 ; i <= level - 1 ; i++)
			{
			    mob_stats [3] += 0.2;
			}
		    }

		    mob_stats [4] = 60 * level;  //LEGEND XP
		    break;
		}

	    case 42:
		{
		    mob_stats [0] = 1;
		    mob_stats [1] = 1;
		    mob_stats [2] = 1; //Used for if bugs come out, will not happen
		    mob_stats [3] = 100;
		    mob_stats [4] = 1000;
		}


	}
	return (mob_stats);
    }



    public static String set_mob_name (int mob_number)   //Uses if structures to determine the name based on a number generated in main
    {
	/////////////////////////COMMONS////////////////////////////////////////
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


