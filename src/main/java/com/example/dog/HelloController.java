package com.example.dog;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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
    ObservableList<Dog> dogs = FXCollections.observableArrayList();

    @FXML
    TableView<Dog> tableView = new TableView<>();

    // table columns
    @FXML
    private TableColumn<Dog, String> nameColumn;
    @FXML
    private TableColumn<Dog, String> breedColumn;
    @FXML
    private TableColumn<Dog, String> heightColumn;
    @FXML
    private TableColumn<Dog, String> weightColumn;
    @FXML
    private TableColumn<Dog, String> genderColumn;
    @FXML
    private TableColumn<Dog, String> ageColumn;

    @FXML
    private void initialize() {
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().name);
        breedColumn.setCellValueFactory(cellData -> cellData.getValue().breed);
        heightColumn.setCellValueFactory(cellData -> cellData.getValue().height);
        weightColumn.setCellValueFactory(cellData -> cellData.getValue().weight);
        genderColumn.setCellValueFactory(cellData -> cellData.getValue().gender);
        ageColumn.setCellValueFactory(cellData -> cellData.getValue().age);
    }


    @FXML
    protected void setDog() {
        Dog newDog = new Dog(
                nameField.getText(),
                breedField.getText(),
                heightField.getText(),
                weightField.getText(),
                genderField.getText(),
                ageField.getText()
        );
        dogs.add(newDog);
        getDogs();
    }

    //get dogs
    @FXML
    protected void getDogs() {
        // Print the message in the console
        System.out.println("Getting dogs " + dogs.size());

        tableView.setItems(dogs);
    }

}