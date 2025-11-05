package Week7_Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManagement {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            ArrayList<Customer> Customer = new ArrayList<>();

            Customer Customer1 = new Customer();
            Customer.add(Customer1);


            for (int i = 0; i >= 0; i++) {
            System.out.println("===== Customer Management System =====\n1) Add Customer\n2) Update Customer\n3) Display All\n4) Exit");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Customer Name: ");
                    Customer1.setName(input.next());
                    System.out.println("Enter Customer Email: ");
                    Customer1.setEmail(input.next());
                    System.out.println("Enter Customer ID: ");
                    Customer1.setCustomerID(input.next());
                    System.out.println("Enter Customer Phone Number: ");
                    Customer1.setPhoneNo(input.next());
                    Customer.add(Customer1);
                    break;

                case 2:
                    System.out.println("Enter Customer ID: ");
                    for (Customer C : Customer) {
                        if (C.getCustomerID().equals(input.next())) {
                            System.out.println("Customer ID: " + C.getCustomerID());
                            System.out.println("Enter Customer Name: ");
                            Customer1.setName(input.next());
                            System.out.println("Enter Customer Email: ");
                            Customer1.setEmail(input.next());
                            System.out.println("Enter Customer ID: ");
                            Customer1.setCustomerID(input.next());
                            System.out.println("Enter Customer Phone Number: ");
                            Customer1.setPhoneNo(input.next());
                            Customer.add(Customer1);
                            System.out.println("Customer updated successfully!");
                            break;

                        } else {
                            System.out.println("Customer hasn't been recorded");
                            break;

                        }
                    }
                case 3:
                    System.out.println("Customer List:");
                    for (Customer C : Customer) {


                    System.out.printf("Customer ID: " + C.getCustomerID() + "\nCustomer Name: "  + C.getName() + "\nEmail:" + C.getEmail() + "\nPhone: " + C.getPhoneNo());}
                    break;
                case 4:
                    System.out.println("Exiting");
                    i = 0;
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;

            }
            }
        }
    }

