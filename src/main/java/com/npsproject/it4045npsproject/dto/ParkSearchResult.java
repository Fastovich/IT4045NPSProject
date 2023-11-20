package com.npsproject.it4045npsproject.DTO;

import com.npsproject.it4045npsproject.model.Park;
import lombok.Data;

import java.util.List;

public @Data class ParkSearchResult {
    private List<com.npsproject.it4045npsproject.DTO.Park> parks;
}
