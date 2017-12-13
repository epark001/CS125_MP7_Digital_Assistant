import java.util.LinkedList;
import java.util.Date;
public class Event_Management 
{
private LinkedList <Event> list = new LinkedList<Event>();
    private Event imported;
    public Event_Management()
    {
        refresh();
    }
    private void refresh()
    {
        list.clear();
        list = Event_Entry.update();
    }
    public void save()
    {
        Event_Entry.save(list);
    }
    public void addEvent(Event i)
    {
        refresh();
        imported = i;
        sort();
        save();
    }
    public void saveEvent(int index, Event tempEvent)
    {
        refresh();
        list.set(index, tempEvent);
        save();
    }
    public Event getEvent(int index)
    {
        refresh();
        Event exported = list.get(index);
        return exported;
    }
    public void removeEvent(int index)
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
        Date tempDate = imported.getDate();
        if(size==0)
        {
            list.add(imported);
        }
        else 
        {
            while((done == false)&&(count<size))
            {
                Date tempDate1 = list.get(count).getDate();
                if( tempDate.before(tempDate1))
                {
                    list.add(count, imported);
                    done=true;
                }
                else
                {
                    count++;
                }
            }
            if (done == false)
            {
                list.add(imported);
                done = true;
            }
        }
    }
}
