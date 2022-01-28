package com.tpDirectory.service;

import java.util.List;
import com.tpDirectory.model.Telephone;

public interface TpService {
	
	List<Telephone> getAllTpDetails();
	
	Telephone getTpDetails(String id);
	
	Telephone saveTpDetails(Telephone tp2);
	
	public Telephone updateProduct(Telephone tp);
	
	public void deleteTelephone(long id);

	List<Telephone> getTpDetailsByCity(String city);

	List<Telephone> getTpDetailsByPincode(String pincode);

	List<Telephone> getTpDetailsByName(String name);

}
