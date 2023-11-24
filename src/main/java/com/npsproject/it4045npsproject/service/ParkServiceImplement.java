package com.npsproject.it4045npsproject.service;

import com.npsproject.it4045npsproject.dto.ParkDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npsproject.it4045npsproject.repository.ParkRepository;

import java.util.List;

@Service
public class ParkServiceImplement implements ParkService {

    @Autowired
    private ParkRepository parksRepo;

    public List<ParkDTO> getAllParks(String search) {
        return parksRepo.getBySearch(search);
    }

    //API: https://developer.nps.gov/api/v1/parks?api_key=Oy2F47WeNd2D39Gw4CrEKuRRk2gEWbQA6Zu6BOI5
}
