package main.java.com.solvd.zoo.Ticket;

import main.java.com.solvd.zoo.VisitorsInfo.Visitors;

public class Payment extends Visitors implements TicketInfo {
    private double totalAmount;
    private long cardNumber;
    private String address;

    public Payment() {
    }

    public Payment(String name, byte age, char sex, double totalAmount, long cardNumber, String address) {
        super(name, age, sex);
        this.totalAmount = totalAmount;
        this.cardNumber = cardNumber;
        this.address = address;
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

    @Override
    public void displayTicketInfo() {
        System.out.println("Total amount: $" + totalAmount);
        System.out.println("Card number: " + cardNumber);
        System.out.println("Address: " + address);
    }
}