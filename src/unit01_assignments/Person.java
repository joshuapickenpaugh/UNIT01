package unit01_assignments;

public class Person 
{
    public String fName;
    public String lName;
    public String streetAddress;
    public String phoneNumber;
    
    //Empty constructor. This enables the "Customer" class to extend this class.
    public Person ()
    {
        
    }
    
    public Person(String fnme, String lnme, String stadd, String phnmbr)
    {
        fName = fnme;
        lName = lnme;
        streetAddress = stadd;
        phoneNumber = phnmbr;
    }
    
    public String getFirstName()
    {
        return fName;
    }
    
    public String getLastName()
    {
        return lName;
    }
    
    public String getStreetAddress()
    {
        return streetAddress;
    }
    
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
}
