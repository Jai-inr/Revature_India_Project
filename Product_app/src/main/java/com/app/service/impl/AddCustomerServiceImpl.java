package com.app.service.impl;

import com.app.dao.AddCustomerDAO;
import com.app.dao.impl.AddCustomerDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Customer;
import com.app.service.AddCustomerService;

public class AddCustomerServiceImpl implements AddCustomerService{

	AddCustomerDAO addCustomerDAO=new AddCustomerDAOImpl();
	@Override
	public int addCustomer(Customer customer) throws BusinessException {
		// TODO Auto-generated method stub
		return addCustomerDAO.addCustomer(customer);
	}
	
}

	