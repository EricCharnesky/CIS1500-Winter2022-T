package com.example.javafxwithclasses;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;

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
    @FXML
    private Slider milkServingSlider;
    @FXML
    private CheckBox sugarCheckBox;
    @FXML
    private CheckBox sugarFreeSugarCheckBox;

    private ArrayList<Coffee> order;
    @FXML
    private Label currentDrinkLabel;

    // essentially the constructor, but runs AFTER fxml stuff is setup
    public void initialize() {
        coffee = new Coffee();
        order = new ArrayList<>();
        updateCoffeeReceipt();
    }

    public void updateCoffeeReceipt() {
        currentDrinkLabel.setText(coffee.toString());

        String receipt = "Drinks in Order:\n";
        double grandTotal = 0;
        int drinkCount = 1;
        for ( Coffee coffeeInOrder : order ){
            receipt += "Drink #" + drinkCount + " " + coffeeInOrder.toString() + "\n";
            drinkCount++;
            grandTotal += coffeeInOrder.getTotalCost();
        }

        receipt += "Grand Total: $" + grandTotal;

        label.setText(receipt);
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
        updateMilk();
    }

    private void updateMilk() {
        if ( milkServingSlider.getValue() == 0 || noMilkRadioButton.isSelected() ){
            coffee.setNoMilk();
        } else if (twoPercentMilkRadioButton.isSelected()) {
            coffee.addTwoPercentMilk(milkServingSlider.getValue());
        } else if (wholeMilkRadioButton.isSelected()) {
            coffee.addWholeMilk(milkServingSlider.getValue());
        } else if (halfAndHalfRadioButton.isSelected()) {
            coffee.addHalfAndHalfMilk(milkServingSlider.getValue());
        } else if (soyMilkRadioButton.isSelected()) {
            coffee.addSoyMilk(milkServingSlider.getValue());
        }
        updateCoffeeReceipt();
    }

    @FXML
    public void milkSliderMouseReleased(Event event) {
        updateMilk();
    }

    @FXML
    public void sugarBoxChecked(ActionEvent actionEvent) {
        if ( sugarCheckBox.isSelected() || sugarFreeSugarCheckBox.isSelected()){
            String sugar = "";
            if ( sugarCheckBox.isSelected() ){
                sugar += " with sugar";
            }
            if ( sugarFreeSugarCheckBox.isSelected()){
                sugar += " with sugar free 'sugar'";
            }
            coffee.setSugar(sugar);
        } else{
            coffee.setSugar(" with no sugar");
        }
        updateCoffeeReceipt();
    }

    @FXML
    public void addCoffeeToOrderButtonClicked(ActionEvent actionEvent) {
        order.add(coffee);
        coffee = new Coffee();
        sugarCheckBox.setSelected(false);
        sugarFreeSugarCheckBox.setSelected(false);
        largeRadioButton.setSelected(true);
        noMilkRadioButton.setSelected(true);
        updateCoffeeReceipt();
    }
}