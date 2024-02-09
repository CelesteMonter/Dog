package com.example.dog;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField nameField = new TextField();
    @FXML
    TextField breedField = new TextField();
    @FXML
    TextField heightField = new TextField();
    @FXML
    TextField weightField = new TextField();
    @FXML
    TextField genderField = new TextField();
    @FXML
    TextField ageField = new TextField();

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

        textArea.setText(dog.name);
    }


}