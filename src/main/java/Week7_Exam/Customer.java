package Week7_Exam;

public class Customer {
    private String Name;
    private String CustomerID, Email, PhoneNo;
    public Customer(String name, String customerID, String email, String phoneNum) {
        Name = name;
        CustomerID = customerID;
        Email = email;
        PhoneNo = phoneNum;
    }
    public String getName() {
        return Name;
    }
    public String getCustomerID() {
        return CustomerID;
    }
    public String getEmail() {
        return Email;
    }
}
