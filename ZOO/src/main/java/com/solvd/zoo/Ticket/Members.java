package main.java.com.solvd.zoo.Ticket;

public abstract class Members {
  private String name;
  private int age;
  private char sex;
  private boolean isMember;

  public Members() {
  }

  public Members(String name, int age, char sex, boolean isMember) {
    this.name = name;
    this.age = age;
    this.sex = sex;
    this.isMember = isMember;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public char getSex() {
    return sex;
  }

  public void setSex(char sex) {
    this.sex = sex;
  }

  public boolean isMember() {
    return isMember;
  }

  public void setMember(boolean isMember) {
    this.isMember = isMember;
  }
  @Override
  public String toString() {
    return "Name: " + name + ", Age: " + age + ", Sex: " + sex + ", Member: " + isMember;
  }

}