package main.java.com.solvd.zoo.Animals;

public class Reptiles {
  private String name;
  private byte totalReptiles;

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public int getTotalReptiles() {
      return totalReptiles;
  }

  public void setTotalReptiles(int totalReptiles) {
      this.totalReptiles = (byte) totalReptiles;
  }
}
