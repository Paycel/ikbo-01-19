package com.company;

public class Book {
    private String author, name;
    private int year, pages;

    public Book(String author, String name, int year, int pages) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book name: " + name + "\nAuthor: " + author +
                "\nYear: " + year + "\nPages: " + pages;
    }
}
