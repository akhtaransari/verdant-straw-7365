package com.masai.verdant_straw_7365.UI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import com.masai.verdant_straw_7365.DTO.*;
import com.masai.verdant_straw_7365.DTO.Package;
import com.masai.verdant_straw_7365.Services.*;

public class ConsoleUI {
	
	
	static Scanner sc = new Scanner(System.in);
	static ToursAndTravelsPackageManagementImple imple = new ToursAndTravelsPackageManagementImple();
	static UserImpl userImpl = new UserImpl();
	static BusImple busImple = new BusImple();
	  

   
    static void displayMainMenu() {
    		System.out.println("|---------------------------------------|");
    		System.out.println("|======= Welcome to Voyage Vista =======|");
    		System.out.println("|---------------------------------------|");
    		System.out.println("|==== Online Trip Management System ====|");
    		System.out.println("|1. Admin Login                         |"); // Completed
    		System.out.println("|2. Customer Login                      |"); // Completed
    		System.out.println("|3. Customer Registration               |"); // Completed
    		System.out.println("|0. Exit                                |"); // Completed
    		System.out.println("|========= Enter your choice : =========|");
    		System.out.println("|---------------------------------------|");
    }

    static void displayAdminMenu() {

        int choice;
        do {
            System.out.println("|---------------------------------------|");
            System.out.println("|============= Admin Menu: =============|");
            System.out.println("|1. User Management                     |"); // Completed
            System.out.println("|2. Tours/Travels Package Management    |"); // Completed
            System.out.println("|3. Route and Bus Management            |"); // Completed
            System.out.println("|4. Ticket and Hotel Booking Management |");
            System.out.println("|5. View Reports                        |");
            System.out.println("|6. Logout                              |"); // Completed
            System.out.println("|========= Enter your choice : =========|");
            System.out.println("|---------------------------------------|");
            choice  = sc.nextInt();
                 if (choice == 1) userManagment();
            else if (choice == 2) ToursAndTravelsPackageManagement();
            else if (choice == 3) busManagmentUI();
            

		} while (choice != 6);{
	        System.out.println("|---------------------------------------|");
	        System.out.println("|========= Log out Succesfully =========|");
	        System.out.println("|---------------------------------------|");
		}
    }
    
    static void busManagmentUI() {
    	int choice;
        do {
            System.out.println("|---------------------------------------|");
            System.out.println("|1. Add Bus                             |"); // Completed
            System.out.println("|2. Delete Bus                          |"); // Completed
            System.out.println("|3. Add Route                           |"); // Completed
            System.out.println("|4. Delet Route                         |"); // Completed
            System.out.println("|5. View Buses							|"); // Completed
            System.out.println("|6. View Routes                         |"); // Completed
            System.out.println("|7. Logout                              |"); // Completed
            System.out.println("|========= Enter your choice : =========|");
            System.out.println("|---------------------------------------|");
            choice  = sc.nextInt();
                 if (choice == 1) addBusUI(); 
            else if (choice == 2) deleteBusUI();
            else if (choice == 3) addRouteUI();
            else if (choice == 4) deletRouteUI();
            else if (choice == 5) viewBusesUI();
            else if (choice == 6) viewRoutesUI();
                 

 		} while (choice != 7);{
 	        System.out.println("|---------------------------------------|");
 	        System.out.println("|========= Log out Succesfully =========|");
 	        System.out.println("|---------------------------------------|");
 		}
		
	}

	static void viewBusesUI() {
		busImple.viewBuses().forEach(System.out::println);
	}

	static void viewRoutesUI() {
		busImple.viewRoutes().forEach(System.out::println);
	}

	static void deletRouteUI() {
		System.out.println("Enter route ID");
		System.out.println(busImple.deleteRoute(sc.nextInt()) == true ? "Route Deleted" : "No Route Found");
	}

	static void addRouteUI() {
		System.out.println("Enter Route From");
	    String routeFrom = sc.next();
	    System.out.println("Enter Route to");
	    String routeTo = sc.next();
	    System.out.println("Enter Departure Date in ex'2023-05-07T10:30:00' ");
	    LocalDateTime departureTime = LocalDateTime.parse(sc.next());
	    System.out.println("Enter Arrival Date in ex'2023-05-07T10:30:00' ");
	    LocalDateTime arrivalDateTime = LocalDateTime.parse(sc.next());
	    System.out.println("Enter  Date of Journey ex'2023-05-07'");
	    LocalDate dateOfJourny = LocalDate.parse(sc.next());
	    System.out.println("Enter Pickup Point");
	    String pickupPoint = sc.next();
	    System.out.println("Enter Fare Price");
	    double fare  = sc.nextDouble();
	    
	    
	    System.out.println(busImple.addRoute(new Route(routeFrom, routeTo, departureTime, arrivalDateTime, dateOfJourny, pickupPoint, fare))
	    		== true ? "Bus Added" : "Bus Already Added");
	    
		
	}

