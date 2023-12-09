package com.npsproject.it4045npsproject.controller;

import Parser.ParkParser;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.ParkDTO;
import dto.ParkInfo;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import com.npsproject.it4045npsproject.service.ParkInfoService;


@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api")

public class NPSController {

    @GetMapping(value = "/parks")
    private List<ParkDTO> getParks(@RequestParam(name = "query") String query) {
        if (query == null || query.isEmpty()) {
            throw new IllegalArgumentException("You must enter a Search Criteria");
        }

        String apiKey = "Oy2F47WeNd2D39Gw4CrEKuRRk2gEWbQA6Zu6BOI5";
        String uri = "https://developer.nps.gov/api/v1/activities/parks/q=" + query + "&limit=500&api_key=" + apiKey;

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        return ParkParser.retrieveParks(result);
    }

    @GetMapping("/search-parks")
    public ParkInfo searchParks(@RequestParam String query) {
        String apiKey = "Oy2F47WeNd2D39Gw4CrEKuRRk2gEWbQA6Zu6BOI5";
        String uri = "https://developer.nps.gov/api/v1/parks?q=" + query + "&limit=1&api_key=" + apiKey;

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

    private List<ParkDTO> getParksFromApi(String query) {
        // Modify this method to make the API call based on the provided activity
        String apiKey = "Oy2F47WeNd2D39Gw4CrEKuRRk2gEWbQA6Zu6BOI5";
        String uri = "https://developer.nps.gov/api/v1/activities/parks?q=" + query + "&api_key=" + apiKey;

        RestTemplate restTemplate = new RestTemplate();
        String result = "";
        try {
            result = restTemplate.getForObject(uri, String.class);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return ParkParser.retrieveParks(result);
    }


    // TODO: Add more endpoints
}