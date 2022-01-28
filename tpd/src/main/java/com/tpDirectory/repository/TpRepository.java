package com.tpDirectory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tpDirectory.model.Telephone;

@Repository
public interface TpRepository extends JpaRepository<Telephone, Long> {

	public List<Telephone> findByCity(String city);
	
	public List<Telephone> findByPincode(String pincode);
	
	public List<Telephone> findByName(String name);
	
	

}
