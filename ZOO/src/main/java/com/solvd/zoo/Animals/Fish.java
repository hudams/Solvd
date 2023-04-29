package main.java.com.solvd.zoo.Animals;
public class Fish {
    private String fishName;
    private String geographicRange;
    private byte age;
    private String exhibitionName;

    public String getGeographicRange() {
        return geographicRange;
    }

    public void setGeographicRange(String geographicRange) {
        this.geographicRange = geographicRange;
    }

    public String getExhibitionName() {
        return exhibitionName;
    }

    public void setExhibitionName(String exhibitionName) {
        this.exhibitionName = exhibitionName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getFishName() {
        return fishName;
    }

    public void setFishName(String fishName) {
        this.fishName = fishName;
    }
}