package main.java.com.solvd.zoo.VisitorsInfo;

public class Visitors {
  private String name;
  private byte age;
  private char gender;
  private boolean isMember;

  public Visitors() {
    super();
  }

  public Visitors(String name, byte age, char gender) {
    super();
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public byte getAge() {
    return age;
  }

  public void setAge(byte age) {
    this.age = age;
  }

  public char getGender() {
    return gender;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  public boolean isMember() {
    return isMember;
  }

  public void setMember(boolean isMember) {
    this.isMember = isMember;
  }
}


