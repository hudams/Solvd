package main.java.com.solvd.zoo.Ticket;

public class Payment {
    private String name;
    private double totalAmount;
    private long cardNumber;
    private String address;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    public long getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
