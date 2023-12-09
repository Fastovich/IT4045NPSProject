package com.npsproject.it4045npsproject.controller;

import com.npsproject.it4045npsproject.dto.ParkSearchRequest;
import com.npsproject.it4045npsproject.dto.ParkSearchResult;
import com.npsproject.it4045npsproject.model.Park;
import com.npsproject.it4045npsproject.service.ParkSearchService;
import com.npsproject.it4045npsproject.service.ParkService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

@Controller
//@RequestMapping("/parks")
public class NPSController {

    private final ParkService parkService;
    private final ParkSearchService parkSearchService;

    @RequestMapping("/")
    public String index(Model model) {
        return "start";
    }


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

    @GetMapping("/performSearch")
    public String performSearch(@RequestParam("query") String query, Model model) {
        // Here, you can perform the actual search based on the query
        // For simplicity, let's assume you have a list of items to display
        List<String> searchResults = Arrays.asList("Result 1", "Result 2", "Result 3");

        model.addAttribute("searchResults", searchResults);

        return "search";
    }

    // TODO: Add more endpoints
}