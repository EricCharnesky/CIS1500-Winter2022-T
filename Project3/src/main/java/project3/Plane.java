package project3;

public class Plane {

    private String make;
    private String model;
    private String number;
    private int maxAltitudeInMeters;
    private int currentAltitudeInMeters;
    private boolean landingGearEnabled;

    public Plane(String make, String model, String number, int maxAltitudeInMeters) {
        this.make = make;
        this.model = model;
        this.number = number;
        this.maxAltitudeInMeters = maxAltitudeInMeters;
        currentAltitudeInMeters = 0;
        landingGearEnabled = true;
    }

    public void enabledLandingGear(){
        if ( currentAltitudeInMeters <= 100 ){
            landingGearEnabled = true;
        }
    }

    public void disableLandingGear(){
        if ( currentAltitudeInMeters >= 100 ){
            landingGearEnabled = false;
        }
    }

    public boolean changeAltitude(int metersToChange){
        currentAltitudeInMeters += metersToChange;
        if ( metersToChange > 0 ) {
            if (currentAltitudeInMeters > 100 && landingGearEnabled) {
                currentAltitudeInMeters = 100;
                return false;
            }
            if (currentAltitudeInMeters > maxAltitudeInMeters) {
                currentAltitudeInMeters = maxAltitudeInMeters;
                return false;
            }
            return true;
        } else{
            if ( currentAltitudeInMeters < 100 && !landingGearEnabled ){
                currentAltitudeInMeters = 100;
                return false;
            }
            if ( currentAltitudeInMeters < 0 ){
                currentAltitudeInMeters = 0;
                return false;
            }
            return true;
        }

    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public int getMaxAltitudeInMeters() {
        return maxAltitudeInMeters;
    }

    public int getCurrentAltitudeInMeters() {
        return currentAltitudeInMeters;
    }

    public boolean isLandingGearEnabled() {
        return landingGearEnabled;
    }
}
