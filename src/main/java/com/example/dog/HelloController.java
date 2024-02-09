package com.example.dog;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    public TextField nameField = new TextField();
    @FXML
    public TextField breedField = new TextField();
    @FXML
    public TextField heightField = new TextField();
    @FXML
    public TextField weightField = new TextField();
    @FXML
    public TextField genderField = new TextField();
    @FXML
    public TextField ageField = new TextField();

    @FXML
    TextArea textArea = new TextArea();


    @FXML
    protected void setDog() {
        Dog dog = new Dog(
                nameField.getText(),
                breedField.getText(),
                Double.parseDouble(heightField.getText()),
                Double.parseDouble(weightField.getText()),
                Integer.parseInt(genderField.getText()),
                Integer.parseInt(ageField.getText())
        );

        textArea.setText(
                "Nombre:" + dog.name + "\nRaza: " + dog.breed + "\nAltura:" + dog.height + "\nPeso:" + dog.weight + "\nGenero:" + dog.getGender() + "\nEdad:" + dog.age

        );
    }


}