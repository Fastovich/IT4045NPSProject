package com.npsproject.it4045npsproject;

import com.npsproject.it4045npsproject.dto.ParkDTO;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ParkSearchRequestTest {

    @Test
    public void testParkSearchRequestGettersAndSetters() {
        ParkDTO request = new ParkDTO();
        request.setFullName("Yellowstone");

        assertThat(request.getFullName()).isEqualTo("Wyoming, USA");
    }
}
