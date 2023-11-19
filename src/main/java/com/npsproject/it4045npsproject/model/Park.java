package com.npsproject.it4045npsproject.model;

import lombok.Data;

import java.util.List;

public @Data class Park {
    private String name;
    private Location location;
    private List<String> activities;
    private String streetAddress;
    private String city;
    private String state;
    private String country;
    private String hours;
}
