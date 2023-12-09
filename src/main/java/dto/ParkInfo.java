package dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.List;

@Data
public class ParkInfo {
    private String total;
    private String limit;
    private String start;
    private List<Park> data;
    private static class Park {
        public String id;
        public String url;
        public String fullName;
        public String parkCode;
        public String description;
        public String latitude;
        public String longitude;
        public String latLong;
        public List<Activity> activities;
        @JsonIgnore
        public List<Topic> topics;
        public String states;
        @JsonIgnore
        public Contacts contacts;
        @JsonIgnore
        public List<EntranceFee> entranceFees;
        @JsonIgnore
        public List<EntrancePass> entrancePasses;
        @JsonIgnore
        public List<Fee> fees;
        public String directionsInfo;
        public String directionsUrl;
        @JsonIgnore
        public List<OperatingHour> operatingHours;
        @JsonIgnore
        public List<Address> addresses;
        public List<Image> images;
        public String weatherInfo;
        public String name;
        public String designation;
        public double relevanceScore;
        public static class Activity {
            public String id;
            public String name;
        }
        public static class Topic {
            public String id;
            public String name;
        }

        public static class Image {
            public String credit;
            public String title;
            public String altText;
            public String caption;
            public String url;
        }
        private static class Address {
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
        private static class StandardHours {
            // Add properties as needed
        }
        private static class ExceptionHours {
            // Add properties as needed
        }
        private static class Exception {
            private ExceptionHours exceptionHours;
            private String startDate;
            private String name;
            private String endDate;
        }

        private static class OperatingHour {
            private List<Exception> exceptions;
            private String description;
            private StandardHours standardHours;
            private String name;
        }
        private static class Fee {
            // Add properties as needed
        }

        private static class EntrancePass {
            // Add properties as needed
        }
        private static class EntranceFee {
            // Add properties as needed
        }
        private static class EmailAddress {
            private String description;
            private String emailAddress;
        }
        private static class PhoneNumber {
            private String phoneNumber;
            private String description;
            private String extension;
            private String type;
        }
        private static class Contacts {
            private List<PhoneNumber> phoneNumbers;
            private List<EmailAddress> emailAddresses;
        }

    }
}
