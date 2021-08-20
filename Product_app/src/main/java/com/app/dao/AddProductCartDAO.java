package com.app.dao;

import com.app.exception.BusinessException;

public interface AddProductCartDAO {

	public int addProductToCart(int id ,int Customer_id) throws BusinessException;
	
	
}
