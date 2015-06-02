// The "SecondaryMenuTest" class.
import java.awt.*;
import hsa.Console;

public class SecondaryMenuTest
{
    static Console c;           // The output console                       //BATTLE, INVENTORY, STATS, HOW TO PLAY, SAVE, CHEATS
    static String player_name = "Leone Shamoth";
    static boolean exit = false;
    
    public static void main (String[] args) /////////////////////////////////////PUT THIS METHOD INTO A LOOP          HAVE A GLOBAL VARIABLE TO CONTROL EXIT
    {
	c = new Console ();
	
	int box_at = 0;
	char char_pressed;                                               //    00000   33333
									 //    11111   44444
									 //    22222   55555
	Color light_blue = new Color (0, 191, 255);
	c.setColor (light_blue);                  //Generates and sets Background Color
	c.fillRect (0, 0, 640, 500);
				 
	draw_selected_box_2 (50, 150);  //0
	draw_box_2 (50, 270);//1
	draw_box_2 (50, 390);//2
	draw_box_2 (370, 150);//3
	draw_box_2 (370, 270);//4
	draw_box_2 (370, 390);//5
	
	Font big_letters = new Font ("MingLiU",Font.PLAIN, 50);
	c.setFont (big_letters);
	c.drawString ("Sword Art Online ARC", 60, 100);
	
	Font small_letters = new Font ("MingLiU",Font.PLAIN, 15);
	c.setFont (small_letters);
	c.drawString ("Use 'w', 's', 'a', and 'd', to navigate. Press enter to select, ESC to quit.", 55, 130);
	
	c.setColor (Color.black);
	Font title_screen = new Font ("Bauhaus 93", Font.ITALIC, 40);
	c.setFont (title_screen);
	
	c.drawString ("Battle", 100, 215);//0
	c.drawString ("Stats", 115, 335);//1
	c.drawString ("Cheats", 95, 450);//2
	c.drawString ("Inventory", 395, 215);//3
	c.drawString ("Rules", 430, 335);//4
	c.drawString ("Save", 440, 450);//5
									 
	do
	{
	    char_pressed = c.getChar ();
	    
	    if (char_pressed == 'w')
	    {
		switch (box_at)
		{
		case 0:{
			box_at = 2;
			draw_selected_box_2 (50, 390);//2
			draw_box_2 (50, 150);//0
			c.drawString ("Battle", 100, 215);//0
			c.drawString ("Cheats", 95, 450);//2
			break;
		       }
		
		case 1:{
			box_at = 0;
			draw_selected_box_2 (50, 150);//0
			draw_box_2 (50, 270);//1
			c.drawString ("Battle", 100, 215);//0
			c.drawString ("Stats", 115, 335);//1
			break;
		       }
		
		case 2:{
			box_at = 1;
			draw_selected_box_2 (50, 270);//1
			draw_box_2 (50, 390);//2
			c.drawString ("Stats", 115, 335);//1
			c.drawString ("Cheats", 95, 450);//2
			break;
		       }
		       
		case 3:{
			box_at = 5;
			draw_selected_box_2 (370, 390);//5
			draw_box_2 (370, 150);//3
			c.drawString ("Inventory", 395, 215);//3
			c.drawString ("Save", 440, 450);//5
			break;
		       }
		       
		case 4:{
			box_at = 3;
			draw_selected_box_2 (370, 150);//3
			draw_box_2 (370, 270);//4
			c.drawString ("Inventory", 395, 215);//3
			c.drawString ("Rules", 430, 335);//4
			break;
		       }
		   
		case 5:{
			box_at = 4;
			draw_selected_box_2 (370, 270);//4
			draw_box_2 (370, 390);//5
			c.drawString ("Rules", 430, 335);//4
			c.drawString ("Save", 440, 450);//5
			break;
		       }
		}
	    }          
	    
	    else if (char_pressed == 's')
	    {
		switch (box_at)
		{
		case 0:{
			box_at = 1;
			draw_selected_box_2 (50, 270);//1
			draw_box_2 (50, 150);//0
			c.drawString ("Battle", 100, 215);//0
			c.drawString ("Stats", 115, 335);//1
			break;
		       }
		
		case 1:{
			box_at = 2;
			draw_selected_box_2 (50, 390);//2
			draw_box_2 (50, 270);//1
			c.drawString ("Stats", 115, 335);//1
			c.drawString ("Cheats", 95, 450);//2
			break;
		       }
		
		case 2:{
			box_at = 0;
			draw_selected_box_2 (50, 150);//0
			draw_box_2 (50, 390);//2
			c.drawString ("Battle", 100, 215);//0
			c.drawString ("Cheats", 95, 450);//2
			break;
		       }
		       
		case 3:{
			box_at = 4;
			draw_selected_box_2 (370, 270);//4
			draw_box_2 (370, 150);//3
			c.drawString ("Inventory", 395, 215);//3
			c.drawString ("Rules", 430, 335);//4
			break;
		       }
		       
		case 4:{
			box_at = 5;
			draw_selected_box_2 (370, 390);//5
			draw_box_2 (370, 270);//4
			c.drawString ("Rules", 430, 335);//4
			c.drawString ("Save", 440, 450);//5
			break;
		       }
		   
		case 5:{
			box_at = 3;
			draw_selected_box_2 (370, 150);//3
			draw_box_2 (370, 390);//5 
			c.drawString ("Inventory", 395, 215);//3
			c.drawString ("Save", 440, 450);//5
			break;
		       }
		} 

	    }
	    
	    else if (char_pressed == 'a')
	    {
		switch (box_at)
		{
		case 0:{
			box_at = 3;
			draw_selected_box_2 (370, 150);//3
			draw_box_2 (50, 150);//0
			c.drawString ("Battle", 100, 215);//0
			c.drawString ("Inventory", 395, 215);//3
			break;
		       }
		
		case 1:{
			box_at = 4;
			draw_selected_box_2 (370, 270);//4
			draw_box_2 (50, 270);//1
			c.drawString ("Stats", 115, 335);//1
			c.drawString ("Rules", 430, 335);//4
			break;
		       }
		
		case 2:{
			box_at = 5;
			draw_selected_box_2 (370, 390);//5
			draw_box_2 (50, 390);//2
			c.drawString ("Cheats", 95, 450);//2
			c.drawString ("Save", 440, 450);//5
			break;
		       }
		       
		case 3:{
			box_at = 0;
			draw_selected_box_2 (50, 150);//0
			draw_box_2 (370, 150);//3
			c.drawString ("Battle", 100, 215);//0
			c.drawString ("Inventory", 395, 215);//3
			break;
		       }
		       
		case 4:{
			box_at = 1;
			draw_selected_box_2 (50, 270);//1
			draw_box_2 (370, 270);//4
			c.drawString ("Stats", 115, 335);//1
			c.drawString ("Rules", 430, 335);//4
			break;
		       }
		   
		case 5:{
			box_at = 2;
			draw_selected_box_2 (50, 390);//2
			draw_box_2 (370, 390);//5 
			c.drawString ("Cheats", 95, 450);//2
			c.drawString ("Save", 440, 450);//5
			break;
		       }
		}
	    }
	    
	    else if (char_pressed == 'd')
	    {
		switch (box_at)
		{
		case 0:{
			box_at = 3;
			draw_selected_box_2 (370, 150);//3
			draw_box_2 (50, 150);//0
			c.drawString ("Battle", 100, 215);//0
			c.drawString ("Inventory", 395, 215);//3
			break;
		       }
		
		case 1:{
			box_at = 4;
			draw_selected_box_2 (370, 270);//4
			draw_box_2 (50, 270);//1
			c.drawString ("Stats", 115, 335);//1
			c.drawString ("Rules", 430, 335);//4
			break;
		       }
		
		case 2:{
			box_at = 5;
			draw_selected_box_2 (370, 390);//5
			draw_box_2 (50, 390);//2
			c.drawString ("Cheats", 95, 450);//2
			c.drawString ("Save", 440, 450);//5
			break;
		       }
		       
		case 3:{
			box_at = 0;
			draw_selected_box_2 (50, 150);//0
			draw_box_2 (370, 150);//3
			c.drawString ("Battle", 100, 215);//0
			c.drawString ("Inventory", 395, 215);//3
			break;
		       }
		       
		case 4:{
			box_at = 1;
			draw_selected_box_2 (50, 270);//1
			draw_box_2 (370, 270);//4
			c.drawString ("Stats", 115, 335);//1
			c.drawString ("Rules", 430, 335);//4
			break;
		       }
		   
		case 5:{
			box_at = 2;
			draw_selected_box_2 (50, 390);//2
			draw_box_2 (370, 390);//5 
			c.drawString ("Cheats", 95, 450);//2
			c.drawString ("Save", 440, 450);//5
			break;
		       }
		}
	    }
	    
	    else if ( (int) key_pressed == 27)
	    {
		exit = true;
		box_at = 42;
	    }
	    
	}while (char_pressed != '\n');
	c.clear ();
	
	switch (box_at)
	{
	    case 0:{//c.drawString ("Battle", 100, 215);//0
		    //init_fight;
		    break;
		   }
		   
	    case 1:{//c.drawString ("Stats", 115, 335);//1
		    //look_at_stats;
		    break;
		   } 
		   
	    case 2:{//c.drawString ("Cheats", 95, 450);//2
		    //cheat_page;
		    break;
		   }  
		   
	    case 3:{//c.drawString ("Inventory", 395, 215);//3
		    //inventory;
		    break;
		   }
		
	    case 4:{//c.drawString ("Rules", 430, 335);//4 
		    rules ();
		    break;
		   }
		   
	    case 5:{//c.drawString ("Save", 440, 450);//5
		    //save_game;
		    break;
		   }
	}//Switch             

    } // main method
    
