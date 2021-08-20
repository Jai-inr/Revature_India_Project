package com.app.service.impl;

import org.apache.log4j.Logger;

import com.app.dao.CustomerLoginDAO;
import com.app.dao.impl.CustomerLoginDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Customer;
import com.app.service.CustomerLoginService;

public class CustomerLoginServiceImpl implements CustomerLoginService{

	private static Logger log = Logger.getLogger(CustomerLoginServiceImpl.class);
	
	CustomerLoginDAO customerLoginDAO=new CustomerLoginDAOImpl();
	@Override
	public Customer isValidCustomer(String email, String password) throws BusinessException {
		Customer customer=null;
		if (email.matches("[a-zA-Z]{2,20}@gmail.com")) {
			if(password.matches("[A-Z]{1}[a-z]{2,10}[0-9]{2,8}")) {
				
				customer=customerLoginDAO.isValidCustomer(email, password);
				
				
			}else {
				log.info("Invalid password Password Must be One Upper Case Min of Two Lower Case and Min 2 Numbers");
			}
			
		}else {
			log.info("Invalid Email Credential Ending with @GMAIL.COM ");
		}
		return customer;
	}

}
