package com.company;

public class Shirt {
    private String series;
    private String type;
    private String color;
    private String size;

    public Shirt(String shirt) {
        String[] result = shirt.split(",");
        series = result[0];
        type = result[1];
        color = result[2];
        size = result[3];
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "series='" + series + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
