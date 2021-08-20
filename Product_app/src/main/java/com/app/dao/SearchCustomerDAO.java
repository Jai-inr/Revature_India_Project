package com.app.dao;

import com.app.exception.BusinessException;
import com.app.model.Customer;

public interface SearchCustomerDAO {

	public Customer getCustomerById(int cutomer_id) throws BusinessException;
}
