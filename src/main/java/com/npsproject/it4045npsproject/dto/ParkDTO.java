package com.npsproject.it4045npsproject.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class ParkDTO {
    private String url;

    @Id
    private String fullName;
    private String code; //"parkCode"
    private double latitude;
    private double longitude;
    private double latLong;
    private Object[] activities;
    private Object[] topics;
    private Object[] addresses;

    public ParkDTO (String url,
    String fullName,
    String code, //"parkCode"
    String latitude,
    String longitude,
    String latLong,
    Object[] activities,
    Object[] topics,
    String states,
    String directionsInfo,
    String directionsUrl,
    String name,
    String designation) {

        this.url = url;
        this.fullName = fullName;
        this.code = code;
        this.latitude = Double.parseDouble(latitude);
        this.longitude = Double.parseDouble(longitude);
        this.latLong = Double.parseDouble(latLong);
        this.activities = activities;
        this.topics = topics;
        this.states = states;

        this.directionsInfo = directionsInfo;
        this.directionsUrl = directionsUrl;
        this.name = name;
        this.designation = designation;
    }

    public ParkDTO() {
        this.url = url;
        this.fullName = fullName;
        this.code = code;
        this.latitude = Double.parseDouble(String.valueOf(latitude));
        this.longitude = Double.parseDouble(String.valueOf(longitude));
        this.latLong = Double.parseDouble(String.valueOf(latLong));
        this.activities = activities;
        this.topics = topics;
        this.states = states;

        this.directionsInfo = directionsInfo;
        this.directionsUrl = directionsUrl;
        this.name = name;
        this.designation = designation;
    }


    public String getUrl() {
        return url;
    }


    public void setUrl(String url) {
        this.url = url;
    }


    public String getFullName() {
        return fullName;
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public String getCode() {
        return code;
    }


    public void setCode(String code) {
        this.code = code;
    }


    public double getLatitude() {
        return latitude;
    }


    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }


    public double getLongitude() {
        return longitude;
    }


    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }


    public double getLatLong() {
        return latLong;
    }


    public void setLatLong(double latLong) {
        this.latLong = latLong;
    }



    public Object[] getActivities() {
        return activities;
    }


    public void setActivities(Object[] activities) {
        this.activities = activities;
    }


    public Object[] getTopics() {
        return topics;
    }


    public void setTopics(Object[] topics) {
        this.topics = topics;
    }

    public Object[] getAddresses() {return addresses;}

    public void setAddresses(Object[] addresses) {this.addresses = addresses;}


    public String getStates() {
        return states;
    }


    public void setStates(String states) {
        this.states = states;
    }


    public String getDirectionsInfo() {
        return directionsInfo;
    }


    public void setDirectionsInfo(String directionsInfo) {
        this.directionsInfo = directionsInfo;
    }


    public String getDirectionsUrl() {
        return directionsUrl;
    }


    public void setDirectionsUrl(String directionsUrl) {
        this.directionsUrl = directionsUrl;
    }


    public String getDesignation() {
        return designation;
    }


    public void setDesignation(String designation) {
        this.designation = designation;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    String states;

    String directionsInfo;
    String directionsUrl;
    String designation;
    String name;

}
