package main.java.com.solvd.zoo.Animals;
public class Fish {
    private byte fishCount;
    private String fishName;

    public String getFishName() {
        return fishName;
    }

    public void setFishName(String fishName) {
        this.fishName = fishName;
    }

    public int getFishCount() {
        return fishCount;
    }

    public void setFishCount(int fishCount) {
        this.fishCount = (byte) fishCount;
    }
}