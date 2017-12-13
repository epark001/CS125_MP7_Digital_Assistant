import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;
import java.util.LinkedList;
public class Contact_Entry
{

    protected static ArrayList <Contact> list = new ArrayList <Contact>();
    protected static LinkedList <Contact> deport = new LinkedList <Contact> ();
    public static LinkedList <Contact> update()
    {
        deport.clear();
        BufferedReader BR = null;
        try 
        {
            String templine;
            BR = new BufferedReader(new FileReader("Contacts.csv"));
            while ((templine = BR.readLine()) != null) {
                LinkedList < String > temp = new LinkedList < String > ();
                String[] splitline = templine.split("\\s*,\\s*");
                for (int i = 0; i < splitline.length; i++) 
                {
                    if (!(splitline[i] == null) || !(splitline[i].length() == 0)) 
                    {
                        temp.add(splitline[i].trim());
                    }
                }

                Contact tempcontact = new Contact(
                  temp.get(0), temp.get(1), temp.get(2), temp.get(3));
                deport.add(tempcontact);
            }
        } 
        catch (IOException e) 
        {   
            e.printStackTrace();
        } 
        finally 
        {
            try 
            {
                if (BR != null) 
                {
                    BR.close();
                }
            } 
            catch (IOException crunchifyException) 
            {
                crunchifyException.printStackTrace();
            }
        }
        return deport;
    }
    public static void save(LinkedList <Contact> imported)
    {
        
        try
    	{
    	    FileWriter writer = new FileWriter("Contacts.csv");

    	    for ( int count = 0; count<imported.size(); count++)
    	    {
    	        Contact tempcontact = imported.get(count);
    	        
    	        writer.append(tempcontact.getFname());
    	        writer.append(',');
    	        writer.append(tempcontact.getLname());
    	        writer.append(',');
    	        writer.append(tempcontact.getPhone());
    	        writer.append(',');
    	        writer.append(tempcontact.getAddress());
    	        writer.append('\n');
    	    }
    			
    	    writer.flush();
    	    writer.close();
    	}
    	catch(IOException e)
    	{
    	     e.printStackTrace();
    	} 
    }
}