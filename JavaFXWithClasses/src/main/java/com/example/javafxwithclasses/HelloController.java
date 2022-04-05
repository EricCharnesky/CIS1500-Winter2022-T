package com.example.javafxwithclasses;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {

    @FXML
    private Button button;
    @FXML
    private Label label;
    @FXML
    private RadioButton mediumRadioButton;
    @FXML
    private ToggleGroup size;
    @FXML
    private RadioButton largeRadioButton;
    @FXML
    private RadioButton smallRadioButton;

    private Coffee coffee;
    @FXML
    private RadioButton soyMilkRadioButton;
    @FXML
    private RadioButton wholeMilkRadioButton;
    @FXML
    private RadioButton twoPercentMilkRadioButton;
    @FXML
    private RadioButton halfAndHalfRadioButton;
    @FXML
    private ToggleGroup milk;
    @FXML
    private RadioButton noMilkRadioButton;

    @Deprecated
    public void initialize() {
        coffee = new Coffee();
        updateCoffeeReceipt();
    }

    public void updateCoffeeReceipt() {
        label.setText(coffee.toString());
    }

    @FXML
    public void buttonClicked(ActionEvent actionEvent) {
        updateCoffeeReceipt();
    }

    @FXML
    public void sizeButtonClicked(ActionEvent actionEvent) {
        if (smallRadioButton.isSelected()) {
            coffee.setSizeToSmall();
        } else if (mediumRadioButton.isSelected()) {
            coffee.setSizeToMedium();
        } else if (largeRadioButton.isSelected()) {
            coffee.setSizeToLarge();
        }
        updateCoffeeReceipt();
    }

    @FXML
    public void milkBoxChecked(ActionEvent actionEvent) {
        if (twoPercentMilkRadioButton.isSelected()) {
            coffee.addTwoPercentMilk();
        } else if (wholeMilkRadioButton.isSelected()) {
            coffee.addWholeMilk();
        } else if (halfAndHalfRadioButton.isSelected()) {
            coffee.addHalfAndHalfMilk();
        } else if (soyMilkRadioButton.isSelected()) {
            coffee.addSoyMilk();
        } else if (noMilkRadioButton.isSelected()) {
            coffee.setNoMilk();
        }
        updateCoffeeReceipt();
    }
}