package main.java.com.solvd.zoo.Main;
import main.java.com.solvd.zoo.VisitorsInfo.Map;
import main.java.com.solvd.zoo.VisitorsInfo.Visitors;

public class Main {
  public static void main(String[] args) {
  Map map = new Map("Reptiles\n", "Go up to Bird exhibit and take a left\n", "Moderate");
  Visitors visitors = new Visitors("John", 25, 'M', 5.64, false);
  System.out.println(visitors);
  System.out.println("To get to: ");
  System.out.println(map.printMapInfo());
  }
}
