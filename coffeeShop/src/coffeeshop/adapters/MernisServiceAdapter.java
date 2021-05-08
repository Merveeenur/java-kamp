package coffeeshop.adapters;

import java.rmi.RemoteException;

import coffeeshop.business.abstracts.CustomerCheckService;
import coffeeshop.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
	
		KPSPublicSoapProxy client =new KPSPublicSoapProxy();
		try {
				return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalId()), 
				customer.getFirstName().toUpperCase(), 
				customer.getLastName().toUpperCase(),
				customer.getDateOfBirth().getYear());
		}
		catch(RemoteException e) 
		{
			e.printStackTrace();
		}
		
		return false;
		
	}

}
