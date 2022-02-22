
package lab6;

public class TalkingStuffedAnimal {
    private String name;
    private String color;
    private String noiseToMake;
    private boolean batteryHasPower;

    public TalkingStuffedAnimal(String name, String color, String noiseToMake) {
        this.name = name;
        this.color = color;
        this.noiseToMake = noiseToMake;
        batteryHasPower = true;
    }    
    
    public String squeeze(){
        if ((int)( Math.random()*10 + 1) == 1 ){
            batteryHasPower = false;
        }
        if ( batteryHasPower ){
            return noiseToMake;
        }
        return ""; // else is redundant 
    }
    
    public void changeBattery(){
        batteryHasPower = true;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public boolean doesBatteryHasPower() {
        return batteryHasPower;
    }
    
    
}
