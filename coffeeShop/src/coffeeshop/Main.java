package coffeeshop;


import java.time.LocalDate;

import coffeeshop.adapters.MernisServiceAdapter;
import coffeeshop.business.abstracts.BaseCustomerManager;

import coffeeshop.business.concretes.StarbucksCustomerManager;
import coffeeshop.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Merve Nur","Teke","123654",LocalDate.of(1996,11,3)));
		
	}

	

}
