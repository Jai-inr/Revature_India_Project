package com.app.dao;

import com.app.exception.BusinessException;
import com.app.model.Product;

public interface ProductAddDAO {

	public int  addProduct(String productName, double productPrice) throws BusinessException;

	int addProduct(Product product) throws BusinessException;
}
