package com.npsproject.it4045npsproject;

import com.npsproject.it4045npsproject.model.Park;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class ParkTest {

    @Test
    public void testParkGettersAndSetters() {
        Park park = new Park();
        park.setName("Yellowstone");
        park.setLocation("Wyoming, USA");
        park.setActivities(Arrays.asList("Hiking", "Camping", "Wildlife Watching"));
        park.setAddress("Some address");
        park.setHours("9 AM - 5 PM");

        assertThat(park.getName()).isEqualTo("Yellowstone");
        assertThat(park.getLocation()).isEqualTo("Wyoming, USA");
        assertThat(park.getActivities()).containsExactly("Hiking", "Camping", "Wildlife Watching");
        assertThat(park.getAddress()).isEqualTo("Some address");
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
