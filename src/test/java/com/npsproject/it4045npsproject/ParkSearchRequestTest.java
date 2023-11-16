package com.npsproject.it4045npsproject;

import com.npsproject.it4045npsproject.dto.ParkSearchRequest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ParkSearchRequestTest {

    @Test
    public void testParkSearchRequestGettersAndSetters() {
        ParkSearchRequest request = new ParkSearchRequest();
        request.setLocation("Wyoming, USA");

        assertThat(request.getLocation()).isEqualTo("Wyoming, USA");
    }
}
