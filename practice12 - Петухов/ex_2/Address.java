package com.company;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String corpus;
    private String room;

    public Address(String address) {
        StringTokenizer tokens = new StringTokenizer(address, ",.;-");
        String[] result = address.split(", ");
        if (result.length == 1) {
            result = new String[7];
            for (int i = 0; i < 7 && tokens.hasMoreTokens(); i++) {
                String result_ = tokens.nextToken();
                result[i] = result_.contains(" ") ? result_.substring(1) : result_;
            }
            initialize(result);
        } else initialize(result);
        System.out.println(this);
    }

    private void initialize(String[] result){
        country = result[0];
        region = result[1];
        city = result[2];
        street = result[3];
        house = result[4];
        corpus = result[5];
        room = result[6];
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", corpus='" + corpus + '\'' +
                ", room='" + room + '\'' +
                '}';
    }
}
