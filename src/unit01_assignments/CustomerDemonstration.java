package unit01_assignments;

public class CustomerDemonstration {
    
        public static void main(String[] args) 
    {
        
        //Simple output of the inheritance example...it works!:
        Customer customer = new Customer("987-6543", false);
        
        System.out.println(customer.getFirstName());
        System.out.println(customer.getLastName());
        System.out.println(customer.getStreetAddress());
        System.out.println(customer.getPhoneNumber());
        System.out.println(customer.getCustNumber());
        System.out.println(customer.subscribedToMailingList());
                
        
    }

    
    
    
}
