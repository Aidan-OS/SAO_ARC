// The "HRDRDRD" class.
import java.awt.*;
import hsa.Console;

public class HRDRDRD
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	char item_select_location;
	int location = 0;
	draw_selected_box_2 (230, 220);
	draw_box_2 (230, 350);
	
	c.setColor (Color.black);
	Font title_screen = new Font ("Bauhaus 93", Font.ITALIC, 40);
	c.setFont (title_screen);
	
	c.drawString ("Yes", 305, 285);
	c.drawString ("No", 310, 415);
	
	
		    do
		    {
			item_select_location = c.getChar ();
			
			if (location == 0)
			{
			    if (item_select_location == 'w' || item_select_location == 's')
			    {
				draw_box_2 (230, 220);
				draw_selected_box_2 (230, 350);
				location = 1;
				
			    }
			}
			
			else if (location == 1)
			{
			    if (item_select_location == 'w' || item_select_location == 's')
			    {
				draw_selected_box_2 (230, 220);
				draw_box_2 (230, 350);
				location = 0;
			    }
			}
			c.drawString ("Yes", 305, 285);
			c.drawString ("No", 310, 415);
			
		    }while (item_select_location != '\n');
	
		    c.drawString ("Item added to inventory!", 100, 100);
	
    } // main method
    
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
} // HRDRDRD class
