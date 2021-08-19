package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

import com.app.dao.ProductAddDAO;
import com.app.dao.util.MySqlDbConnection;
import com.app.exception.BusinessException;
import com.app.model.Product;

public class ProductAddDAOImpl implements ProductAddDAO{
	private static Logger log = Logger.getLogger(ProductAddDAO.class);

	@Override
	public int addProduct( Product product ) throws BusinessException {
		int c=0;
		try(Connection connection=MySqlDbConnection.getConnection()){
		//	Product product1=new Product();
			String sql="insert into product(productName, productPrice) values (?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, product.getProductName());
			preparedStatement.setDouble(2, product.getProductPrice());
			c=preparedStatement.executeUpdate();
			if (c==1) {
				ResultSet resultset=preparedStatement.getGeneratedKeys();
				if (resultset.next()) {
					product.setId(resultset.getInt(1));
				}
			}
		
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		return c;
	}

	@Override
	public int addProduct(String productName, double productPrice) throws BusinessException {
		// TODO Auto-generated method stub
		return 0;
	}

	
	

}
