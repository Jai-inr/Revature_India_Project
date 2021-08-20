package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.app.dao.SearchCustomerDAO;
import com.app.dao.util.MySqlDbConnection;
import com.app.exception.BusinessException;
import com.app.model.Customer;

public class SearchCustomerDAOImpl implements SearchCustomerDAO{
	private static Logger log = Logger.getLogger(SearchCustomerDAOImpl.class);
	@Override
	public Customer getCustomerById(int cutomer_id) throws BusinessException {
		// TODO Auto-generated method stub
		
		
		
			Customer customer=null;
			try(Connection connection=MySqlDbConnection.getConnection()){
				String sql="select customer_id, name, email, password from customer where customer_id=?";
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				preparedStatement.setInt(1, customer.getCustomer_id());
				ResultSet resultSet=preparedStatement.executeQuery();
				if(resultSet.next()) {
					customer=new Customer();
					customer.setCustomer_id(resultSet.getInt("customer_id"));
					customer.setEmail(resultSet.getString("email"));
					customer.setName(resultSet.getString("name"));
					customer.setPassword(resultSet.getString("password"));
					
					
				
				}else {
					throw new BusinessException("Entered Customer id doesnt exist");
				}
			} catch (ClassNotFoundException | SQLException e) {
				log.error(e);
				throw new BusinessException("Internal error occured contact sysadmin");
			}
		
		
		
		
		return customer;
	}

}
