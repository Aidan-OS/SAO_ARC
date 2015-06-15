// The "LOOLLLLL" class.
import java.awt.*;
import hsa.Console;

public class LOOLLLLL
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	draw_kirito (0, 13);
	draw_enemy (70, 0);
    } // main method
    
    public static Color enemy_color;
    
    public static void draw_enemy (int x, int y)
    {
	Color hair = new Color (229, 196, 18);
	
	Color skin = new Color (220, 183, 138);
	
	Color brown = new Color (76, 42, 27);
	
	Color eyes = new Color (22, 18, 78);
	
	Color boots = new Color (171, 29, 7);
	
	Color hat = new Color (4, 156, 44);
	
	Color dark_green = new Color (2, 87, 24);
	
	enemy_color = Color.black;
	
	//HAT LEFT BLACK
	four4 ( (x + 7), y);
	four4 ( (x + 6), (y + 1) );
	four4 ( (x + 5), (y + 2) );
	four4 ( (x + 4), (y + 3) );
	four4 ( (x + 4), (y + 4) );
	four4 ( (x + 3), (y + 5) );
	
	//HAT RIGHT BLACK
	four4 ( (x + 12), y);
	four4 ( (x + 13), (y + 1) );
	four4 ( (x + 14), (y + 2) );
	four4 ( (x + 15), (y + 3) );
	four4 ( (x + 15), (y + 4) );
	four4 ( (x + 16), (y + 5) );
	//HAT
	//ROW 1
	enemy_color = hat;
	four4 ( (x + 8), y);
	four4 ( (x + 9), y);
	four4 ( (x + 10), y);
	four4 ( (x + 11), y);
	//ROW 2
	four4 ( (x + 7), (y + 1) );
	four4 ( (x + 8), (y + 1) );
	four4 ( (x + 9), (y + 1) );
	four4 ( (x + 10), (y + 1) );
	four4 ( (x + 11), (y + 1) );
	four4 ( (x + 12), (y + 1) );
	//ROW 3
	four4 ( (x + 6), (y + 2) );
	four4 ( (x + 7), (y + 2) );
	four4 ( (x + 8), (y + 2) );
	four4 ( (x + 9), (y + 2) );
	four4 ( (x + 10), (y + 2) );
	four4 ( (x + 11), (y + 2) );
	four4 ( (x + 12), (y + 2) );
	four4 ( (x + 13), (y + 2) );
	//ROW 4
	four4 ( (x + 5), (y + 3) );
	four4 ( (x + 6), (y + 3) );
	four4 ( (x + 7), (y + 3) );
	four4 ( (x + 8), (y + 3) );
	four4 ( (x + 9), (y + 3) );
	four4 ( (x + 10), (y + 3) );
	four4 ( (x + 11), (y + 3) );
	four4 ( (x + 12), (y + 3) );
	four4 ( (x + 13), (y + 3) );
	four4 ( (x + 14), (y + 3) );
	//ROW 5
	four4 ( (x + 5), (y + 4) );
	four4 ( (x + 14), (y + 4) );
	//ROW 6
	four4 ( (x + 4), (y + 5) );
	four4 ( (x + 15), (y + 5) );
	
	//BROWN
	enemy_color = brown;
	//ROW 1
	four4 ( (x + 6), (y + 4) );
	four4 ( (x + 13), (y + 4) );
	//ROW 2
	four4 ( (x + 5), (y + 5) );
	four4 ( (x + 14), (y + 5) );
	//Row 3
	four4 ( (x + 1), (y + 6) );
	four4 ( (x + 3), (y + 6) );
	four4 ( (x + 4), (y + 6) );
	four4 ( (x + 12), (y + 6) );
	four4 ( (x + 15), (y + 6) );
	four4 ( (x + 16), (y + 6) );
	four4 ( (x + 18), (y + 6) );
	//ROW 4
	four4 ( (x + 1), (y + 7) );
	four4 ( (x + 4), (y + 7) );
	four4 ( (x + 6), (y + 7) );
	four4 ( (x + 11), (y + 7) );
	four4 ( (x + 13), (y + 7) );
	four4 ( (x + 15), (y + 7) );
	four4 ( (x + 18), (y + 7) );
	//ROW 5
	four4 ( (x + 2), (y + 8) );
	four4 ( (x + 4), (y + 8) );
	four4 ( (x + 5), (y + 8) );
	four4 ( (x + 10), (y + 8) );
	four4 ( (x + 13), (y + 8) );
	four4 ( (x + 15), (y + 8) );
	four4 ( (x + 17), (y + 8) );
	//ROW 6
	four4 ( (x + 3), (y + 9) );
	four4 ( (x + 5), (y + 9) );
	four4 ( (x + 8), (y + 9) );
	four4 ( (x + 9), (y + 9) );
	four4 ( (x + 14), (y + 9) );
	four4 ( (x + 16), (y + 9) );
	//ROW 7
	four4 ( (x + 5), (y + 10) );
	four4 ( (x + 7), (y + 10) );
	four4 ( (x + 8), (y + 10) );
	four4 ( (x + 12), (y + 10) );
	four4 ( (x + 14), (y + 10) );
	//ROW 8
	four4 ( (x + 5), (y + 11) );
	four4 ( (x + 8), (y + 11) );
	four4 ( (x + 11), (y + 11) );
	four4 ( (x + 14), (y + 11) );
	//ROW 9
	four4 ( (x + 6), (y + 13) );
	four4 ( (x + 13), (y + 13) );
	//ROW 10
	four4 ( (x + 6), (y + 14) );
	four4 ( (x + 7), (y + 14) );
	four4 ( (x + 12), (y + 14) );
	four4 ( (x + 13), (y + 14) );
	//ROW 11
	four4 ( (x + 6), (y + 16) );
	four4 ( (x + 13), (y + 16) );
	//ROW 12
	four4 ( (x + 7), (y + 17) );
	four4 ( (x + 8), (y + 17) );
	four4 ( (x + 11), (y + 17) );
	four4 ( (x + 12), (y + 17) );
	//ROW 13
	four4 ( (x + 6), (y + 20) );
	four4 ( (x + 13), (y + 20) );
	//ROW 14
	four4 ( (x + 7), (y + 21) );
	four4 ( (x + 12), (y + 21) );
	
	//HAIR
	enemy_color = hair;
	//ROW 1
	four4 ( (x + 7), (y + 4) );
	four4 ( (x + 8), (y + 4) );
	four4 ( (x + 9), (y + 4) );
	four4 ( (x + 10), (y + 4) );
	four4 ( (x + 11), (y + 4) );
	four4 ( (x + 12), (y + 4) );
	
	//ROW 2
	four4 ( (x + 6), (y + 5) );
	four4 ( (x + 7), (y + 5) );
	four4 ( (x + 8), (y + 5) );
	four4 ( (x + 9), (y + 5) );
	four4 ( (x + 10), (y + 5) );
	four4 ( (x + 11), (y + 5) );
	four4 ( (x + 12), (y + 5) );
	four4 ( (x + 13), (y + 5) );
	
	//ROW 3
	four4 ( (x + 5), (y + 6) );
	four4 ( (x + 6), (y + 6) );
	four4 ( (x + 7), (y + 6) );
	four4 ( (x + 8), (y + 6) );
	four4 ( (x + 9), (y + 6) );
	four4 ( (x + 10), (y + 6) );
	four4 ( (x + 11), (y + 6) );
	four4 ( (x + 13), (y + 6) );
	four4 ( (x + 14), (y + 6) );
	
	//ROW 5
	four4 ( (x + 5), (y + 7) );
	four4 ( (x + 7), (y + 7) );
	four4 ( (x + 8), (y + 7) );
	four4 ( (x + 9), (y + 7) );
	four4 ( (x + 10), (y + 7) );
	four4 ( (x + 14), (y + 7) );
	
	//ROW 5
	four4 ( (x + 6), (y + 8) );
	four4 ( (x + 7), (y + 8) );
	four4 ( (x + 8), (y + 8) );
	four4 ( (x + 9), (y + 8) );
	four4 ( (x + 14), (y + 8) );
	
	//ROW 6
	four4 ( (x + 4), (y + 9) );
	four4 ( (x + 6), (y + 9) );
	four4 ( (x + 7), (y + 9) );
	four4 ( (x + 15), (y + 9) );
	//ROW 7
	four4 ( (x + 4), (y + 10) );
	four4 ( (x + 15), (y + 10) );
	//ROW 8
	four4 ( (x + 4), (y + 11) );
	four4 ( (x + 15), (y + 11) );
	//ROW 9
	four4 ( (x + 9), (y + 17) );
	four4 ( (x + 10), (y + 17) );
	//ROW 10
	four4 ( (x + 9), (y + 18) );
	four4 ( (x + 10), (y + 18) );
	
	//SKIN
	enemy_color = skin;
	//ROW 1
	four4 ( (x + 2), (y + 6) );
	four4 ( (x + 17), (y + 6) );
	//ROw 2
	four4 ( (x + 2), (y + 7) );
	four4 ( (x + 3), (y + 7) );
	four4 ( (x + 12), (y + 7) );
	four4 ( (x + 17), (y + 7) );
	four4 ( (x + 16), (y + 7) );
	//ROW 3
	four4 ( (x + 3), (y + 8) );
	four4 ( (x + 11), (y + 8) );
	four4 ( (x + 12), (y + 8) );
	four4 ( (x + 16), (y + 8) );
	//ROW 4
	four4 ( (x + 10), (y + 9) );
	four4 ( (x + 11), (y + 9) );
	four4 ( (x + 12), (y + 9) );
	four4 ( (x + 13), (y + 9) );
	//ROW 5
	four4 ( (x + 9), (y + 10) );
	four4 ( (x + 10), (y + 10) );
	four4 ( (x + 11), (y + 10) );
	//ROW 6
	four4 ( (x + 9), (y + 11) );
	four4 ( (x + 10), (y + 11) );
	//ROW 7
	four4 ( (x + 6), (y + 12) );
	four4 ( (x + 9), (y + 12) );
	four4 ( (x + 10), (y + 12) );
	four4 ( (x + 13), (y + 12) );
	//ROW 8
	four4 ( (x + 7), (y + 13) );
	four4 ( (x + 8), (y + 13) );
	four4 ( (x + 9), (y + 13) );
	four4 ( (x + 10), (y + 13) );
	four4 ( (x + 11), (y + 13) );
	four4 ( (x + 12), (y + 13) );
	//ROW 9
	four4 ( (x + 8), (y + 14) );
	four4 ( (x + 9), (y + 14) );
	four4 ( (x + 10), (y + 14) );
	four4 ( (x + 11), (y + 14) );
	//ROW 9
	four4 ( (x + 3), (y + 16) );
	four4 ( (x + 4), (y + 16) );
	four4 ( (x + 15), (y + 16) );
	four4 ( (x + 16), (y + 16) );
	//ROW 10
	four4 ( (x + 3), (y + 17) );
	four4 ( (x + 4), (y + 17) );
	four4 ( (x + 15), (y + 17) );
	four4 ( (x + 16), (y + 17) );
	
	//LOWER BLACK
	enemy_color = Color.black;
	//ROW 1
	four4 ( (x + 3), (y + 10) );
	four4 ( (x + 6), (y + 10) );
	four4 ( (x + 13), (y + 10) );
	four4 ( (x + 16), (y + 10) );
	//ROW 2
	four4 ( (x + 3), (y + 11) );
	four4 ( (x + 16), (y + 11) );
	//ROW 3
	four4 ( (x + 4), (y + 12) );
	four4 ( (x + 5), (y + 12) );
	four4 ( (x + 14), (y + 12) );
	four4 ( (x + 15), (y + 12) );
	//ROW 4
	four4 ( (x + 5), (y + 13) );
	four4 ( (x + 14), (y + 13) );
	//ROW 5
	four4 ( (x + 4), (y + 14) );
	four4 ( (x + 15), (y + 14) );
	//ROW 6
	four4 ( (x + 3), (y + 15) );
	four4 ( (x + 16), (y + 15) );
	//ROW 7
	four4 ( (x + 2), (y + 16) );
	four4 ( (x + 5), (y + 16) );
	four4 ( (x + 14), (y + 16) );
	four4 ( (x + 17), (y + 16) );
	//ROW 8
	four4 ( (x + 2), (y + 17) );
	four4 ( (x + 17), (y + 17) );
	//ROW 9
	four4 ( (x + 3), (y + 18) );
	four4 ( (x + 4), (y + 18) );
	four4 ( (x + 5), (y + 18) );
	four4 ( (x + 14), (y + 18) );
	four4 ( (x + 15), (y + 18) );
	four4 ( (x + 16), (y + 18) );
	//ROW 10
	four4 ( (x + 5), (y + 19) );
	four4 ( (x + 6), (y + 19) );
	four4 ( (x + 14), (y + 19) );
	four4 ( (x + 13), (y + 19) );
	//ROW 12
	four4 ( (x + 4), (y + 20) );
	four4 ( (x + 7), (y + 20) );
	four4 ( (x + 8), (y + 20) );
	four4 ( (x + 9), (y + 20) );
	four4 ( (x + 10), (y + 20) );
	four4 ( (x + 11), (y + 20) );
	four4 ( (x + 12), (y + 20) );
	four4 ( (x + 15), (y + 20) );
	//ROW 13
	four4 ( (x + 4), (y + 21) );
	four4 ( (x + 8), (y + 21) );
	four4 ( (x + 11), (y + 21) );
	four4 ( (x + 15), (y + 21) );
	//ROW 14
	four4 ( (x + 5), (y + 22) );
	four4 ( (x + 6), (y + 22) );
	four4 ( (x + 7), (y + 22) );
	four4 ( (x + 12), (y + 22) );
	four4 ( (x + 13), (y + 22) );
	four4 ( (x + 14), (y + 22) );
	
	//EYES AND OTHER BLUE
	enemy_color = eyes;
	//ROW 1
	four4 ( (x + 7), (y + 11) );
	four4 ( (x + 12), (y + 11) );
	//ROW 2
	four4 ( (x + 7), (y + 12) );
	four4 ( (x + 12), (y + 12) );
	//ROW 4
	four4 ( (x + 6), (y + 15) );
	four4 ( (x + 13), (y + 15) );
	//ROW 5
	four4 ( (x + 5), (y + 17) );
	four4 ( (x + 14), (y + 17) );
	
	//TUNIC LIGHT
	enemy_color = hat;
	//ROW 1
	four4 ( (x + 5), (y + 14) );
	four4 ( (x + 14), (y + 14) );
	//ROW 2
	four4 ( (x + 4), (y + 15) );
	four4 ( (x + 5), (y + 15) );
	four4 ( (x + 14), (y + 15) );
	four4 ( (x + 15), (y + 15) );
	//ROW 3
	four4 ( (x + 6), (y + 17) );
	four4 ( (x + 13), (y + 17) );
	//ROW 4
	four4 ( (x + 6), (y + 18) );
	four4 ( (x + 7), (y + 18) );
	four4 ( (x + 12), (y + 18) );
	four4 ( (x + 13), (y + 18) );
	//ROW 5
	four4 ( (x + 8), (y + 19) );
	four4 ( (x + 9), (y + 19) );
	four4 ( (x + 10), (y + 19) );
	four4 ( (x + 11), (y + 19) );
	
	//DARK TUNIC
	enemy_color = dark_green;
	//ROW 1
	four4 ( (x + 7), (y + 15) );
	four4 ( (x + 8), (y + 15) );
	four4 ( (x + 9), (y + 15) );
	four4 ( (x + 10), (y + 15) );
	four4 ( (x + 11), (y + 15) );
	four4 ( (x + 12), (y + 15) );
	//ROW 2
	four4 ( (x + 7), (y + 16) );
	four4 ( (x + 8), (y + 16) );
	four4 ( (x + 9), (y + 16) );
	four4 ( (x + 10), (y + 16) );
	four4 ( (x + 11), (y + 16) );
	four4 ( (x + 12), (y + 16) );
	//ROW 3
	four4 ( (x + 8), (y + 18) );
	four4 ( (x + 11), (y + 18) );
	//ROW 4
	four4 ( (x + 7), (y + 19) );
	four4 ( (x + 12), (y + 19) );
	
	//BOOTS RED
	enemy_color = boots;
	//ROW 1
	four4 ( (x + 5), (y + 20) );
	four4 ( (x + 14), (y + 20) );
	//ROW 2
	four4 ( (x + 5), (y + 21) );
	four4 ( (x + 6), (y + 21) );
	four4 ( (x + 13), (y + 21) );
	four4 ( (x + 14), (y + 21) );
	
    }
    
    
    public static Color kirito_color;
    
    public static void draw_kirito (int x, int y)
    {
	Color skin = new Color (247, 218, 188);
	
	Color jacket_light = new Color (0, 82, 164);
	
	Color med_jacket = new Color (0, 50, 100);
	
	Color chest_piece = new Color (176, 176, 176);
	
	Color chest_outline = new Color (59, 59, 59);
	
	Color hair = new Color (37, 37, 46);
	
	Color sheath = new Color (80, 65, 52);
	
	Color sheath_outline = new Color (26, 20, 15);
	
	kirito_color = hair;
	
	three3 ( (x + 16), y);//ROW 1
	////////////////ROW 2//////////
	three3 ( (x + 11), (y + 1) );
	three3 ( (x + 12), (y + 1) );
	three3 ( (x + 13), (y + 1) );
	three3 ( (x + 14), (y + 1) );
	three3 ( (x + 15), (y + 1) );
	three3 ( (x + 16), (y + 1) );
	three3 ( (x + 17), (y + 1) );
	/////////////ROW 3///////////////
	three3 ( (x + 9), (y + 2) );
	three3 ( (x + 10), (y + 2) );
	three3 ( (x + 11), (y + 2) );
	three3 ( (x + 12), (y + 2) );
	three3 ( (x + 13), (y + 2) );
	three3 ( (x + 14), (y + 2) );
	three3 ( (x + 15), (y + 2) );
	three3 ( (x + 16), (y + 2) );
	three3 ( (x + 17), (y + 2) );
	three3 ( (x + 18), (y + 2) );
	//////////ROW 4///////////////
	three3 ( (x + 7), (y + 3) );
	three3 ( (x + 8), (y + 3) );
	three3 ( (x + 9), (y + 3) );
	three3 ( (x + 10), (y + 3) );
	three3 ( (x + 11), (y + 3) );
	three3 ( (x + 12), (y + 3) );
	three3 ( (x + 13), (y + 3) );
	three3 ( (x + 14), (y + 3) );
	three3 ( (x + 15), (y + 3) );
	three3 ( (x + 16), (y + 3) );
	three3 ( (x + 17), (y + 3) );
	three3 ( (x + 18), (y + 3) );
	three3 ( (x + 19), (y + 3) );
	/////////ROW 5/////////////////
	three3 ( (x + 8), (y + 4) );
	three3 ( (x + 9), (y + 4) );
	three3 ( (x + 10), (y + 4) );
	three3 ( (x + 11), (y + 4) );
	three3 ( (x + 12), (y + 4) );
	three3 ( (x + 13), (y + 4) );
	three3 ( (x + 14), (y + 4) );
	three3 ( (x + 15), (y + 4) );
	three3 ( (x + 16), (y + 4) );
	three3 ( (x + 17), (y + 4) );
	three3 ( (x + 18), (y + 4) );
	three3 ( (x + 19), (y + 4) );
	three3 ( (x + 20), (y + 4) );
	//////////ROW 6////////////////
	three3 ( (x + 8), (y + 5) );
	three3 ( (x + 9), (y + 5) );
	three3 ( (x + 10), (y + 5) );
	three3 ( (x + 11), (y + 5) );
	three3 ( (x + 12), (y + 5) );
	three3 ( (x + 13), (y + 5) );
	three3 ( (x + 14), (y + 5) );
	three3 ( (x + 15), (y + 5) );
	three3 ( (x + 16), (y + 5) );
	three3 ( (x + 17), (y + 5) );
	three3 ( (x + 18), (y + 5) );
	three3 ( (x + 19), (y + 5) );
	///////////ROW 7/////////////////
	three3 ( (x + 7), (y + 6) );
	three3 ( (x + 8), (y + 6) );
	three3 ( (x + 9), (y + 6) );
	three3 ( (x + 10), (y + 6) );
	three3 ( (x + 11), (y + 6) );
	three3 ( (x + 12), (y + 6) );
	three3 ( (x + 13), (y + 6) );
	three3 ( (x + 14), (y + 6) );
	three3 ( (x + 15), (y + 6) );
	three3 ( (x + 16), (y + 6) );
	three3 ( (x + 17), (y + 6) );
	three3 ( (x + 18), (y + 6) );
	three3 ( (x + 19), (y + 6) );
	/////////Row 8////////////////////
	three3 ( (x + 7), (y + 7) );
	three3 ( (x + 8), (y + 7) );
	three3 ( (x + 9), (y + 7) );
	three3 ( (x + 10), (y + 7) );
	three3 ( (x + 11), (y + 7) );
	three3 ( (x + 12), (y + 7) );
	three3 ( (x + 13), (y + 7) );
	three3 ( (x + 14), (y + 7) );
	three3 ( (x + 15), (y + 7) );
	three3 ( (x + 16), (y + 7) );
	three3 ( (x + 17), (y + 7) );
	three3 ( (x + 18), (y + 7) );
	three3 ( (x + 19), (y + 7) );
	three3 ( (x + 20), (y + 7) );
	////////////ROW 9//////////////
	three3 ( (x + 7), (y + 8) );
	three3 ( (x + 8), (y + 8) );
	three3 ( (x + 9), (y + 8) );
	three3 ( (x + 10), (y + 8) );
	three3 ( (x + 11), (y + 8) );
	three3 ( (x + 12), (y + 8) );
	three3 ( (x + 13), (y + 8) );
	kirito_color = skin;
	three3 ( (x + 14), (y + 8) );
	kirito_color = hair;
	three3 ( (x + 15), (y + 8) );
	three3 ( (x + 16), (y + 8) );
	three3 ( (x + 17), (y + 8) );
	three3 ( (x + 18), (y + 8) );
	three3 ( (x + 19), (y + 8) );
	///////////ROW 10/////////////
	three3 ( (x + 7), (y + 9) );
	three3 ( (x + 8), (y + 9) );
	three3 ( (x + 9), (y + 9) );
	kirito_color = skin;
	three3 ( (x + 10), (y + 9) );
	kirito_color = hair;
	three3 ( (x + 11), (y + 9) );
	kirito_color = Color.black;
	three3 ( (x + 12), (y + 9) );
	kirito_color = hair;
	three3 ( (x + 13), (y + 9) );
	kirito_color = skin;
	three3 ( (x + 14), (y + 9) );
	kirito_color = hair;
	three3 ( (x + 15), (y + 9) );
	three3 ( (x + 16), (y + 9) );
	three3 ( (x + 17), (y + 9) );
	kirito_color = Color.black;
	three3 ( (x + 18), (y + 9) );
	kirito_color = hair;
	/////////////ROW 11//////////
	three3 ( (x + 8), (y + 10) );
	three3 ( (x + 9), (y + 10) );
	kirito_color = skin;
	three3 ( (x + 10), (y + 10) );
	kirito_color = hair;
	three3 ( (x + 11), (y + 10) );
	kirito_color = Color.white;
	three3 ( (x + 12), (y + 10) );
	kirito_color = hair;
	three3 ( (x + 13), (y + 10) );
	kirito_color = Color.black;
	three3 ( (x + 14), (y + 10) );
	kirito_color = skin;
	three3 ( (x + 15), (y + 10) );
	kirito_color = hair;
	three3 ( (x + 16), (y + 10) );
	three3 ( (x + 17), (y + 10) );
	kirito_color = Color.black;
	three3 ( (x + 18), (y + 10) );
	kirito_color = hair;
	////////////ROW 12///////////
	three3 ( (x + 9), (y + 11) );
	kirito_color = Color.black;
	three3 ( (x + 10), (y + 11) );
	kirito_color = Color.white;
	three3 ( (x + 11), (y + 11) );
	three3 ( (x + 12), (y + 11) );
	kirito_color = hair;
	three3 ( (x + 13), (y + 11) );
	kirito_color = skin;
	three3 ( (x + 14), (y + 11) );
	three3 ( (x + 15), (y + 11) );
	three3 ( (x + 16), (y + 11) );
	kirito_color = hair;
	three3 ( (x + 17), (y + 11) );
	kirito_color = Color.black;
	three3 ( (x + 18), (y + 11) );
	kirito_color = Color.black;
	///////////ROW 13//////////////
	three3 ( (x + 3), (y + 12) );
	three3 ( (x + 4), (y + 12) );
	kirito_color = hair;
	three3 ( (x + 9), (y + 12) );
	kirito_color = Color.black;
	three3 ( (x + 10), (y + 12) );
	kirito_color = skin;
	three3 ( (x + 11), (y + 12) );
	three3 ( (x + 12), (y + 12) );
	three3 ( (x + 13), (y + 12) );
	three3 ( (x + 14), (y + 12) );
	three3 ( (x + 15), (y + 12) );
	three3 ( (x + 16), (y + 12) );
	three3 ( (x + 17), (y + 12) );
	kirito_color = Color.black;
	three3 ( (x + 18), (y + 12) );
	////////////ROW 14/////////////
	three3 ( (x + 3), (y + 13) );
	kirito_color = chest_piece;
	three3 ( (x + 4), (y + 13) );
	kirito_color = Color.black;
	three3 ( (x + 5), (y + 13) );
	kirito_color = hair;
	three3 ( (x + 10), (y + 13) );
	kirito_color = Color.black;
	three3 ( (x + 11), (y + 13) );
	kirito_color = skin;
	three3 ( (x + 12), (y + 13) );
	three3 ( (x + 13), (y + 13) );
	three3 ( (x + 14), (y + 13) );
	three3 ( (x + 15), (y + 13) );
	three3 ( (x + 16), (y + 13) );
	three3 ( (x + 17), (y + 13) );
	kirito_color = Color.black;
	three3 ( (x + 18), (y + 13) );
	///////////ROW 15///////////////
	three3 ( (x + 4), (y + 14) );
	kirito_color = chest_piece;
	three3 ( (x + 5), (y + 14) );
	kirito_color = Color.black;
	three3 ( (x + 6), (y + 14) );
	three3 ( (x + 8), (y + 14) );
	three3 ( (x + 9), (y + 14) );
	kirito_color = hair;
	three3 ( (x + 10), (y + 14) );
	kirito_color = Color.black;
	three3 ( (x + 11), (y + 14) );
	three3 ( (x + 12), (y + 14) );
	kirito_color = skin;
	three3 ( (x + 13), (y + 14) );
	three3 ( (x + 14), (y + 14) );
	three3 ( (x + 15), (y + 14) );
	three3 ( (x + 16), (y + 14) );
	kirito_color = Color.black;
	three3 ( (x + 17), (y + 14) );
	//////////ROW 16/////////////////
	three3 ( (x + 5), (y + 15) );
	kirito_color = chest_piece;
	three3 ( (x + 6), (y + 15) );
	kirito_color = Color.black;
	three3 ( (x + 7), (y + 15) );
	kirito_color = chest_piece;
	three3 ( (x + 8), (y + 15) );
	kirito_color = Color.black;
	three3 ( (x + 9), (y + 15) );
	three3 ( (x + 11), (y + 15) );
	kirito_color = skin;
	three3 ( (x + 12), (y + 15) );
	kirito_color = Color.black;
	three3 ( (x + 13), (y + 15) );
	kirito_color = skin;
	three3 ( (x + 14), (y + 15) );
	three3 ( (x + 15), (y + 15) );
	kirito_color = Color.black;
	three3 ( (x + 16), (y + 15) );
	/////////ROw 17////////////////
	three3 ( (x + 6), (y + 16) );
	kirito_color = chest_piece;
	three3 ( (x + 7), (y + 16) );
	three3 ( (x + 8), (y + 16) );
	kirito_color = Color.black;
	three3 ( (x + 9), (y + 16) );
	three3 ( (x + 10), (y + 16) );
	three3 ( (x + 11), (y + 16) );
	kirito_color = skin;
	three3 ( (x + 12), (y + 16) );
	three3 ( (x + 13), (y + 16) );
	kirito_color = Color.black;
	three3 ( (x + 14), (y + 16) );
	three3 ( (x + 15), (y + 16) );
	three3 ( (x + 16), (y + 16) );
	//////////////ROW 18///////////
	three3 ( (x + 5), (y + 17) );
	kirito_color = chest_piece;
	three3 ( (x + 6), (y + 17) );
	three3 ( (x + 7), (y + 17) );
	kirito_color = sheath_outline;
	three3 ( (x + 8), (y + 17) );
	three3 ( (x + 9), (y + 17) );
	kirito_color = med_jacket;
	three3 ( (x + 10), (y + 17) );
	kirito_color = skin;
	three3 ( (x + 11), (y + 17) );
	three3 ( (x + 12), (y + 17) );
	three3 ( (x + 13), (y + 17) );
	three3 ( (x + 14), (y + 17) );
	three3 ( (x + 15), (y + 17) );
	kirito_color = Color.black;
	three3 ( (x + 16), (y + 17) );
	three3 ( (x + 17), (y + 17) );
	three3 ( (x + 18), (y + 17) );
	three3 ( (x + 19), (y + 17) );
	///////////ROW 19/////////
	three3 ( (x + 5), (y + 18) );
	three3 ( (x + 6), (y + 18) );
	kirito_color = sheath_outline;
	three3 ( (x + 7), (y + 18) );
	kirito_color = sheath;
	three3 ( (x + 8), (y + 18) );
	three3 ( (x + 9), (y + 18) );
	kirito_color = sheath_outline;
	three3 ( (x + 10), (y + 18) );
	kirito_color = med_jacket;
	three3 ( (x + 11), (y + 18) );
	kirito_color = skin;
	three3 ( (x + 12), (y + 18) );
	three3 ( (x + 13), (y + 18) );
	three3 ( (x + 14), (y + 18) );
	three3 ( (x + 15), (y + 18) );
	kirito_color = Color.black;
	three3 ( (x + 16), (y + 18) );
	kirito_color = chest_outline;
	three3 ( (x + 17), (y + 18) );
	three3 ( (x + 18), (y + 18) );
	kirito_color = med_jacket;
	three3 ( (x + 19), (y + 18) );
	kirito_color = Color.black;
	three3 ( (x + 20), (y + 18) );
	////////////ROW 20/////////////
	three3 ( (x + 6), (y + 19) );
	kirito_color = med_jacket;
	three3 ( (x + 7), (y + 19) );
	kirito_color = sheath_outline;
	three3 ( (x + 8), (y + 19) );
	kirito_color = sheath;
	three3 ( (x + 9), (y + 19) );
	three3 ( (x + 10), (y + 19) );
	kirito_color = sheath_outline;
	three3 ( (x + 11), (y + 19) );
	kirito_color = med_jacket;
	three3 ( (x + 12), (y + 19) );
	kirito_color = skin;
	three3 ( (x + 13), (y + 19) );
	three3 ( (x + 14), (y + 19) );
	three3 ( (x + 15), (y + 19) );
	three3 ( (x + 16), (y + 19) );
	kirito_color = chest_outline;
	three3 ( (x + 17), (y + 19) );
	kirito_color = chest_piece;
	three3 ( (x + 18), (y + 19) );
	kirito_color = chest_outline;
	three3 ( (x + 19), (y + 19) );
	kirito_color = Color.black;
	three3 ( (x + 20), (y + 19) );
	/////////ROW 21////////////////
	three3 ( (x + 6), (y + 20) );
	kirito_color = jacket_light;
	three3 ( (x + 7), (y + 20) );
	kirito_color = med_jacket;
	three3 ( (x + 8), (y + 20) );
	kirito_color = sheath_outline;
	three3 ( (x + 9), (y + 20) );
	kirito_color = sheath;
	three3 ( (x + 10), (y + 20) );
	three3 ( (x + 11), (y + 20) );
	kirito_color = sheath_outline;
	three3 ( (x + 12), (y + 20) );
	kirito_color = med_jacket;
	three3 ( (x + 13), (y + 20) );
	three3 ( (x + 14), (y + 20) );
	three3 ( (x + 15), (y + 20) );
	three3 ( (x + 16), (y + 20) );
	kirito_color = chest_outline;
	three3 ( (x + 17), (y + 20) );
	kirito_color = chest_piece;
	three3 ( (x + 18), (y + 20) );
	kirito_color = chest_outline;
	three3 ( (x + 19), (y + 20) );
	kirito_color = med_jacket;
	three3 ( (x + 20), (y + 20) );
	kirito_color = Color.black;
	three3 ( (x + 21), (y + 20) );
	/////////ROW 22///////////////
	three3 ( (x + 6), (y + 21) );
	kirito_color = jacket_light;
	three3 ( (x + 7), (y + 21) );
	three3 ( (x + 8), (y + 21) );
	kirito_color = med_jacket;
	three3 ( (x + 9), (y + 21) );
	kirito_color = sheath_outline;
	three3 ( (x + 10), (y + 21) );
	kirito_color = sheath;
	three3 ( (x + 11), (y + 21) );
	three3 ( (x + 12), (y + 21) );
	kirito_color = sheath_outline;
	three3 ( (x + 13), (y + 21) );
	kirito_color = med_jacket;
	three3 ( (x + 14), (y + 21) );
	kirito_color = jacket_light;
	three3 ( (x + 15), (y + 21) );
	three3 ( (x + 16), (y + 21) );
	kirito_color = chest_outline;
	three3 ( (x + 17), (y + 21) );
	kirito_color = chest_piece;
	three3 ( (x + 18), (y + 21) );
	kirito_color = chest_outline;
	three3 ( (x + 19), (y + 21) );
	kirito_color = med_jacket;
	three3 ( (x + 20), (y + 21) );
	kirito_color = Color.black;
	three3 ( (x + 21), (y + 21) );
	/////////////ROW 23///////////
	three3 ( (x + 6), (y + 22) );
	kirito_color = jacket_light;
	three3 ( (x + 7), (y + 22) );
	three3 ( (x + 8), (y + 22) );
	kirito_color = med_jacket;
	three3 ( (x + 9), (y + 22) );
	kirito_color = Color.black;
	three3 ( (x + 10), (y + 22) );
	kirito_color = sheath_outline;
	three3 ( (x + 11), (y + 22) );
	kirito_color = sheath;
	three3 ( (x + 12), (y + 22) );
	three3 ( (x + 13), (y + 22) );
	kirito_color = sheath_outline;
	three3 ( (x + 14), (y + 22) );
	kirito_color = med_jacket;
	three3 ( (x + 15), (y + 22) );
	kirito_color = jacket_light;
	three3 ( (x + 16), (y + 22) );
	kirito_color = chest_outline;
	three3 ( (x + 17), (y + 22) );
	kirito_color = chest_piece;
	three3 ( (x + 18), (y + 22) );
	kirito_color = chest_outline;
	three3 ( (x + 19), (y + 22) );
	kirito_color = med_jacket;
	three3 ( (x + 20), (y + 22) );
	kirito_color = Color.black;
	three3 ( (x + 21), (y + 22) );
    }
    
    public static void three3 (int x, int y)
    {
	x = x * 9;
	y = y * 9;
	c.setColor (kirito_color);
	c.fillRect (x, y, 9, 9);
    }
    
    public static void four4 (int x, int y)
    {
	x = x * 7;
	y = y * 7;
	c.setColor (enemy_color);
	c.fillRect (x, y, 7, 7);
    }
} // LOOLLLLL class
