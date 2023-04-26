package main.java.com.solvd.zoo.VisitorsInfo;

import main.java.com.solvd.zoo.Ticket.Members;

public class Visitors extends Members {
  private double height;

  public Visitors() {
    super();
  }

  public Visitors(String name, int age, char sex, double height, boolean isMember) {
    super(name, age, sex, isMember);
    this.height = height;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  // name, age, sex, isMember
}