	static void deleteBusUI() {
		System.out.println("Enter Bus ID");
		System.out.println(busImple.deleteBus(sc.nextInt()) == true ? "Bus Deleted" : "No BusFound");
	}

	static void addBusUI() {
		System.out.println("Enter Bus Type");
		String busType = sc.next();
		System.out.println("Enter Bus Number");
	    String busNumber = sc.next();
	    System.out.println("Enter Bus Capacity");
	    int busCapacity = sc.nextInt();
	    System.out.println(busImple.addBus(new Bus(busType, busNumber, busCapacity)) == true ? "Bus added" : "Bus already added");

	}

	static void userManagment(){
	   int choice;
       do {
           System.out.println("|---------------------------------------|");
           System.out.println("|============= Admin Menu: =============|");
           System.out.println("|1. Create User                         |"); // Completed
           System.out.println("|2. Delete User                         |"); // Completed
           System.out.println("|3. Get Customer Details BY ID          |"); // Completed
           System.out.println("|4. Get All Customer Details            |"); // Completed
           System.out.println("|5. Update User Details                 |"); // Completed
           System.out.println("|6. Logout                              |"); // Completed
           System.out.println("|========= Enter your choice : =========|");
           System.out.println("|---------------------------------------|");
           choice  = sc.nextInt();
                if (choice == 1) registerCustomerUI();
           else if (choice == 2) deleteCustomerUI();
           else if (choice == 3) getCustomerUI();
           else if (choice == 4) getAllUser();
           else if (choice == 5) updateCustomerUI();
                

		} while (choice != 6);{
	        System.out.println("|---------------------------------------|");
	        System.out.println("|========= Log out Succesfully =========|");
	        System.out.println("|---------------------------------------|");
		}
   }

    static void getAllUser() {
    	userImpl.findAll().forEach(System.out::println);
		
	}

	static void updateCustomerUI() {
    	
		System.out.println("Enter new password");
	    String customerPassword = sc.next();
	    sc.nextLine();
	    System.out.println("Enter new  Address");
	    String address = sc.nextLine();
	    System.out.println("Enter new Mobile");
		String mobile = sc.next();
		System.out.println("Enter new Email");
	    String email = sc.next();
	    System.out.println(userImpl.update(new Customer(customerPassword, address, mobile, email)) == true ? "User UPdated" : "No Userfound");
	    
    }

	static void getCustomerUI() {
    	System.out.println("Enter User/Customer ID");
    	System.out.println(userImpl.findById(sc.nextInt()));

    }

	static void deleteCustomerUI() {
	System.out.println("Enter User/Customer ID");
	System.out.println(userImpl.delete(sc.nextInt()) == true ? "User Delted" : "User not found");
	
	
}

	static void ToursAndTravelsPackageManagement() {
    	
    	int choice;
    	do {
        	System.out.println("|---------------------------------------|");
            System.out.println("|============= User Menu: ==============|");
    		System.out.println("|1.Create Package                       |"); // Completed
    		System.out.println("|2.Delete Package						|"); // Completed
    		System.out.println("|3.Create Tarvels						|"); // Completed
    		System.out.println("|4.Delete Travels						|"); // Completed
    		System.out.println("|0.Exit    								|"); // Completed
        	System.out.println("|---------------------------------------|");
             		
    		choice = sc.nextInt();
    			 if (choice == 1) createpackgeUI();
    		else if (choice == 2) deletePackageUI();
    		else if (choice == 3) createTravelsUI();
    		else if (choice == 4) deleteTravelsUI();
		} while (choice !=0);
		
	}

	static void deleteTravelsUI() {
		System.out.println("Enter Travels ID");
		System.out.println(imple.deleteTravels(sc.nextInt()) == true ? "Travels Deleted" : "No Travels Found");
		
	}

	static void createTravelsUI() {
		
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

	static void deletePackageUI() {
		System.out.println("Enter Package ID");
		System.out.println(imple.deleteTravels(sc.nextInt()) == true ? "Package Deleted" : "No Package Found");
		
	}

	static void createpackgeUI() {
		
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
            System.out.println("|8. View Package 			            |");
            System.out.println("|9. View Travles						|");
            System.out.println("|10.View Buses							|");
            System.out.println("|========= Enter your choice : =========|");
            System.out.println("|---------------------------------------|");
            input = sc.nextInt();
            
                 if (input == 1)  viewRoutesUI();
            else if (input == 10) viewBusesUI();
            else if (input == 8); bookTicketUI();
            
            
        } while (input != 0);
        	System.out.println("|---------------------------------------|");
        	System.out.println("|========= Log out Succesfully =========|");
        	System.out.println("|---------------------------------------|");
    }
    
    static void bookTicketUI() {
    	
		
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

	static void registerCustomerUI() {
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
	    System.out.println("User Created");
	    
		
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
}
