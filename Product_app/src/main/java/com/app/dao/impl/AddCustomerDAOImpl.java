package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

import com.app.dao.AddCustomerDAO;
import com.app.dao.util.MySqlDbConnection;
import com.app.exception.BusinessException;
import com.app.model.Customer;


public class AddCustomerDAOImpl implements AddCustomerDAO {
	private static Logger log = Logger.getLogger(AddCustomerDAOImpl.class);

	@Override
	public int addCustomer(Customer customer) throws BusinessException {
		int c=0;
		try(Connection connection=MySqlDbConnection.getConnection()){
			String sql="insert into customer(name, email, password) values (?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, customer.getName());
			preparedStatement.setString(2, customer.getEmail());
			preparedStatement.setString(3, customer.getPassword());
			
			c=preparedStatement.executeUpdate();
			if (c==1) {
				ResultSet resultset=preparedStatement.getGeneratedKeys();
				if (resultset.next()) {
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
