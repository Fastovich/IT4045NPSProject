package com.npsproject.it4045npsproject.service;

import com.npsproject.it4045npsproject.dto.ParkSearchRequest;
import com.npsproject.it4045npsproject.dto.ParkSearchResult;
import org.springframework.stereotype.Service;

@Service
public class ParkSearchService {

    public ParkSearchResult searchParks(ParkSearchRequest request) {
        // TODO: Logic to search for parks based on the request
        return new ParkSearchResult();
    }
}
