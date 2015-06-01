// The "SavingDataTest" class.
import java.awt.*;
import hsa.Console;
import java.io.*;
import hsa.*;

public class SavingDataTest
{
    static Console c;           // The output console
    
    public static void main (String[] args) throws IOException
    {
	c = new Console ();
	
	String name;
	boolean name_taken = false;
	String name_on_list = "Missingno";
	String temp_pass_store;
	
	while (1 == 1)
	{
	    BufferedReader read_name_list = new BufferedReader (new FileReader ("name_list.txt")); //Opens the file in a way that can read Null
	    PrintWriter input_name_list = new PrintWriter (new FileWriter ("name_list.txt", true) ); //Starts writing at the end
	    
	    c.print ("Please enter a username: ");  //Enters username
	    name = c.readLine ();
	
	    name_on_list = read_name_list.readLine (); //takes the first name on the list

	    while (name_on_list != null) //Checks if there is nothing let to read
	    {
		if (name_on_list.equals (name)) //Checks if the name in the file is the same as the one entered
		{
		    break;
		}
		
		name_on_list = read_name_list.readLine ();//Gets new word on list
	    }
	
	    if (name_on_list != null) //If the name is taken, the name on the list will not be null
	    {
		c.clear ();
		c.print ("That username is taken.");
		
	    }
	    
	    else
	    {
		input_name_list.println (name);
		c.println ();
		break;    
	    }
	    read_name_list.close ();
	    input_name_list.close ();   
	}
	
	c.print ("Username is not taken, please enter your password now: ");
	PrintWriter input_save_data = new PrintWriter (new FileWriter (name + ".txt") );
	temp_pass_store = c.readString ();
	input_save_data.println (temp_pass_store);
	temp_pass_store = "";
	
	
	
	
    } // main method
} // SavingDataTest class
