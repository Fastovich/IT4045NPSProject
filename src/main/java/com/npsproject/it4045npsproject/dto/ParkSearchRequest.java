package com.npsproject.it4045npsproject.dto;

import lombok.Data;

import java.util.List;

public @Data class ParkSearchRequest {
    private String name;
    private float latitude;
    private float longitude;
    private List<String> activities;
    private String address;
}
