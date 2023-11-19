package com.npsproject.it4045npsproject.model;

public record Location(double latitude, double longitude) {
    /**
     * Calculates the distance between two locations
     * @param firstLocation The first location
     * @param secondLocation The second location
     * @return The distance between the two locations in kilometers
     */
    public static double CompareDistance(Location firstLocation, Location secondLocation){
        return Math.acos(Math.sin(Math.toRadians(firstLocation.latitude))*Math.sin(Math.toRadians(secondLocation.latitude))
                + Math.cos(Math.toRadians(firstLocation.latitude))*Math.cos(Math.toRadians(secondLocation.latitude))
                *Math.cos(Math.toRadians(secondLocation.longitude) - Math.toRadians(firstLocation.longitude)))*6371;
    }
}
