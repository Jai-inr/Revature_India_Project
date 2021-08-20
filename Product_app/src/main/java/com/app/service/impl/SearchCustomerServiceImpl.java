package com.app.service.impl;

import org.apache.log4j.Logger;

import com.app.dao.SearchCustomerDAO;
import com.app.dao.impl.SearchCustomerDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Customer;
import com.app.service.SearchCustomerService;

public class SearchCustomerServiceImpl implements SearchCustomerService {
	private static SearchCustomerDAO searchCustomerDAO=new SearchCustomerDAOImpl();

	private static Logger log = Logger.getLogger(SearchCustomerServiceImpl.class);
	@Override
	public Customer getCustomerById(int cutomer_id) throws BusinessException {
		Customer customer=null;
		if (cutomer_id<1 || cutomer_id>100) {
			throw new BusinessException("Invalid Id it Must be in Between 1-100");
			
		}else {
			customer=searchCustomerDAO.getCustomerById(cutomer_id);
		}
		
		return customer;
	}

}
