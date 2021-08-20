package com.app.service.impl;

import org.apache.log4j.Logger;

import com.app.dao.ProductAddDAO;
import com.app.dao.impl.ProductAddDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Product;
import com.app.service.ProductAddService;

public class ProductAddServiceImpl implements ProductAddService{
	private static Logger log = Logger.getLogger(ProductAddServiceImpl.class);
	ProductAddDAO productAddDAO= new ProductAddDAOImpl();
	@Override
	public int addProduct(Product product) throws BusinessException {
		

		return productAddDAO.addProduct(product);
		
	}

}
