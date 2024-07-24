package com.example.listviewexample;

public class PersonModel {

    final int images;
    final String name;
    final int age;

    public PersonModel(int images, String name, int age) {
        this.images = images;
        this.name = name;
        this.age = age;
    }

    public int getImages() {
        return images;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
