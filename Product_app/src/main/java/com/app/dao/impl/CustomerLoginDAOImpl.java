package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

import com.app.dao.CustomerLoginDAO;
import com.app.dao.util.MySqlDbConnection;
import com.app.exception.BusinessException;
import com.app.model.Customer;

public class CustomerLoginDAOImpl implements CustomerLoginDAO {
	private static Logger log = Logger.getLogger(CustomerLoginDAOImpl.class);
    
	@Override
	public Customer isValidCustomer(String email, String password) throws BusinessException {
		Customer customer=null;
		
		try(Connection connection=MySqlDbConnection.getConnection()){
		
			String sql="Select name, email, password where email='?' and password='?'";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
			ResultSet resultSet=preparedStatement.executeQuery();
			if (resultSet.next()) {
				 customer =new Customer();
//				customer.setCustomer_id(resultSet.getInt("customer_id"));
				customer.setEmail(resultSet.getString("email"));
				customer.setName(resultSet.getString("name"));
				customer.setPassword(resultSet.getString("password"));
				
				log.info("Login Success");
			}else {
				log.info("Login Failed Invalid Credential");
			}
		
		
		
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		return customer;
	}
	

}
