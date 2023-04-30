package main.java.com.solvd.zoo.Animals;

import main.java.com.solvd.zoo.Ticket.TicketInfo;

public abstract class Exhibitions implements TicketInfo {
  private String exhibitionName;

  public String getExhibitionName() {
      return exhibitionName;
  }

  public void setExhibitionName(String exhibitionName) {
      this.exhibitionName = exhibitionName;
  }

  @Override
  public void displayTicketInfo() {
      System.out.println("Exhibition Name: " + getExhibitionName());
  }
}
