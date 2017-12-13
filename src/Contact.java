public class Contact 
{
    private String fname, lname, phone, address;
    public Contact(String Fname, String Lname, String pnum, String Adress )
    {
        fname = Fname;
        lname = Lname;
        phone = pnum;
        address = Adress;
    }
    public String getFname()
    {
        return fname;
    }
    public String getLname()
    {
        return lname;
    }
    public String getPhone()
    {
        return phone;
    }
    public String getAddress()
    {
        return address;
    }
    public String printList()
    {
        return lname +", "+fname;
    }
}
