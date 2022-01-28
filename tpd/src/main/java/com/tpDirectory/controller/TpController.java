package com.tpDirectory.controller;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.tpDirectory.model.Telephone;

import com.tpDirectory.service.TpService;

@RestController
public class TpController {
	
	@Autowired
	private TpService tps;
	
	@GetMapping("/tpds")
	public ResponseEntity<List<Telephone>> getAllDetails(){
		return new ResponseEntity(tps.getAllTpDetails(), HttpStatus.OK);
	}
	
	@GetMapping("/tpd/{id}")
    public ResponseEntity<Telephone> getDetails(@PathVariable String id){
        return new ResponseEntity(tps.getTpDetails(id), HttpStatus.OK);
    }
	@PostMapping("/tpd")
    public ResponseEntity<Telephone> saveTp(@Valid @RequestBody Telephone tp2){
        return new ResponseEntity(tps.saveTpDetails(tp2), HttpStatus.CREATED);
    }
	
	@PutMapping("/tpd/update")
    public Telephone updateProduct(@Valid @RequestBody Telephone tp) {
        return  tps.updateProduct(tp);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteTelephone(@PathVariable("id") long id){
    	tps.deleteTelephone(id);
    	return new ResponseEntity<String>("Phone Details deleted sucessfully", HttpStatus.OK);
    }
    
    @GetMapping("/tpd/city/{city}")
    public ResponseEntity<List<Telephone>> getDetails1(@PathVariable String city){
      return new ResponseEntity(tps.getTpDetailsByCity(city), HttpStatus.OK);

    }
	
    @GetMapping("/tpd/pincode/{pincode}")
    public ResponseEntity<List<Telephone>> getDetails2(@PathVariable String pincode){
      return new ResponseEntity(tps.getTpDetailsByPincode(pincode), HttpStatus.OK);

    }
    
    @GetMapping("/tpd/name/{name}")
    public ResponseEntity<List<Telephone>> getDetails3(@PathVariable String name){
      return new ResponseEntity(tps.getTpDetailsByName(name), HttpStatus.OK);

    }

}
