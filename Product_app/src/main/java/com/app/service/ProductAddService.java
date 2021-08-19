package com.app.service;

import com.app.exception.BusinessException;
import com.app.model.Product;

public interface ProductAddService {
	
	

	public int addProduct(Product product) throws BusinessException;

	
}
