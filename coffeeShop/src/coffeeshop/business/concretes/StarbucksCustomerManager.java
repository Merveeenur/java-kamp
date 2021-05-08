package coffeeshop.business.concretes;

import coffeeshop.business.abstracts.BaseCustomerManager;
import coffeeshop.business.abstracts.CustomerCheckService;
import coffeeshop.entities.concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		
		if (customerCheckService.CheckIfRealPerson(customer)) {
			
			save(customer);
		}
		
		else {
			System.out.println("Not a valid person");
		}
	}


	

	
}
