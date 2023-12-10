package com.npsproject.it4045npsproject;

import dto.ParkDTO;
import model.Location;
import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class 	It4045NpsProjectApplicationTests {

	@Autowired
	private ApplicationContext context;

	@Test
	void contextLoads() {
		assertThat(context).isNotNull();
	}

	@Test
	public void testParkGettersAndSetters() {



		ParkDTO park = new ParkDTO();
		park.setFullName("Yellowstone");
		park.setLatitude(44.4280);
		park.setLongitude(-110.5885);


		assertThat(park.getFullName()).isEqualTo("Yellowstone");
		assertThat(park.getLatitude()).isEqualTo(44.4280);
		assertThat(park.getLongitude()).isEqualTo(-110.5885);

	}

	@Test
	public void testEqualsAndHashCode() {
		ParkDTO park1 = new ParkDTO();
		park1.setName("Yellowstone");

		ParkDTO park2 = new ParkDTO();
		park2.setName("Yellowstone");

		assertThat(park1).isEqualTo(park2);
		assertThat(park1.hashCode()).isEqualTo(park2.hashCode());

		// You can also test inequality
		ParkDTO park3 = new ParkDTO();
		park3.setName("Yosemite");
		assertThat(park1).isNotEqualTo(park3);
	}

	@Test
	public void testParkSearchRequestGettersAndSetters() {
		ParkDTO request = new ParkDTO();
		request.setFullName("Yellowstone");

		assertThat(request.getFullName()).isEqualTo("Yellowstone");
	}

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

