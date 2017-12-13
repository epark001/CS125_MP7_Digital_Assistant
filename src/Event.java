import java.util.Date;
public class Event 
{
    private String detail, title;
    private boolean remind;
    private int csv, list;
    Date date;
    public Event(Date d,String t, String det, boolean r)
    {
        title = t;
        date = d;
        detail = det;
        remind = r;
    }
    public Event(Date d,String t, String det, boolean r, int CSV, int LIST)
    {
        title = t;
        date = d;
        detail = det;
        remind = r;
        csv = CSV;
        list = LIST;
    }
    public void setIndex(int CSV, int DISP)
    {
        csv = CSV;
        list = DISP;
    }
    public void setCsvIndex(int i)
    {
        csv = i;
    }
    public int getCsvIndex()
    {
        return csv;
    }
    public void setDispIndex(int i)
    {
        list = i;
    }
    public int getDispIndex()
    {
        return list;
    }
    public void setDate(Date d)
    {
        date = d; 
   }
    public void setDetail(String d)
    {
        detail = d;
    }
    public void setReminder(boolean y)
    {
        remind = y;
    }
    public void setTitle(String i)
    {
        title = i;
    }
    public Date getDate()
    {
        return date; 
    }
    public String getDetail()
    {
        return detail;
    }
    public boolean getReminder()
    {
        return remind;
    }
    public String getTitle()
    {
        return title;
    }
    public String displayEvent()
    {
        String out = date.getMonth()+1+"/"+date.getDate()+"/"+(date.getYear()+1900);
        out+= " "+ date.getHours()+":"+date.getMinutes()+" "+title;
        return out;
    }
}
