package com.app.service.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.app.dao.ProductViewDAO;
import com.app.dao.impl.ProductViewDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Product;
import com.app.service.ProductViewService;

public class ProductViewServiceImpl implements ProductViewService{
	private static Logger log = Logger.getLogger(ProductViewServiceImpl.class);

	ProductViewDAO productViewDAO= new ProductViewDAOImpl();
	@Override
	public List<Product> getAllProducts() throws BusinessException {
		List<Product> productlist=productViewDAO.getAllProducts();
			
		
		
		return productlist;
	}

}
