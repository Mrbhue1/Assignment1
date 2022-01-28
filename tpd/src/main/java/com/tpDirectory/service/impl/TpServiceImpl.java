package com.tpDirectory.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tpDirectory.model.Telephone;
import com.tpDirectory.repository.TpRepository;
import com.tpDirectory.service.TpService;

@Service
public class TpServiceImpl implements TpService {
	
	@Autowired
	private TpRepository tpr;
	public List<Telephone> getAllTpDetails() {
		return tpr.findAll();
	}
	 public Telephone getTpDetails(String id) {
	        Optional<Telephone> byId = tpr.findById(Long.valueOf(id));
	        if(byId.isPresent()){
	            return byId.get();
	        }else{
	            throw new RuntimeException("Data not Found for Given Id");
	        }
	    }
	
	 @Override
	 public Telephone saveTpDetails(Telephone request) {
	        Telephone tp = new Telephone();
	        tp.setId(request.getId());
	        tp.setName(request.getName());
	        tp.setCity(request.getCity());
	        tp.setEmail(request.getEmail());
	        tp.setPhone(request.getPhone());
	        tp.setPincode(request.getPincode());
	        return tpr.save(tp);
	    }
	 
	 @Override
	    public Telephone updateProduct(Telephone tp) {
	        Telephone tp1 =tpr.findById(tp.getId()).orElse(null);
	        tp1.setName(tp.getName());
	        tp1.setCity(tp.getCity());
	        tp1.setEmail(tp.getEmail());
	        tp1.setPhone(tp.getPhone());
	        tp1.setPincode(tp.getPincode());
	        return tpr.save(tp1);
	    }

		@Override
		public void deleteTelephone(long id) {
			
			Optional<Telephone> byId = tpr.findById(Long.valueOf(id));
	        if(byId.isPresent()){
	           tpr.deleteById(id);
	        }
	        else{
	            throw new RuntimeException("Data not Found for Given Id");
	        }

		}
		
		@Override
		public List<Telephone> getTpDetailsByCity(String city) {
			return tpr.findByCity(city);
		}
		@Override
		public List<Telephone> getTpDetailsByPincode(String pincode){
			return tpr.findByPincode(pincode);
		}
		@Override
		public List<Telephone> getTpDetailsByName(String name){
			return tpr.findByName(name);
		}
		
}
