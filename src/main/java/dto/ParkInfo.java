package dto;

import lombok.Data;

import java.util.List;

@Data
public class ParkInfo {
    private String id;
    private String url;
    private String fullName;
    private String parkCode;
    private String description;
    private String latitude;
    private String longitude;
    private String latLong;
    private List<Activity> activities;
    private List<Topic> topics;
    private String states;
    private Contacts contacts;
    private List<EntranceFee> entranceFees;
    private List<EntrancePass> entrancePasses;
    private List<Fee> fees;
    private String directionsInfo;
    private String directionsUrl;
    private List<OperatingHour> operatingHours;
    private List<Address> addresses;
    private List<Image> images;
    private String weatherInfo;
    private String name;
    private String designation;
    private double relevanceScore;
    @Data
    public static class Activity {
        private String id;
        private String name;
    }
    @Data
    public static class Topic {
        private String id;
        private String name;
    }
    @Data
    public class Image {
        private String credit;
        private String title;
        private String altText;
        private String caption;
        private String url;
    }
    @Data
    public class Address {
        private String postalCode;
        private String city;
        private String stateCode;
        private String countryCode;
        private String provinceTerritoryCode;
        private String line1;
        private String type;
        private String line3;
        private String line2;
    }
    @Data
    public class StandardHours {
        // Add properties as needed
    }
    @Data
    public class ExceptionHours {
        // Add properties as needed
    }
    @Data
    public class Exception {
        private ExceptionHours exceptionHours;
        private String startDate;
        private String name;
        private String endDate;
    }

    @Data
    public class OperatingHour {
        private List<Exception> exceptions;
        private String description;
        private StandardHours standardHours;
        private String name;
    }
    @Data
    public class Fee {
        // Add properties as needed
    }

    @Data
    public class EntrancePass {
        // Add properties as needed
    }
    @Data
    public class EntranceFee {
        // Add properties as needed
    }
    @Data
    public class EmailAddress {
        private String description;
        private String emailAddress;
    }
    @Data
    public class PhoneNumber {
        private String phoneNumber;
        private String description;
        private String extension;
        private String type;
    }
    @Data
    public class Contacts {
        private List<PhoneNumber> phoneNumbers;
        private List<EmailAddress> emailAddresses;
    }

}