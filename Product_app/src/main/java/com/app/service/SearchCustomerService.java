package com.app.service;

import com.app.exception.BusinessException;
import com.app.model.Customer;

public interface SearchCustomerService {
	
	public Customer getCustomerById(int cutomer_id) throws BusinessException;

}
