package lk.icet.burger_shop.model;

public class Customer {

    private int CustomerId;
    private String CustomerName;
    private double total;

    public Customer() {
    }

    public Customer(int customerId, String customerName, double total) {
        CustomerId = customerId;
        CustomerName = customerName;
        this.total = total;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
