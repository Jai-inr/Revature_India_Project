package com.app.dao.testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.app.dao.AddCustomerDAO;
import com.app.dao.CustomerLoginDAO;
import com.app.dao.ProductAddDAO;
import com.app.dao.SearchCustomerDAO;
import com.app.dao.impl.AddCustomerDAOImpl;
import com.app.dao.impl.CustomerLoginDAOImpl;
import com.app.dao.impl.ProductAddDAOImpl;
import com.app.dao.impl.SearchCustomerDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Customer;
import com.app.model.Product;


class TestApp {
	
	private static Logger log = Logger.getLogger(TestApp.class);
	static ProductAddDAO productAddDAO=new ProductAddDAOImpl();
	static AddCustomerDAO addCustomerDAO=new AddCustomerDAOImpl();
	static CustomerLoginDAO customerloginDAO=new CustomerLoginDAOImpl();
	static SearchCustomerDAO searchCustomerDAO=new SearchCustomerDAOImpl();
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		log.info("Before all");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		log.info("After all ()");
	}

	@BeforeEach
	void setUp() throws Exception {
		log.info("Before Each()");
	}

	@AfterEach
	void tearDown() throws Exception {
		log.info("After Each");
	}

	@Test
	void testAddproduct() throws BusinessException {
		Product product=new Product();
		product.setId(12);
		product.setProductName("jai");
		product.setProductPrice(4000.0);
		
			assertEquals(1, productAddDAO.addProduct(product), "Test fails");
	}
	
	@Test
	void testAddCustomer() throws BusinessException {
		Customer customer=new Customer();
		customer.setCustomer_id(2);
		customer.setEmail("jai@gmail.com");
		customer.setName("jai");
		customer.setPassword("jai1213");
		
         assertEquals(1, addCustomerDAO.addCustomer(customer));		
		
	}
	
	@Test
	void testIsvalidCustomer() throws BusinessException {
		
		Customer customer1=new Customer(1,"jai Yadav","jai@gmail.com","Asdsf13124");
		assertEquals(customer1, customerloginDAO.isValidCustomer("jai@gmail.com", "Asdsf13124"),"Test Case Failed");
		
	}
	
	@Test
	void testSearchCustomer() throws BusinessException {
		Customer customer2=new Customer(1,"jai Yadav","jai@gmail.com","Asdsf13124");
		assertEquals(customer2, searchCustomerDAO.getCustomerById(1));
		
	}
	
	
}



























