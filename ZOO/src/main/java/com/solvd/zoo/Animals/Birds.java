package main.java.com.solvd.zoo.Animals;
public class Birds {
    /* 
    private String birdName;
    private String geographicRange;
    private byte age;
    */
    private String exhibitionName;
/* 
    public String getGeographicRange() {
        return geographicRange;
    }

    public void setGeographicRange(String geographicRange) {
        this.geographicRange = geographicRange;
    }

    public String getExhibitionName() {
        return exhibitionName;
    }
*/
    public void setExhibitionName(String exhibitionName) {
        this.exhibitionName = exhibitionName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getBirdName() {
        return birdName;
    }

    public void setBirdName(String birdName) {
        this.birdName = birdName;
    }

    public Birds(){
    }

    public Birds(String birdName, String geographicRange, byte age, String exhibitionName) {
        /* 
        this.birdName = birdName;
        this.geographicRange = geographicRange;
        this.age = age;
        */
        this.exhibitionName = exhibitionName;
    }

}