package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

import com.app.dao.AddProductCartDAO;
import com.app.dao.util.MySqlDbConnection;
import com.app.exception.BusinessException;
import com.app.model.Customer;


public class AddProductCartDAOImpl implements AddProductCartDAO {
	
	private static Logger log = Logger.getLogger(AddProductCartDAOImpl.class);

	@Override
	public int addProductToCart(int id, int Customer_id) throws BusinessException {
		int c=0;
		try(Connection connection=MySqlDbConnection.getConnection()){
		//	Product product1=new Product();
			String sql="insert into cart(product_id, customer_id) values (?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setInt(1, id);
			preparedStatement.setInt(2, Customer_id);
			c=preparedStatement.executeUpdate();
			if (c==1) {
				ResultSet resultset=preparedStatement.getGeneratedKeys();
				if (resultset.next()) {
					Customer customer=new Customer();
					customer.setCustomer_id(resultset.getInt(1));
				}
			}
		
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		return c;
	}

}
