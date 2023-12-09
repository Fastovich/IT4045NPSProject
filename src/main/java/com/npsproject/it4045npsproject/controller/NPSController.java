package com.npsproject.it4045npsproject.controller;

import Parser.ParkParser;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.ParkDTO;
import dto.ParkInfo;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import com.npsproject.it4045npsproject.service.ParkInfoService;


@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api")

public class NPSController {

    @GetMapping(value="/parks")
    private List<ParkDTO> getParks() {
        String uri = "https://developer.nps.gov/api/v1/parks?limit=500&api_key=Oy2F47WeNd2D39Gw4CrEKuRRk2gEWbQA6Zu6BOI5";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        List<ParkDTO> all = ParkParser.retrieveParks(result);
        return all;
    }

    @GetMapping(value="/{search}")
    private List<ParkDTO> searchParks(@PathVariable("search") String search) {

        return null;

    }

    @GetMapping("/performSearch")
    public String performSearch(@RequestParam("query") String query, Model model) {
        // Here, you can perform the actual search based on the query
        // For simplicity, let's assume you have a list of items to display
        List<String> searchResults = Arrays.asList("Result 1", "Result 2", "Result 3");

        model.addAttribute("searchResults", searchResults);

        return "search";
    }


    @GetMapping("/search-for-parks")
    public ParkInfo searchForParks(@RequestParam String query,@RequestParam String limit) {
        String apiKey = "Oy2F47WeNd2D39Gw4CrEKuRRk2gEWbQA6Zu6BOI5";
        String uri = "https://developer.nps.gov/api/v1/parks?q=" + query + "&limit=" + limit + "&api_key=" + apiKey;

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        // Here, you can further process the result, parse JSON, and return the desired information
        ObjectMapper objectMapper = new ObjectMapper();
        ParkInfo parkInfoList = null;
        try {
            parkInfoList = objectMapper.readValue(result, new TypeReference<ParkInfo>() {});
        } catch (JsonProcessingException e) {
            e.printStackTrace(); // Handle or log the exception as needed
        }
        return parkInfoList;
    }


    // TODO: Add more endpoints
}