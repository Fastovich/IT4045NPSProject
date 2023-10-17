package com.npsproject.it4045npsproject.dao;

import com.npsproject.it4045npsproject.dto.Park;

import java.util.List;

/**
 * Interface containing methods for DB operations for parks
 */
public interface IParkDAO {
    /**
     * Save a park
     * @param park - new park to be saved
     * @return - newly saved park
     */
    Park save(Park park);

    /**
     * Delete a park
     * @param park - park to be deleted
     */
    void delete(Park park);

    /**
     * Find a park with a given ID
     * @param id - ID of a park
     * @return - park
     */
    Park findParkById(int id);

    /**
     * Find a park in a specific location
     * @param location - location
     * @return - park
     */
    Park findParkByLocation(String location);

    /**
     * Add a favorite park
     * @param park - park to be added as a favorite
     */
    void saveFavoritePark(Park park);

    /**
     * Return list of parks with the same activity
     * @param activity - activity
     * @return - list of parks
     */
    List<Park> findParksByActivity(String activity);
}
