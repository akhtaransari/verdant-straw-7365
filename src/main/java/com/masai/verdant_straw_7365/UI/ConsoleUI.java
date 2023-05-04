package com.masai.verdant_straw_7365.UI;

import java.util.Scanner;

public class ConsoleUI {
    static Scanner sc = new Scanner(System.in);
    
    static void displayMainMenu() {
    		System.out.println("|---------------------------------------|");
    		System.out.println("|======= Welcome to Voyage Vista =======|");
    		System.out.println("|---------------------------------------|");
    		System.out.println("|==== Online Trip Management System ====|");
    		System.out.println("|1. Admin Login                         |");
    		System.out.println("|2. Customer Login                      |");
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
            
            
            
            
            if (choice != 6) 
            System.out.println("|---------------------------------------|");
            System.out.println("|=== Wrong Input Provided Enter Again ==|");
            System.out.println("|---------------------------------------|");
            // Based on choice invoke function from Implements Package !
		} while (choice != 6);{
	        System.out.println("|---------------------------------------|");
	        System.out.println("|========= Log out Succesfully =========|");
	        System.out.println("|---------------------------------------|");
		}
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
    
    static boolean adminLogin() {
    	System.out.println("|---------------------------------------|");
    	System.out.println("|========= Enter Admin Username ========|");
    	System.out.println("|---------------------------------------|");
    	String usernameString = sc.next();
    	
    	System.out.println("|---------------------------------------|");
    	System.out.println("|========= Enter Admin Password ========|");
    	System.out.println("|---------------------------------------|");
    	String passwordString = sc.next();
    	return true;
    } 
    
    
    static boolean userLogin() {
    	System.out.println("|---------------------------------------|");
    	System.out.println("|========= Enter User Username ========|");
    	System.out.println("|---------------------------------------|");
    	String usernameString = sc.next();
    	
    	System.out.println("|---------------------------------------|");
    	System.out.println("|========= Enter User Password ========|");
    	System.out.println("|---------------------------------------|");
    	String passwordString = sc.next();
    	return true;
    }
    

    public static void voyageVista() {
        
        int choice;
        do {
        	displayMainMenu();
            choice = sc.nextInt();
            if (choice == 1) 
            	displayAdminMenu();     //  This Function invoke all the required function for ADMIN Panel
            else if (choice == 2) 
            	displayUserMenu();		//  This Function invoke all the required function for User Panel
            else if (choice != 0) 
            System.out.println("|---------------------------------------|");
            System.out.println("|=== Wrong Input Provided Enter Again ==|");
            System.out.println("|---------------------------------------|");
        } while (choice != 0);{
            System.out.println("|---------------------------------------|");
            System.out.println("|=== ThankYou for Using Voyage Vista ===|");
            System.out.println("|---------------------------------------|");
        }
    }
}
