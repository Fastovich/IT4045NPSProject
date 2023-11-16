package com.npsproject.it4045npsproject;

import com.npsproject.it4045npsproject.dto.Park;
import com.npsproject.it4045npsproject.dto.ParkSearchResult;
import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ParkSearchResultTest {

    @Test
    public void testParkSearchResultGettersAndSetters() {
        ParkSearchResult result = new ParkSearchResult();
        Park park = new Park();
        park.setName("Yellowstone");
        result.setParks(List.of(park));

        assertThat(result.getParks()).containsExactly(park);
    }
}
