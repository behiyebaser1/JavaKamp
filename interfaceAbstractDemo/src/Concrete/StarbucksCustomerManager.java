package Concrete;

//import java.util.zip.CheckedInputStream;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}



	@Override
	public void save(Customer customer) {
		
		if(customerCheckService.CheckIfRealPerson(customer)) {//true d�nerse ki�iyi kaydet
			
			super.save(customer);
		}
		else {//d�nmezse ge�erli ki�i de�il
			System.out.println("Ge�ersiz kullan�c�.");
			
		}
	}


	

}
