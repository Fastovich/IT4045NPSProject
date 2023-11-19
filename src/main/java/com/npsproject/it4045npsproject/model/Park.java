package com.npsproject.it4045npsproject.model;

import lombok.Data;

import java.util.List;

public @Data class Park {
    private String name;
    private float latitude;
    private float longitude;
    private List<String> activities;
    private String address;
    private String hours;
}
