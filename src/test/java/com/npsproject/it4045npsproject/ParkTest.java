package com.npsproject.it4045npsproject;

import com.npsproject.it4045npsproject.model.Location;
import com.npsproject.it4045npsproject.model.Park;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class ParkTest {

    @Test
    public void testParkGettersAndSetters() {
        Park park = new Park();
        park.setName("Yellowstone");
        park.setLocation(new Location(44.4280, -110.5885));
        park.setActivities(Arrays.asList("Hiking", "Camping", "Wildlife Watching"));
        park.setStreetAddress("Some address");
        park.setHours("9 AM - 5 PM");

        assertThat(park.getName()).isEqualTo("Yellowstone");
        assertThat(park.getLocation().latitude()).isEqualTo(44.4280);
        assertThat(park.getLocation().longitude()).isEqualTo(-110.5885);
        assertThat(park.getActivities()).containsExactly("Hiking", "Camping", "Wildlife Watching");
        assertThat(park.getStreetAddress()).isEqualTo("Some address");
        assertThat(park.getHours()).isEqualTo("9 AM - 5 PM");
    }

    @Test
    public void testEqualsAndHashCode() {
        Park park1 = new Park();
        park1.setName("Yellowstone");

        Park park2 = new Park();
        park2.setName("Yellowstone");

        assertThat(park1).isEqualTo(park2);
        assertThat(park1.hashCode()).isEqualTo(park2.hashCode());

        // You can also test inequality
        Park park3 = new Park();
        park3.setName("Yosemite");
        assertThat(park1).isNotEqualTo(park3);
    }
}
