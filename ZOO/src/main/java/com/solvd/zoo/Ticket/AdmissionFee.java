package main.java.com.solvd.zoo.Ticket;

public class AdmissionFee extends Members{
  public double regularRate;
  public double seniorRate;
  public double childrenRate;
  private double membersRate;

  public AdmissionFee() {
  }

  public AdmissionFee(double regularRate, double seniorRate, double childrenRate) {
    this.regularRate = regularRate;
    this.seniorRate = seniorRate;
    this.childrenRate = childrenRate;
  }

  public double getMembersRate() {
    return membersRate;
  }
  public void setMembersRate(double membersRate)  {
    this.membersRate = membersRate;
  }
}
