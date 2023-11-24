package com.npsproject.it4045npsproject.controller;

import com.npsproject.it4045npsproject.dto.ParkSearchRequest;
import com.npsproject.it4045npsproject.dto.ParkSearchResult;
import com.npsproject.it4045npsproject.model.Park;
import com.npsproject.it4045npsproject.service.ParkSearchService;
import com.npsproject.it4045npsproject.service.ParkService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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

    @GetMapping("/park/{name}")
    public Park getParkByName(@PathVariable String name) {
        return parkService.getParkDetails(name);
    }

    @GetMapping("/park")
    @ResponseBody
    public List<Park> searchParks() {
        //return parkService.getParks();
        return null;
    }

    // TODO: Add more endpoints
}