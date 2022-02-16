package chapter7classes;

public class Can {

    private int maximumVolumeInMililiters;
    private int currentVolumeInMililiters;
    private String beverage;

    // constructors are special don't have a return type
    // the name of the method matches the name of the class
    public Can() {
        maximumVolumeInMililiters = 0;
        currentVolumeInMililiters = 0;
        beverage = ""; // a better default than null
    }

    // the role of a constructor is to give all the attributes values
    public Can(int maximumVolumeInMililiters, int currentVolumeInMililiters, String beverage) {
        setMaximumVolumeInMililiters(maximumVolumeInMililiters);
        setCurrentVolumeInMililiters(currentVolumeInMililiters);
        setBeverage(beverage);
    }

    public void drink(int mililitersToDrink) {
        if (mililitersToDrink > 0) {
            currentVolumeInMililiters -= mililitersToDrink;
            if (currentVolumeInMililiters < 0) {
                currentVolumeInMililiters = 0;
            }
        }
    }

    public String getBeverage() {
        return beverage;
    }

    public void setBeverage(String beverage) {
        // this means the current instance
        this.beverage = beverage;
    }

    public int getMaximumVolumeInMililiters() {
        return maximumVolumeInMililiters;
    }

    public void setMaximumVolumeInMililiters(int maximumVolumeInMililiters) {
        if (maximumVolumeInMililiters < 0) {
            this.maximumVolumeInMililiters = 0;
        } else {
            this.maximumVolumeInMililiters = maximumVolumeInMililiters;
        }

    }

    public int getCurrentVolumeInMililiters() {
        return currentVolumeInMililiters;
    }

    public void setCurrentVolumeInMililiters(int currentVolumeInMililiters) {
        if (currentVolumeInMililiters < 0) {
            this.currentVolumeInMililiters = 0;
        } else if (currentVolumeInMililiters > maximumVolumeInMililiters) {
            this.currentVolumeInMililiters = maximumVolumeInMililiters;
        } else {
            this.currentVolumeInMililiters = currentVolumeInMililiters;
        }
    }
}
