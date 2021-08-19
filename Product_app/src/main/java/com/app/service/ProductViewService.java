package com.app.service;



import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Product;

public interface ProductViewService {
	
	public List<Product> getAllProducts() throws BusinessException;

}
