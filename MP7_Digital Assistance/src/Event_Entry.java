import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Date;

public class Event_Entry
{

    protected static LinkedList <Event> deport = new LinkedList <Event> ();
    public static LinkedList <Event> update()
    {
        deport.clear();
        BufferedReader BR = null;
        try 
        {
            String templine;
            BR = new BufferedReader(new FileReader("Events.csv"));
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

                Event tempEvent = new Event(
                  new Date(temp.get(0)), temp.get(1), temp.get(2), Boolean.parseBoolean(temp.get(3)));
                deport.add(tempEvent);
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
    public static void save(LinkedList <Event> imported)
    {
        
        try
    	{
    	    FileWriter writer = new FileWriter("Events.csv");

    	    for ( int count = 0; count<imported.size(); count++)
    	    {
    	        Event tempEvent = imported.get(count);
    	        
    	        writer.append(tempEvent.getDate().toString());
    	        writer.append(',');
    	        writer.append(tempEvent.getTitle());
    	        writer.append(',');
    	        writer.append(tempEvent.getDetail());
    	        writer.append(',');
    	        writer.append(tempEvent.getReminder()+"");
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