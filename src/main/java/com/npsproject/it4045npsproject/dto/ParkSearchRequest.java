package com.npsproject.it4045npsproject.DTO;

import com.npsproject.it4045npsproject.model.Location;
import lombok.Data;

import java.util.List;

public @Data class ParkSearchRequest {
    private String name;
    private Location location;
    private List<String> activities;
    private String streetAddress;
    private String city;
    private String state;
    private String country;
    private String hours;
}
