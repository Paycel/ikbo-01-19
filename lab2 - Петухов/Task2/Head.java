package com.company;

public class Head {
    private String colorEye, colorHair;

    public Head(String colorEye, String colorHair) {
        this.colorEye = colorEye;
        this.colorHair = colorHair;
    }

    public String getColorEye() {
        return colorEye;
    }

    public void setColorEye(String colorEye) {
        this.colorEye = colorEye;
    }

    public String getColorHair() {
        return colorHair;
    }

    public void setColorHair(String colorHair) {
        this.colorHair = colorHair;
    }

    @Override
    public String toString() {
        return "Color Eye: " + colorEye + "\nColor Hair: " + colorHair;
    }
}
