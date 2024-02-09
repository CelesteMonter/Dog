package com.example.dog;

import javafx.beans.property.SimpleStringProperty;

public class Dog {
    public SimpleStringProperty name;
    public SimpleStringProperty breed;
    public SimpleStringProperty height;
    public SimpleStringProperty weight;
    // 0 female, 1 male
    public SimpleStringProperty gender;
    public SimpleStringProperty age;

    Dog(String name, String breed, String height, String weight, String gender, String age) {
        this.name = new SimpleStringProperty(name);
        this.breed = new SimpleStringProperty(breed);
        this.height = new SimpleStringProperty(height);
        this.weight = new SimpleStringProperty(weight);
        this.gender = new SimpleStringProperty(gender);
        this.age = new SimpleStringProperty(age);
    }

    String getName() {
        return name.get();
    }

    String getBreed() {
        return breed.get();
    }

    String getHeight() {
        return height.get();
    }

    String getWeight() {
        return weight.get();
    }

    String getGender() {
        return gender.get();
    }

    String getAge() {
        return age.get();
    }
}
