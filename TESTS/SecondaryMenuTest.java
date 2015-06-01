// The "SecondaryMenuTest" class.
import java.awt.*;
import hsa.Console;

public class SecondaryMenuTest
{
    static Console c;           // The output console                       //BATTLE, INVENTORY, STATS, HOW TO PLAY, SAVE, CHEATS
    
    public static void main (String[] args)
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
	    
	}while (char_pressed != '\n');
	c.clear ();
	
    } // main method
    
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
