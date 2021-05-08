package coffeeshop.business.concretes;

import coffeeshop.business.abstracts.CustomerCheckService;
import coffeeshop.entities.concretes.Customer;

public class CustomerCheckManagar implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) 
	{
		return true;
		
	}

}
