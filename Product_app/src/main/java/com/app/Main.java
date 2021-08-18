package com.app;

import java.util.Scanner;

import org.apache.log4j.Logger;

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
				log.info("Enter your Email");
				String email=scanner.nextLine();
				if (email.matches("[a-zA-Z]{}"))
				

				break;
			case 2:
				log.info("Enter Employee Id");
				try {
				int eid=Integer.parseInt(scanner.nextLine());
				
				if (eid==2313) {
					log.info("Enter your password");
					String password=scanner.nextLine();
					if(password.matches("[a-zA-Z]{4,10}[0-9]{3,10}")) {
						int z=0;
						do {
						log.info("\n Welcome to Employee Menu ");
						log.info("===============================");
						log.info("|1) Add a New Product                 |");
						log.info("|2) Search Existing Customer          |");
						log.info("|3) Logout                            |");
						log.info("_______________________________________");
						log.info("Enter your choice");
						try {
						z=Integer.parseInt(scanner.nextLine());
					
						}catch(NumberFormatException e) {
							log.warn("\n Invalid choice Enter Integer only ");
						}
						switch (z) {
						case 1:
							
							
							break;

case 2:
							
							break;
							
case 3:
	   log.info("\n Logging out ");
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
					log.warn("Employee Id Must be Integer of Four Digit");
				}

				break;
			case 3:
				log.info("Under Construction");

				break;
			case 4:
				log.info("Thanks For using this We'll See you soon");

				break;
		
	

			default:
				log.warn("Invalid choice... Choice should be only number between 1-4 only ");
				break;
			}

		} while (ch != 4);

	}

}