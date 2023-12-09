package com.npsproject.it4045npsproject.service;

import dto.ParkDTO;
import repository.ParkRepository;


import java.util.List;


public class ParkServiceImplement extends ParkService {


    private ParkRepository parksRepo;

    public List<ParkDTO> getAllParks(String search) {
        return parksRepo.getBySearch(search);
    }

    //API: https://developer.nps.gov/api/v1/parks?api_key=Oy2F47WeNd2D39Gw4CrEKuRRk2gEWbQA6Zu6BOI5
}
