package main.java.com.solvd.zoo.Animals;
public class Mammals {
    private String mammalName;
    private String geographicRange;
    private byte age;
    private char sex;
    private String exhibitionName;

  public String getMammalName() {
        return mammalName;
    }

    public void setMammalName(String mammalName) {
        this.mammalName = mammalName;
    }

    public String getGeographicRange() {
        return geographicRange;
    }

    public void setGeographicRange(String geographicRange) {
        this.geographicRange = geographicRange;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getExhibitionName() {
        return exhibitionName;
    }

    public void setExhibitionName(String exhibitionName) {
        this.exhibitionName = exhibitionName;
    }
}