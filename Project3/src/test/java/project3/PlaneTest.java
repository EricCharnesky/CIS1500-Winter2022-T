package project3;

import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {

    @org.junit.jupiter.api.Test
    void constructor() {
        // Arrange
        String expectedMake = "make";
        String expectedModel = "model";
        String expectedNumber = "number";
        int expectedMaxAltitudeInMeters = 1000;
        int expectedCurrentAltitudeInMeters = 0;

        // Act
        Plane plane = new Plane(expectedMake, expectedModel, expectedNumber, expectedMaxAltitudeInMeters);
        String actualMake = plane.getMake();
        String actualModel = plane.getModel();
        String actualNumber = plane.getNumber();
        int actualMaxAltitudeInMeters = plane.getMaxAltitudeInMeters();
        int actualCurrentAltitudeInMeters = plane.getCurrentAltitudeInMeters();
        boolean actualLandingGearEnabled = plane.isLandingGearEnabled();

        // Assert
        assertEquals(expectedMake, actualMake);
        assertEquals(expectedModel, actualModel);
        assertEquals(expectedNumber, actualNumber);
        assertEquals(expectedMaxAltitudeInMeters, actualMaxAltitudeInMeters);
        assertEquals(expectedCurrentAltitudeInMeters, actualCurrentAltitudeInMeters);
        assertTrue(actualLandingGearEnabled);
    }

    @org.junit.jupiter.api.Test
    void enabledLandingGear() {
        // Arrange
        Plane plane = new Plane("", "", "", 1000);

        // Act
        plane.enabledLandingGear();

        // Assert
        assertTrue(plane.isLandingGearEnabled());
    }

    @org.junit.jupiter.api.Test
    void disableLandingGear() {
        // Arrange
        Plane plane = new Plane("", "", "", 1000);
        plane.changeAltitude(100);

        // Act
        plane.disableLandingGear();

        // Assert
        assertFalse(plane.isLandingGearEnabled());
    }

    @org.junit.jupiter.api.Test
    void changeAltitudeReturnsFalseGoingAbove100WithoutLandingGearDisabled() {
        // Arrange
        Plane plane = new Plane("", "", "", 1000);
        int expectedCurrentAltitudeInMeters = 100;

        // Act
        boolean result = plane.changeAltitude(200);
        int actualCurrentAltitudeInMeters = plane.getCurrentAltitudeInMeters();

        // Assert
        assertFalse(result);
        assertEquals(expectedCurrentAltitudeInMeters, actualCurrentAltitudeInMeters);

    }

    @org.junit.jupiter.api.Test
    void changeAltitudeReturnsFalseGoingAboveMaxAltitude() {
        // Arrange
        int maxAltitudeInMeters = 1000;
        Plane plane = new Plane("", "", "", maxAltitudeInMeters);
        int expectedCurrentAltitudeInMeters = maxAltitudeInMeters;
        plane.changeAltitude(100);
        plane.disableLandingGear();

        // Act
        boolean result = plane.changeAltitude(maxAltitudeInMeters);
        int actualCurrentAltitudeInMeters = plane.getCurrentAltitudeInMeters();

        // Assert
        assertFalse(result);
        assertEquals(expectedCurrentAltitudeInMeters, actualCurrentAltitudeInMeters);

    }

    @org.junit.jupiter.api.Test
    void changeAltitudeSuccessfulGoingUp() {
        // Arrange
        Plane plane = new Plane("", "", "", 1000);
        int expectedCurrentAltitudeInMeters = 50;

        // Act
        boolean result = plane.changeAltitude(expectedCurrentAltitudeInMeters);
        int actualCurrentAltitudeInMeters = plane.getCurrentAltitudeInMeters();

        // Assert
        assertTrue(result);
        assertEquals(expectedCurrentAltitudeInMeters, actualCurrentAltitudeInMeters);

    }

    @org.junit.jupiter.api.Test
    void changeAltitudeSuccessfulGoingDown() {
        // Arrange
        Plane plane = new Plane("", "", "", 1000);
        int expectedCurrentAltitudeInMeters = 50;
        plane.changeAltitude(100);

        // Act
        boolean result = plane.changeAltitude(-50);
        int actualCurrentAltitudeInMeters = plane.getCurrentAltitudeInMeters();

        // Assert
        assertTrue(result);
        assertEquals(expectedCurrentAltitudeInMeters, actualCurrentAltitudeInMeters);

    }

    @org.junit.jupiter.api.Test
    void changeAltitudeReturnsFalseGoingBelow0() {
        // Arrange
        Plane plane = new Plane("", "", "", 1000);
        int expectedCurrentAltitudeInMeters = 0;

        // Act
        boolean result = plane.changeAltitude(-50);
        int actualCurrentAltitudeInMeters = plane.getCurrentAltitudeInMeters();

        // Assert
        assertFalse(result);
        assertEquals(expectedCurrentAltitudeInMeters, actualCurrentAltitudeInMeters);

    }

    @org.junit.jupiter.api.Test
    void changeAltitudeReturnsFalseGoingBelow100WithoutLandingGearEnabled() {
        // Arrange
        Plane plane = new Plane("", "", "", 1000);
        int expectedCurrentAltitudeInMeters = 100;
        plane.changeAltitude(100);
        plane.disableLandingGear();

        // Act
        boolean result = plane.changeAltitude(-50);
        int actualCurrentAltitudeInMeters = plane.getCurrentAltitudeInMeters();

        // Assert
        assertFalse(result);
        assertEquals(expectedCurrentAltitudeInMeters, actualCurrentAltitudeInMeters);

    }
}