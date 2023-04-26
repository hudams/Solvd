package main.java.com.solvd.zoo.Animals;
public class Mammals {
  private int totalMammals;
  private char sex;

  public char getGender() {
      return sex;
  }

  public void setGender(char gender) {
      this.sex = gender;
  }

  public int getTotalMammals() {
      return totalMammals;
  }

  public void setTotalMammals(int totalMammals) {
      this.totalMammals = totalMammals;
  }
}