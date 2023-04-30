package main.java.com.solvd.zoo.Ticket;

import main.java.com.solvd.zoo.VisitorsInfo.Visitors;

enum Age {
  CHILDREN,
  ADULT,
  SENIOR
}

public class Admission {
  public void checkAdmission() {
    Visitors visitor = new Visitors("John", (byte) 25, 'M');
    visitor.setMember(false);
    if (visitor.isMember()) {
      System.out.println("Please proceed to the ticket counter.");
    } else {
      Age ageGroup = getAgeGroup(visitor.getAge());
      switch (ageGroup) {
        case CHILDREN:
          System.out.println("Entry fee is $10");
          break;
        case ADULT:
          System.out.println("Entry fee is $20");
          break;
        case SENIOR:
          System.out.println("Entry fee is $15");
          break;
        default: 
          System.out.println("Please enter a valid entry.");
          break;
      }
    }
  }
  
  private static Age getAgeGroup(byte age) {
    if (age < 18) {
      return Age.CHILDREN;
    } else if (age >= 18 && age < 60) {
      return Age.ADULT;
    } else {
      return Age.SENIOR;
    }
  }
}