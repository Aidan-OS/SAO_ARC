// The "MainMenuTest" class.
import java.awt.*;
import hsa.Console;
import java.io.*;
import hsa.*;

public class MainMenuTest
{
    static Console c;           // The output console
    static int strength; //ALL STATS UNDERNEATH BEFORE MAIN ARE CONSTANTLY USED, AND CHANGED, MADE STATIC SO THAT I DONT NEED TO CONSTANTLY PASS THEM
    static int defence;
    static int health;
    static double evasion = 30;
    static int level = 1;
    static int xp = 0;
    static int xp_to_next_level = 100;
    static String player_name;
    
    public static void main (String[] args) throws IOException
    {
	c = new Console ();
	
	char key_pressed;
	int title_screen_selected = 0;
	
	Color light_blue = new Color (0, 191, 255);
	c.setColor (light_blue);
	c.fillRect (0, 0, 640, 500);

	draw_selected_box (225, 100);
	draw_box (225, 250);
	
	Font title_screen = new Font ("Bauhaus 93", Font.ITALIC, 40);
	c.setFont (title_screen);
	c.drawString ("New Game", 250, 162);
	c.drawString ("Load Game", 250, 315);
	
	do
	{
	    key_pressed = c.getChar ();
	    
	    if (key_pressed == 'w')
	    {
		draw_box (225, 250);
		draw_selected_box (225, 100);
		title_screen_selected = 0;
	    }
	    
	    else if (key_pressed == 's')
	    {
		draw_box (225, 100);
		draw_selected_box (225, 250);
		title_screen_selected = 1;
	    }
	    
	    c.drawString ("New Game", 250, 162);
	    c.drawString ("Load Game", 250, 315);
	}while (key_pressed != '\n');
	
	c.clear ();
	
	if (title_screen_selected == 0)
	{
	    create_new_user ();
	}
	
	else if (title_screen_selected == 1)
	{
	    load_user ();
	}
      
    } // main method
    
    public static void draw_box (int x, int y)
    {
	c.setColor (Color.black);
	c.drawRect ( (x - 1), (y - 1), 251, 101);
	c.setColor (Color.gray);
	c.fillRect (x, y, 250, 100);
	c.setColor (Color.black);
    }
    
    public static void draw_selected_box (int x, int y)
    {
	c.setColor (Color.black);
	c.drawRect ( (x - 1), (y - 1), 251, 101);
	c.setColor (Color.lightGray);
	c.fillRect (x, y, 250, 100);
	c.setColor (Color.gray);
	c.fillRect ( (x + 10), (y + 10), 230, 80);
	c.setColor (Color.black);
    }
    
    public static void load_user () throws IOException
    {
    
	String name_on_list;
	String saved_password;
	String input_password;
	
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
		
		name_on_list = read_name_list.readLine ();//Gets new word on list
	    }
	    
	    if (name_on_list == null)
	    {
		c.clear ();
		c.setCursor (7,26);
		c.setTextColor (Color.red);
		c.println ("That username is not in use");
		c.setTextColor (Color.black);
	    }    
	    
	    else 
	    {
		read_name_list.close ();
		break;
	    }
	}//INFINTE WHILE
	
	TextInputFile player_save_data = new TextInputFile (player_name + ".txt");
	saved_password = player_save_data.readString ();
	
	while (1 == 1)
	{
	    c.drawString ("Enter your password", 150, 300);
	    c.setCursor (17, 35);
	    input_password = c.readString ();
	    
	    if (! (input_password.equals (saved_password) ) )
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
	    
	}//END INFINITE WHILE 2
	
	strength = player_save_data.readInt ();
	defence = player_save_data.readInt ();
	health = player_save_data.readInt ();
	evasion = player_save_data.readDouble ();
	level = player_save_data.readInt ();
	xp = player_save_data.readInt ();
	xp_to_next_level = player_save_data.readInt ();
	
	player_save_data.close ();
	
    }
    
    public static void create_new_user () throws IOException
    {
	boolean name_taken = false;
	String name_on_list;
	String temp_pass_store;
	
	Color light_blue = new Color (0, 191, 255);
	c.setColor (light_blue);
	c.fillRect (0, 0, 640, 500);
	c.setTextBackgroundColor (light_blue);
	
	c.setColor (Color.black);
	Font title_screen = new Font ("Bauhaus 93", Font.ITALIC, 30);
	c.setFont (title_screen);
	
	PrintWriter input_name_list = new PrintWriter (new FileWriter ("name_list.txt", true) ); //Starts writing at the end
	
	while (1 == 1)
	{
	    BufferedReader read_name_list = new BufferedReader (new FileReader ("name_list.txt")); //Opens the file in a way that can read Null
	    
	    c.drawString ("Please enter a character name", 100, 100);  //Enters username
	    c.setCursor (8,37);
	    player_name = c.readLine ();
	
	    name_on_list = read_name_list.readLine (); //takes the first name on the list

	    while (name_on_list != null) //Checks if there is nothing let to read
	    {
		if (name_on_list.equals (player_name)) //Checks if the name in the file is the same as the one entered
		{
		    break;
		}
		
		name_on_list = read_name_list.readLine ();//Gets new word on list
	    }
	
	    if (name_on_list != null) //If the name is taken, the name on the list will not be null
	    {
		c.clear ();
		c.setCursor (7,28);
		c.setTextColor (Color.red);
		c.println ("That username is taken");
		c.setTextColor (Color.black);

		
	    }
	    
	    else
	    {
		input_name_list.println (player_name);
		read_name_list.close ();
		break;    
	    }
	    read_name_list.close ();   
	}
	
	c.drawString ("Please enter your password", 120, 300);
	PrintWriter input_save_data = new PrintWriter (new FileWriter (player_name + ".txt") );
	c.setCursor (17, 35);
	temp_pass_store = c.readString ();
	input_save_data.println (temp_pass_store);
	temp_pass_store = "";
	
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
    }
    
} // MainMenuTest class
