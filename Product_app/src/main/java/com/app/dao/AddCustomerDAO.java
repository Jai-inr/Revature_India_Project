package com.app.dao;

import com.app.exception.BusinessException;
import com.app.model.Customer;
import com.app.model.Product;

public interface AddCustomerDAO {

	public int addCustomer(Customer customer) throws BusinessException;
}
