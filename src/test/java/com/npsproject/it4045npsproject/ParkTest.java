package com.npsproject.it4045npsproject;

import com.npsproject.it4045npsproject.dto.ParkDTO;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class ParkTest {

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

}
