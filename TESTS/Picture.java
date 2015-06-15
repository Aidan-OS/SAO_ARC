// The "PictureImportingPoop" class.
import java.awt.*;
import hsa.Console;
import java.awt.image.*;

public class Picture implements ImageObserver
{
    static Console c;           // The output console
    public Image Kirito;
    public Image Kobold;
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	new Picture ();
	
    } // main method
    
    public Picture ()
    {
	Toolkit tk = Toolkit.getDefaultToolkit ();
	Kirito = tk.getImage ("Kirito Sprite.png");
	Kobold = tk.getImage ("Kobold Lord.png");
	
	tk.prepareImage (Kirito, -1, -1, this);
	tk.prepareImage (Kobold, -1, -1, this);
    }
    
    public boolean imageUpdate (Image img, int infoflags, int x, int y, int width, int height)
    {
	c.drawImage (Kirito, 50, 150, null);
	c.drawImage (Kobold, 390, 0, null);
	
	return true;
    }
    
} // PictureImportingPoop class
