package com.company;

public class LabClass {
    private LabClassUI classUI;

    public LabClass() {
        this.classUI = new LabClassDriver();
    }

    public LabClassUI getClassUI() {
        return classUI;
    }
}
