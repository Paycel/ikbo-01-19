package com.company;

public class Person {
    private String name, fam, ot;

    public Person(String name, String fam, String ot) {
        this.name = name;
        this.fam = fam;
        this.ot = ot;
    }

    public String getFIO(){
        return new StringBuilder().append(Character.toUpperCase(fam.charAt(0))).append(fam.substring(1))
                .append(" ")
                .append((name != null && !name.isEmpty()) ? Character.toUpperCase(name.charAt(0)) : "N/A")
                .append(".")
                .append((ot != null && !ot.isEmpty()) ? Character.toUpperCase(ot.charAt(0)) : "N/A")
                .append(".").toString();
    }
}
