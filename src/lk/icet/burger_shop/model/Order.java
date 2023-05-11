package lk.icet.burger_shop.model;

public class Order {
    private String OrderId;
    private int CustId;
    private String custName;
    private int bugQty;
    private String status;
    private double billValue;

    public Order() {
    }

    public Order(String orderId, int custId, String custName, int bugQty, String status, double billValue) {
        OrderId = orderId;
        CustId = custId;
        this.custName = custName;
        this.bugQty = bugQty;
        this.status = status;
        this.billValue = billValue;
    }

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    public int getCustId() {
        return CustId;
    }

    public void setCustId(int custId) {
        CustId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public int getBugQty() {
        return bugQty;
    }

    public void setBugQty(int bugQty) {
        this.bugQty = bugQty;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getBillValue() {
        return billValue;
    }

    public void setBillValue(double billValue) {
        this.billValue = billValue;
    }
}
