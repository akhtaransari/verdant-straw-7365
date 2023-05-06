package com.masai.verdant_straw_7365.UI;

import java.util.Scanner;
import com.masai.verdant_straw_7365.DTO.*;
import com.masai.verdant_straw_7365.DTO.Package;
import com.masai.verdant_straw_7365.Services.*;

public class ConsoleUI {
    static Scanner sc = new Scanner(System.in);
    static ToursAndTravelsPackageManagementImple imple = new ToursAndTravelsPackageManagementImple();
    
    static void displayMainMenu() {
    		System.out.println("|---------------------------------------|");
    		System.out.println("|======= Welcome to Voyage Vista =======|");
    		System.out.println("|---------------------------------------|");
    		System.out.println("|==== Online Trip Management System ====|");
    		System.out.println("|1. Admin Login                         |");
    		System.out.println("|2. Customer Login                      |");
    		System.out.println("|3. Customer Registration               |"); // Completed
    		System.out.println("|0. Exit                                |");
    		System.out.println("|========= Enter your choice : =========|");
    		System.out.println("|---------------------------------------|");
    }

    static void displayAdminMenu() {

        int choice;
        do {
            System.out.println("|---------------------------------------|");
            System.out.println("|============= Admin Menu: =============|");
            System.out.println("|1. User Management                     |");
            System.out.println("|2. Tours/Travels Package Management    |");
            System.out.println("|3. Route and Bus Management            |");
            System.out.println("|4. Ticket and Hotel Booking Management |");
            System.out.println("|5. View Reports                        |");
            System.out.println("|6. Logout                              |");
            System.out.println("|========= Enter your choice : =========|");
            System.out.println("|---------------------------------------|");
            choice  = sc.nextInt();
            
            if (choice == 2) ToursAndTravelsPackageManagement();
            // Based on choice invoke function from Implements Package !
		} while (choice != 6);{
	        System.out.println("|---------------------------------------|");
	        System.out.println("|========= Log out Succesfully =========|");
	        System.out.println("|---------------------------------------|");
		}
    }

    private static void ToursAndTravelsPackageManagement() {
    	
    	int choice;
    	do {
        	System.out.println("|---------------------------------------|");
            System.out.println("|============= User Menu: ==============|");
    		System.out.println("|1.Create Package                       |");
    		System.out.println("|2.Delete Package						|");
    		System.out.println("|3.Create Tarvels						|");
    		System.out.println("|4.Delete Travels						|");
    		System.out.println("|0.Exit    								|");
        	System.out.println("|---------------------------------------|");
             		
    		choice = sc.nextInt();
    			 if (choice == 1) createpackgeUI();
    		else if (choice == 2) deletePackageUI();
    		else if (choice == 3) createTravelsUI();
    		else if (choice == 4) deleteTravelsUI();
		} while (choice !=0);
		
	}

	private static void deleteTravelsUI() {
		System.out.println("Enter Travels ID");
		System.out.println(imple.deleteTravels(sc.nextInt()) == true ? "Travels Deleted" : "No Travels Found");
		
	}

	private static void createTravelsUI() {
		
		System.out.println("Enter travels Name");
		sc.nextLine();
		String travelsName = sc.nextLine();
		System.out.println("Enter agent name");
		sc.nextLine();
		String agentName  = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter Address");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.println("Enter Contact Number");
		String contact= sc.next();
		imple.createTravels(new Travels(travelsName, agentName, address, contact));
		
	}

	private static void deletePackageUI() {
		System.out.println("Enter Package ID");
		System.out.println(imple.deleteTravels(sc.nextInt()) == true ? "Package Deleted" : "No Package Found");
		
	}

	private static void createpackgeUI() {
		
		System.out.println("Enter Package Name");
		String packageName = sc.next();
		System.out.println("Enter Package Description");
		sc.nextLine();
	    String packageDescription = sc.nextLine();
	    System.out.println("Eneter Package Type");
	    String packageType = sc.next();
	    System.out.println("Enter Package Cost");
	    double packageCost = sc.nextDouble();
	    
	    
	    imple.createPackage(new Package(packageName, packageDescription, packageType, packageCost));
	    
	    
		
	}

