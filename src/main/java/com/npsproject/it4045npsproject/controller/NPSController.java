package com.npsproject.it4045npsproject.controller;

import com.npsproject.it4045npsproject.dto.ParkSearchRequest;
import com.npsproject.it4045npsproject.dto.ParkSearchResult;
import com.npsproject.it4045npsproject.model.Park;
import com.npsproject.it4045npsproject.service.ParkSearchService;
import com.npsproject.it4045npsproject.service.ParkService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/parks")
public class NPSController {

    private final ParkService parkService;
    private final ParkSearchService parkSearchService;

    @Autowired
    public NPSController(ParkService parkService, ParkSearchService parkSearchService) {
        this.parkService = parkService;
        this.parkSearchService = parkSearchService;
    }

    @GetMapping("/{name}")
    public Park getParkByName(@PathVariable String name) {
        return parkService.getParkDetails(name);
    }

    @PostMapping("/search")
    public ParkSearchResult searchParks(@RequestBody ParkSearchRequest request) {
        return parkSearchService.searchParks(request);
    }

    // TODO: Add more endpoints
}