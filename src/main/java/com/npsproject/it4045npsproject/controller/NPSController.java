package com.npsproject.it4045npsproject.controller;

import com.npsproject.it4045npsproject.Parser.ParkParser;

import java.util.List;

import com.npsproject.it4045npsproject.dto.ParkDTO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api")
public class NPSController {

//	@RequestMapping(value = "/home", method = RequestMethod.GET)
//	public String getHomeHandler() {
//		return "Welcome to home page";
//	}

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

}