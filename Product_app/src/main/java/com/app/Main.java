package com.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.app.exception.BusinessException;
import com.app.model.Customer;
import com.app.model.Product;
import com.app.service.AddCustomerService;
import com.app.service.CustomerLoginService;
import com.app.service.ProductAddService;
import com.app.service.ProductViewService;
import com.app.service.SearchCustomerService;
import com.app.service.impl.AddCustomerServiceImpl;
import com.app.service.impl.CustomerLoginServiceImpl;
import com.app.service.impl.ProductAddServiceImpl;
import com.app.service.impl.ProductViewServiceImpl;
import com.app.service.impl.SearchCustomerServiceImpl;

public class Main {

	private static Logger log = Logger.getLogger(Main.class);

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int ch = 0;
		do {
		log.info("\n Welcome To Reliable Online shopping Menu Driven Console Based App ");
		log.info("========================================================================");

		
			log.info(" ________________________________");
			log.info("|1) login as customer            |");
			log.info("|2) Login as Employee            |");
			log.info("|3) New User.? Register yourself |");
			log.info("|4) Exit                         |");
			log.info("|________________________________|");
		
			log.info("Please enter your choice Between (1-4)");

			try {
				ch = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				log.warn("Choice must be Integer only");
			}

			switch (ch) {
			case 1:
				CustomerLoginService customerLoginService =new CustomerLoginServiceImpl();
				log.info("Enter your Email");
				String email=scanner.nextLine();
			
					log.info("Enter your password");
					String password=scanner.nextLine();
			
				Customer customer;
				try {
					customer = customerLoginService.isValidCustomer(email, password);
					if(customer!=null) {
						

				
						log.info("\n Logged in Succesfulluy");
						
						int t=0;
						do {
						log.info("\n   Welcome to Main Menu of App");
						log.info("=========================================");
						log.info("|1) View Products           |");
						log.info("|2) Go to MY Cart           |");
						log.info("|3) View My Order           |");
						log.info("|4) Logout                  |");
						log.info("|___________________________|");
						log.info(" Enter your choice  ");
						try {
						t=Integer.parseInt(scanner.nextLine());
						}catch(NumberFormatException e) {
							log.warn("Invalid choice choose between 1-4");
							
						}
						switch (t) {
						case 1:ProductViewService productViewService=new ProductViewServiceImpl();
							try {
								List<Product> productlist=productViewService.getAllProducts();
								if(productlist!=null && productlist.size()>0) {
									log.info("\nList of Products Are listed Below...");
								for(Product p:productlist) {
									
									log.info(p);
								}
								int r=0;
								do {
								log.info(" \n 1) Add product to Cart");
								log.info(" \n 2) Exit to Maine Menu ");
							
								log.info(" \n  Choose the Option     ");
								r=Integer.parseInt(scanner.nextLine());
								switch (r) {
								case 1:
									
									break;
case 2:
	log.info("\n We will See You Again");
									
									break;

								default:
									log.info("Invalid Choice Please Enter a Valid Choice ");
									break;
								}
								
								
								
								}while(r!=0);
								
								
								
								}
							} catch (BusinessException e) {
								log.warn(e.getMessage());
							}
							
							
							break;

case 2:
	  log.info("\n       Welcome to the Cart ");
	  log.info("========================================");
	  
							
							break;
case 3:
	
	break;
	
case 4:
	log.info("Logout Successfully");
	break;
						default:
							log.info("Invalid Choice Enter number Between 1-4");
							break;
						}
						
						
						}while(t!=4);
					
						
//					}else {
//						log.info("Invalid Password");
//					}
//					
//					
//				}else {
//					log.info("Invalid Email ID");
	//======================================================
						
				}
} catch (BusinessException e1) {
	log.warn("Invalid Email Id or Password");
					
				}
				

				break;
			case 2:
				log.info("Enter Employee Id");
				try {
				int eid=Integer.parseInt(scanner.nextLine());
			
				if (eid==2313) {
					log.info("Enter your password");
					String Epassword=scanner.nextLine();
					if(Epassword.matches("[a-zA-Z]{4,10}[0-9]{3,10}")) {
						int z=0;
						do {
						log.info("\n                Welcome to Employee Menu        ");
						log.info(" ==========================================================");
						log.info("|1) Add a New Product                 |");
						log.info("|2) Search Existing Customer          |");
						log.info("|3) Logout                            |");
						log.info("_______________________________________");
						log.info("         Enter your choice             ");
						try {
						z=Integer.parseInt(scanner.nextLine());
					
						}catch(NumberFormatException e) {
							log.warn("\n Invalid choice Enter Integer only ");
						}
						switch (z) {
						case 1:
							Product product=new Product();
							log.info("Enter Product Name");
					//		String productName=scanner.nextLine();
						product.setProductName(scanner.nextLine());
							
							log.info("Enter Product Price ");
							//double productPrice=Double.parseDouble(scanner.nextLine());
					   product.setProductPrice(Double.parseDouble(scanner.nextLine()));
							ProductAddService productAddService=new ProductAddServiceImpl();
							
						int o=0;
								
							try {
								o=productAddService.addProduct(product);
								if (o!=0) {
									log.info("Product added succesfully");
								
							
									}
							} catch (BusinessException e) {
								log.warn("Invalid Entry");
							}
								
							break;

case 2:
	SearchCustomerService searchCustomerService=new SearchCustomerServiceImpl();
	    log.info("\nEnter the Customer_id");
	    int b=Integer.parseInt(scanner.nextLine());
	    Customer customer1=searchCustomerService.getCustomerById(b);
	  
	    if (customer1!=null) {
	    	  log.info("Details of Customer Is listed below");
	    	log.info(customer1);
	    }
	    
	    
							
							break;
							
case 3:
	   log.info("\n Logout Succesfully ");
	break;
						default:
							log.info("Invalid Choice Choice must be Between 1-3");
							break;
						}
						}while(z!=3);
					}
					
				}else {
					log.info("Invalid Employee Id Please Enter The Correct Employee Id");
				}
				}catch(NumberFormatException e) {
					log.warn("Invalid Employee Id It must be Integer");
				} catch (BusinessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
				
				
				
			case 3:
				Customer c=new Customer();
				log.info("\n Enter your Name ");
				c.setName(scanner.nextLine());
				
					log.info("\n Enter Your Email");
					c.setEmail(scanner.nextLine());

					log.info("\n Set Password ");
					c.setPassword(scanner.nextLine());
					AddCustomerService addCustomerService= new AddCustomerServiceImpl();
					int w=0;
				try {
					w=addCustomerService.addCustomer(c);
					if (w!=0) {
						log.info("Registered Successfully");
					}
				} catch (BusinessException e) {
					log.warn(e.getMessage());
				}
				
				
				break;
			case 4:
				
				log.info("\n    Thanks For using this App We'll See you soon   ");

				break;
		
	

			default:
				log.warn("Invalid choice... Choice should be only number between 1-4 only ");
				break;
			}

		} while (ch != 4);

	}

}