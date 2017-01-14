 package unit01_assignments;


public class Customer extends Person {    
    
    public String custNumber;
    public Boolean mailingList = false;
    
    public Customer(String cstnum, Boolean mlnglst)
    {
        super("Joe", "Smith", "123 Main", "123-4567");
        custNumber = cstnum;
        mailingList = mlnglst;
    }
    
    @Override
    public String getFirstName()
    {
        return fName;
    }
    
    @Override
    public String getLastName()
    {
        return lName;
    }
    
    @Override
    public String getStreetAddress()
    {
        return streetAddress;
    }
    
    @Override
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    public String getCustNumber()
    {
        return custNumber;
    }
    
    public Boolean subscribedToMailingList()
    {
        if (mailingList = false)
        {
            return false;
        }
        else
            return true;
    }
    
}
