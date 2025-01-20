package com.test.lsy.swaggertest.user.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    private String id;
    private String name;
    private String username;
    private String email;

    private Address address;
    private Company company;
    private Role role;

    private String phone;
    private String website;

    @Data
    @NoArgsConstructor @AllArgsConstructor
    @Builder
    public static class Address {
        private String street;
        private String suite;
        private String city;
        private String zipcode;
        private Geo geo;

        @Data
        @NoArgsConstructor @AllArgsConstructor
        @Builder
        public static class Geo {
            private String lat;
            private String lng;
        }
    }

    @Data
    @NoArgsConstructor @AllArgsConstructor
    @Builder
    public static class Company {
        private String name;
        private String catchPhrase;
        private String bs;
    }

    @Data
    @NoArgsConstructor @AllArgsConstructor
    @Builder
    public static class Role {
        private String roleName;
        private List<String> permissions;
    }
}
