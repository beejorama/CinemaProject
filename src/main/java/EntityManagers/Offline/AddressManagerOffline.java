package EntityManagers.Offline;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import Entities.Address;
import Entities.Customer;
import EntityManagers.AddressManager;
import Utilities.DummyData;

@Default
@Stateless
public class AddressManagerOffline implements AddressManager {
	
	@Inject
	private DummyData dummyData;

	public void persistAddress(Address input) {
		dummyData.getAddresses().add(input);
	}

	public List<Address> getAddressByCustomer(Customer input) {
		List<Address> returnList = new ArrayList<Address>();
		List<Address> searchList = dummyData.getAddresses();
		for(Address a : searchList){
			if(a.getCustomer() == input){
				returnList.add(a);
			}
		}
		return returnList;
	}

	public void updateAddressLine1(int id, String input) {
		for(Address ad : dummyData.getAddresses()){
			if(ad.getId() == id){
				ad.setLine1(input);
				break;
			}
		}
	}

	public void updateAddressLine2(int id, String input) {
		for(Address ad : dummyData.getAddresses()){
			if(ad.getId() == id){
				ad.setLine2(input);
				break;
			}
		}
	}

	public void updateAddressTown(int id, String input) {
		for(Address ad : dummyData.getAddresses()){
			if(ad.getId() == id){
				ad.setTown(input);
				break;
			}
		}
	}

	public void updateAddressPostcode(int id, String input) {
		for(Address ad : dummyData.getAddresses()){
			if(ad.getId() == id){
				ad.setPostcode(input);
				break;
			}
		}
	}

	public void updateAddressCounty(int id, String input) {
		for(Address ad : dummyData.getAddresses()){
			if(ad.getId() == id){
				ad.setCounty(input);
				break;
			}
		}
	}

	public void deleteAddress(int id) {
		List<Address> list = dummyData.getAddresses();
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getId() == id){
				list.remove(i);
				break;
			}
		}
	}

}
