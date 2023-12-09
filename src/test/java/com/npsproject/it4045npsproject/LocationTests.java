package com.npsproject.it4045npsproject;

import model.Location;
import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LocationTests {
    Location location;
    Location compareLocation;

    @Test
    void createLocation_LocationReturnsCorrectLongitudeAndLatitude(){
        whenCreateLocationAtUniversityOfCincinnatiCoordinates();
        thenAssertCorrectLongitudeAndLatitudeForUniversityOfCincinnati();
    }

    private void whenCreateLocationAtUniversityOfCincinnatiCoordinates() {
        location = new Location(39.1329, -84.5150);
    }

    private void thenAssertCorrectLongitudeAndLatitudeForUniversityOfCincinnati() {
        assertThat(location.latitude()).isEqualTo(39.1329);
        assertThat(location.longitude()).isEqualTo(-84.5150);
    }

    @Test
    void compareLocations_CalculateDistanceCloseToCorrectDistance(){
        whenCreateLocationAtUniversityOfCincinnatiCoordinates();
        whenCreateLocationAtYellowstoneNationalParkCoordinates();
        thenAssertCorrectDistanceBetweenUniversityOfCincinnatiAndYellowstoneNationalPark();
    }

    private void whenCreateLocationAtYellowstoneNationalParkCoordinates() {
        compareLocation = new Location(44.4280, -110.5885);
    }

    private void thenAssertCorrectDistanceBetweenUniversityOfCincinnatiAndYellowstoneNationalPark() {
        assertThat(Location.CompareDistance(location, compareLocation)).isCloseTo(2229, Percentage.withPercentage(.5));
    }
}
