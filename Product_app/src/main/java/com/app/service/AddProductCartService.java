package com.app.service;

import com.app.exception.BusinessException;

public interface AddProductCartService {
 
	public int addProductToCart(int id ,int Customer_id) throws BusinessException;
}
