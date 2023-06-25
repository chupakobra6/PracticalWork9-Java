package com.example.practicalwork9;

public class Student {
    private String name;
    private String description;
    private int image;

    public Student(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
}