// The "BattleBoxes" class.
import java.awt.*;
import hsa.Console;

public class BattleBoxes
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	char key_pressed;
	int box_at = 0;
	
	Font selection_text = new Font ("MingLiU", Font.PLAIN, 18);
	c.setFont (selection_text);
	
	c.drawString ("Slash    Stab", 20, 390);
	c.drawString ("Parry    Block    Flee", 20, 415);
	
	c.setCursor (22, 1);
	
	draw_battle_boxes (14, 372);//Slash
	//draw_battle_boxes (90, 372);//Stab
	//draw_battle_boxes (14, 399);//Parry
	//draw_battle_boxes (93, 399);//Block
	//draw_battle_boxes (170, 399);//Flee
	
	do
	{
	    key_pressed = c.getChar ();
	    switch (box_at)
	    {
		case 0:{
			switch (key_pressed)
			{
			    case 'w':{
			    //Nothing happens
			    break;
			    }
			    case 's':{
			    draw_battle_boxes (14, 399);//Parry
			    clear_battle_boxes (14, 372);//Slash
			    box_at = 2;
			    break;
			    }
			    case 'a':{
			    //nothing happens
			    break;
			    }
			    case 'd':{
			    draw_battle_boxes (90, 372);//Stab
			    clear_battle_boxes (14, 372);//Slash
			    box_at = 1;
			    break;
			    }
			}//interior switch
			break;
		}//exterior case
		case 1:{
			switch (key_pressed)
			{
			    case 'w':{
			    //Nothing happens
			    break;
			    }
			    case 's':{
			    draw_battle_boxes (93, 399);//Block
			    clear_battle_boxes (90, 372);//Stab
			    box_at = 3;
			    break;
			    }
			    case 'a':{
			    draw_battle_boxes (14, 372);//Slash
			    clear_battle_boxes (90, 372);//Stab
			    box_at = 0;
			    break;
			    }
			    case 'd':{
			    //Nothing happens
			    break;
			    }
			}//interior switch
			break;
		}//exterior case
		case 2:{
			switch (key_pressed)
			{
			    case 'w':{
			    draw_battle_boxes (14, 372);//Slash
			    clear_battle_boxes (14, 399);//Parry
			    box_at = 0;
			    break;
			    }
			    case 's':{
			    //Nothing happens
			    break;
			    }
			    case 'a':{
			    //Nothing happens
			    break;
			    }
			    case 'd':{
			    draw_battle_boxes (93, 399);//Block
			    clear_battle_boxes (14, 399);//Parry
			    box_at = 3;
			    break;
			    }
			}//interior switch
			break;
		}//exterior case
		case 3:{
			switch (key_pressed)
			{
			    case 'w':{
			    draw_battle_boxes (90, 372);//Stab
			    clear_battle_boxes (93, 399);//Block
			    box_at = 1;
			    break;
			    }
			    case 's':{
			    //Nothing happens
			    break;
			    }
			    case 'a':{
			    draw_battle_boxes (14, 399);//Parry
			    clear_battle_boxes (93, 399);//Block
			    box_at = 2;
			    break;
			    }
			    case 'd':{
			    draw_battle_boxes (170, 399);//Flee
			    clear_battle_boxes (93, 399);//Block
			    box_at = 4;
			    break;
			    }
			}//interior switch
			break;
		}//exterior case
		case 4:{
			switch (key_pressed)
			{
			    case 'w':{
			    //Nothing happens
			    break;
			    }
			    case 's':{
			    //Nothing happens
			    break;
			    }
			    case 'a':{
			    draw_battle_boxes (93, 399);//Block
			    clear_battle_boxes (170, 399);//Flee
			    box_at = 3;
			    break;
			    }
			    case 'd':{
			    //Nothing happens
			    break;
			    }
			}//interior switch
			break;
		}//exterior case
	    }
	}while (key_pressed != '\n');
	
	
	
    } // main method
    
    public static void draw_battle_boxes (int x, int y)
    {
	c.setColor (Color.black);
	c.drawRect (x, y, 60, 25);
    }
    
    public static void clear_battle_boxes (int x, int y)
    {
	Color light_blue = new Color (0, 191, 255);
	c.setColor (light_blue);
	c.drawRect (x, y, 60, 25);
	c.setColor (Color.black);
    }
} // BattleBoxes class
