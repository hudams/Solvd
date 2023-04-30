package main.java.com.solvd.zoo.Ticket;

public class ParkingFee extends Members implements TicketInfo {
    private double fee;

    public ParkingFee() {
    }

    public ParkingFee(String name, int age, char sex, boolean isMember, double fee) {
        super(name, age, sex, isMember);
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public void displayTicketInfo() {
        System.out.println("Parking fee: $" + fee);
    }
}