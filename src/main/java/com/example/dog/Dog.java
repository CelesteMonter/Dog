package com.example.dog;

public class Dog {
    public String name;
    public String breed;
    public Double height;
    public Double weight;
    // 0 female, 1 male
    public Integer gender;
    public Integer age;

    Dog(String name, String breed, Double height, Double weight, Integer gender, Integer age) {
        this.name = name;
        this.breed = breed;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
    }

    String getName() {
        return name;
    }

    String getBreed() {
        return breed;
    }

    String getHeight() {
        return height.toString();
    }

    String getWeight() {
        return weight.toString();
    }

    String getGender() {
        if (gender == 0) {
            return "Female";
        } else {
            return "Male";
        }
    }

    String getAge() {
        return age.toString();
    }
}
