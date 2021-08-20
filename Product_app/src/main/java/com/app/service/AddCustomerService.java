package com.app.service;

import com.app.exception.BusinessException;
import com.app.model.Customer;


public interface AddCustomerService {
	
	public int addCustomer(Customer customer) throws BusinessException;

}
