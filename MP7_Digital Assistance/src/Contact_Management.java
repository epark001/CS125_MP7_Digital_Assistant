import java.util.ArrayList;
import java.util.LinkedList;

public class Contact_Management 
{
    private LinkedList <Contact> list = new LinkedList<Contact>();
    private Contact imported;
    public Contact_Management()
    {
        refresh();
    }
    private void refresh()
    {
        list.clear();
        list = Contact_Entry.update();
    }
    private void save()
    {
        Contact_Entry.save(list);
    }
    public void addContact(Contact i)
    {
        refresh();
        imported = i;
        sort();
        save();
    }
    public void removeContact(int index)
    {
        refresh();
        list.remove(index);
        save();
    }
    private void sort()
    {
        boolean done = false;
        int count = 0;
        int size = list.size();
        String name = imported.getLname() + " "+ imported.getFname();
        name = name.toLowerCase();
        if(size==0)
        {
            list.add(imported);
        }
        else 
        {
            while((done == false)&&(count<size))
            {
                String name1 = list.get(count).getLname() + " "+ list.get(count).getFname();
                name1 = name1.toLowerCase();
                if(name1.compareTo(name)>0)
                {
                    list.add(count,imported);
                    done=true;
                }
                else
                {
                    count++;
                }
            }
        }
    }
}
