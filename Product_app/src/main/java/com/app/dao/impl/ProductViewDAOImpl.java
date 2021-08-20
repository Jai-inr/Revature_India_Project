package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;


import com.app.dao.ProductViewDAO;
import com.app.dao.util.MySqlDbConnection;
import com.app.exception.BusinessException;
import com.app.model.Product;

public class ProductViewDAOImpl implements ProductViewDAO {
	private static Logger log = Logger.getLogger(ProductViewDAOImpl.class);


	@Override
	public List<Product> getAllProducts() throws BusinessException {
		
		
		List<Product> productlist= new ArrayList<>();
		try(Connection connection=MySqlDbConnection.getConnection()){
	
			String sql="Select id, productName, productPrice from product";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Product product=new Product();
				product.setId(resultSet.getInt("id"));
				product.setProductName(resultSet.getString("productName"));
				product.setProductPrice(resultSet.getDouble("productPrice"));
			
				productlist.add(product);
			}
		
		
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		
		return productlist;
	}

}