    public static void rules ()
    {   
	Color light_blue = new Color (0, 191, 255);
	c.setColor (light_blue);                  //Generates and sets Background Color
	c.fillRect (0, 0, 640, 500);
	c.setColor (Color.black);
	
	Font rules = new Font ("MingLiU",Font.PLAIN, 18);
	c.setFont (rules);
	c.drawString ("Back for another rule briefing " + player_name + "?", 1, 20);
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
	c.drawString ("Press any key to return.", 1, 380);
	c.getChar ();
	c.clear ();
    }
    
    public static void draw_box_2 (int x, int y)
    {
	c.setColor (Color.black);
	c.drawRect ( (x - 1), (y - 1), 221, 101);
	c.setColor (Color.gray);
	c.fillRect (x, y, 220, 100);
	c.setColor (Color.black);
    }
    
    public static void draw_selected_box_2 (int x, int y)
    {
	c.setColor (Color.black);
	c.drawRect ( (x - 1), (y - 1), 221, 101);
	c.setColor (Color.lightGray);
	c.fillRect (x, y, 220, 100);
	c.setColor (Color.gray);
	c.fillRect ( (x + 10), (y + 10), 200, 80);
	c.setColor (Color.black);
    }
    
    public static void delay (int x)
    {
	try
	{
	    Thread.currentThread ().sleep (x);
	}
	
	catch (Exception e)
	{
	}
    }
    
} // SecondaryMenuTest class
