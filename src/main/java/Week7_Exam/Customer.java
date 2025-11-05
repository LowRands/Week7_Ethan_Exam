package Week7_Exam;

public class Customer {
    private String Name, CustomerID, Email, PhoneNo;

    public void setCustomerID(String customerID) {
        CustomerID = customerID;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public void setPhoneNo(String phoneNum) {
        PhoneNo = phoneNum;
    }
    public void setName(String customerName) {
        Name = customerName;
    }
    public String getPhoneNo() {
        return PhoneNo;
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

    @Override
    public String toString() {
        System.out.printf("Customer ID: " + getCustomerID() + "\nCustomer Name: "  + getName() + "\nEmail:" + getEmail() + "\nPhone: " + getPhoneNo());
        return super.toString();
    }
}
