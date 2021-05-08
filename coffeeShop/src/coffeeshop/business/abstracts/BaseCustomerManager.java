package coffeeshop.business.abstracts;

import coffeeshop.entities.concretes.Customer;

public abstract class BaseCustomerManager implements CustomerService  {

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to database :" + customer.getFirstName());
		
	}

}
