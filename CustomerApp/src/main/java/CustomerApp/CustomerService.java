package CustomerApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerService {
   
    @Autowired
	private CustomerRepository repository;  
    
    public void test() {
    	
    	Customer newCustomer = new Customer();
    	newCustomer.setFirstName("Kevin");
    	newCustomer.setLastName("Jhonson");
    	
    	repository.save(newCustomer);
    	
    }
	
}
