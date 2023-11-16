package com.npsproject.it4045npsproject.service;

import com.npsproject.it4045npsproject.model.Park;
import org.springframework.stereotype.Service;

@Service
public class ParkService {

    public Park getParkDetails(String name) {
        // TODO: Logic to retrieve park details (e.g., from a database)
        return new Park();
    }
}