	static void displayUserMenu() {
        int input;
        do {
        	System.out.println("|---------------------------------------|");
            System.out.println("|============= User Menu: ==============|");
            System.out.println("|1. View Routes                         |");
            System.out.println("|2. View Tours/Travels Packages         |");
            System.out.println("|3. Book Tickets                        |");
            System.out.println("|4. Print Tickets                       |");
            System.out.println("|5. Cancel Tickets                      |");
            System.out.println("|6. Make Payment                        |");
            System.out.println("|7. Provide/View Testimonials           |");
            System.out.println("|8. Logout                              |");
            System.out.println("|========= Enter your choice : =========|");
            System.out.println("|---------------------------------------|");
            // Based on choice invoke function from Implements Package !        	
            input = sc.nextInt();
            if (input != 8) 
            System.out.println("|---------------------------------------|");
            System.out.println("|=== Wrong Input Provided Enter Again ==|");
            System.out.println("|---------------------------------------|");	
            
        } while (input != 8);
        	System.out.println("|---------------------------------------|");
        	System.out.println("|========= Log out Succesfully =========|");
        	System.out.println("|---------------------------------------|");
    }
    
    static void adminLoginUI() {
    	System.out.println("|---------------------------------------|");
    	System.out.println("|========= Enter Admin Username ========|");
    	System.out.println("|---------------------------------------|");
    	String usernameString = sc.next();
    	
    	System.out.println("|---------------------------------------|");
    	System.out.println("|========= Enter Admin Password ========|");
    	System.out.println("|---------------------------------------|");
    	String passwordString = sc.next();
    	
    	
    	AuthorizationImple imple = new AuthorizationImple();
    	if (imple.AdminAuthorization(usernameString, passwordString) == true) {
    		displayAdminMenu();
    	}else {
    		System.out.println("Wrong customer id or password");
    	}
    } 
    
    
    static void userLoginUI() {
    	System.out.println("|---------------------------------------|");
    	System.out.println("|========= Enter User Username ========|");
    	System.out.println("|---------------------------------------|");
    	String usernameString = sc.next();
    	
    	System.out.println("|---------------------------------------|");
    	System.out.println("|========= Enter User Password ========|");
    	System.out.println("|---------------------------------------|");
    	String passwordString = sc.next();
    	AuthorizationImple imple =new AuthorizationImple();
    	int a = imple.userAuthorization(usernameString, passwordString);
    	
    	if (a == -2) {
    		System.out.println("no such user found");
    	}else if (a == -1) {
    		System.out.println("Wrong customer id or password");
    	}else if (a != -1 && a != -2){
    		displayUserMenu();
    	}
    	
    }
    

    public static void voyageVista() {
        
        int choice;
        do {
        	displayMainMenu();
            choice = sc.nextInt();
            if (choice == 1) adminLoginUI();    
            else if (choice == 2) userLoginUI();	
            else if (choice == 3) registerCustomerUI();
        } while (choice != 0);{
            System.out.println("|---------------------------------------|");
            System.out.println("|=== ThankYou for Using Voyage Vista ===|");
            System.out.println("|---------------------------------------|");
        }
    }

	private static void registerCustomerUI() {
		System.out.println("Enter Unique Username");
		String customerUsername = sc.next();
		System.out.println("Enter Unique password");
	    String customerPassword = sc.next();
	    sc.nextLine();
	    System.out.println("Enter Customer Address");
	    String address = sc.nextLine();
	    System.out.println("Enter Customer Mobile");
		String mobile = sc.next();
		System.out.println("Enter Customer Email");
	    String email = sc.next();
	    
	    
	    UserImpl userImpl = new UserImpl();
	    userImpl.save(new Customer(customerUsername, customerPassword, address, mobile, email));
	    
		
	}
}
