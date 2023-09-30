package com.npsproject.it4045npsproject.dto;

import lombok.Data;

import java.util.List;

public @Data class Park {
    private String name;
    private String location;
    private List<String> activities;
    private String address;
    private String hours;
}
