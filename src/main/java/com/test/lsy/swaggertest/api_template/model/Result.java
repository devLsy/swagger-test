package com.test.lsy.swaggertest.api_template.model;

import lombok.*;

@Data
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Result {

    private String gender;
    private Name name;
    private Location location;
    private String email;
    private String phone;
    private String cell;
    private String nat;

    @Data
    @AllArgsConstructor @NoArgsConstructor
    @Builder
    public static class Name {
        private String title;
        private String first;
        private String last;
    }

    @Data
    @AllArgsConstructor @NoArgsConstructor
    @Builder
    public static class Location {
        private Street street;
        private String city;
        private String state;
        private String country;
        private String postcode;

        @Data
        @AllArgsConstructor @NoArgsConstructor
        @Builder
        public static class Street {
            private String number;
            private String name;
        }

        @Data
        @AllArgsConstructor @NoArgsConstructor
        @Builder
        public static class Coordinates {
            private String latitude;
            private String longitude;
        }

        @Data
        @AllArgsConstructor @NoArgsConstructor
        @Builder
        public static class timezone {
            private String offset;
            private String description;
        }
    }

    @Data
    @AllArgsConstructor @NoArgsConstructor
    @Builder
    public static class Login {
        private String uuid;
        private String username;
        private String password;
        private String salt;
        private String md5;
        private String sha1;
        private String sha256;
    }

    @Data
    @AllArgsConstructor @NoArgsConstructor
    @Builder
    public static class Dob {
        private String date;
        private int age;
    }

    @Data
    @AllArgsConstructor @NoArgsConstructor
    @Builder
    public static class Registered {
        private String date;
        private int age;
    }

    @Data
    @AllArgsConstructor @NoArgsConstructor
    @Builder
    public static class Id {
        private String name;
        private String value;
    }

    @Data
    @AllArgsConstructor @NoArgsConstructor
    @Builder
    public static class Picture {
        private String large;
        private String medium;
        private String thumbnail;
    }
}
