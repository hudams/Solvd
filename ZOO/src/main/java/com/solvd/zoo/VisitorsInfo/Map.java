package main.java.com.solvd.zoo.VisitorsInfo;

public class Map {
  private String section;
  private String directions;
  private String traffic;

  public Map() {
  }

  public Map(String section, String directions, String traffic) {
    this.section = section;
    this.directions = directions;
    this.traffic = traffic;
  }

  public String getSection() {
    return section;
  }

  public void setSection(String section) {
    this.section = section;
  }

  public String getDirections() {
    return directions;
  }

  public void setDirections(String directions) {
    this.directions = directions;
  }

  public String getTraffic() {
    return traffic;
  }

  public void setTraffic(String traffic) {
    this.traffic = traffic;
  }

  public String printMapInfo() {
    return "Section: " + section + "Directions: " + directions + "Traffic: " + traffic;
    
  }
}
