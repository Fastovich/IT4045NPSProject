package com.npsproject.it4045npsproject;

import dto.ParkDTO;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ParkSearchRequestTest {

    @Test
    public void testParkSearchRequestGettersAndSetters() {
        ParkDTO request = new ParkDTO();
        request.setFullName("Yellowstone");

        assertThat(request.getFullName()).isEqualTo("Yellowstone");
    }
}
