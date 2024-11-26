package com.infosys.carRentalSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.infosys.carRentalSystem.bean.Customer;

public interface CustomerRepository  extends JpaRepository<Customer,String>{

	@Query("select status from Customer where username=?1")
	public Boolean getCustomerStatusByUsername(String username);
	
	@Query("select experiryDate from Customer where username=?1")
	public String getLicenceExpiryDate(String username);
	
}