package com.company;

public class Address{
    private String cityName, streetName;
    private int zipCode, buildingNumber, apartmentNumber;
    private char buildingLetter;
    public Address EMPTY_ADDRESS;

    public String getCityName() {
        return cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public char getBuildingLetter() {
        return buildingLetter;
    }
}
