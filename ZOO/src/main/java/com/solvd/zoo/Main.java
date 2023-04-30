package main.java.com.solvd.zoo;

import main.java.com.solvd.zoo.Animals.Birds;
import main.java.com.solvd.zoo.Animals.Fish;
import main.java.com.solvd.zoo.Animals.Mammals;
import main.java.com.solvd.zoo.Animals.Reptiles;
import main.java.com.solvd.zoo.Ticket.TicketInfo;
import main.java.com.solvd.zoo.Ticket.ParkingFee;
import main.java.com.solvd.zoo.Ticket.Payment;
import main.java.com.solvd.zoo.Ticket.Admission;
import main.java.com.solvd.zoo.VisitorsInfo.Visitors;

public class Main {
  public static void main(String[] args) {
    Visitors visitor = new Visitors("John Doe", (byte) 15, 'M');
    visitor.setMember(false);

    Admission admission = new Admission();
    admission.checkAdmission();

    TicketInfo[] tickets = { new ParkingFee("John Doe", 15, 'M', false, 5.0),
    new Payment("John Doe", (byte) 15, 'M', 25.0, 1234567890123456L, "123 Main St") };

    for (TicketInfo ticket : tickets) {
    ticket.displayTicketInfo();
    }

    Birds birds = new Birds();
    Fish fish = new Fish();
    Mammals mammals = new Mammals();
    Reptiles reptiles = new Reptiles();

    TicketInfo[] exhibitions = {birds, fish, mammals, reptiles};
    for (TicketInfo exhibition : exhibitions) {
      exhibition.displayTicketInfo();
      }
    }
}
