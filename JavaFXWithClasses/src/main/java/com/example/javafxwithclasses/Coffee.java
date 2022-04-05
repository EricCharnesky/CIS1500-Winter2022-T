package com.example.javafxwithclasses;

public class Coffee {

    private String size;
    private String milk;
    private double milkCost;
    private String sugar;
    private double milkServings;

    public Coffee() {
        size = "large";
        milk = "no milk";
        milkCost = 0;
        sugar = " with no sugar";
        milkServings = 0;
    }

    @Override
    public String toString(){
        return size + " coffee - " + (int)milkServings + " " + milk + " - " + sugar + " $" + getTotalCost();
    }

    public void setSizeToSmall(){
        size = "small";
    }

    public void setSizeToMedium(){
        size = "medium";
    }

    public void setSizeToLarge(){
        size = "large";
    }

    public double getTotalCost(){
        return getBaseCost() + milkCost;
    }

    public double getMilkCost() {
        return milkCost;
    }

    public void setNoMilk(){
        milk = "no milk";
        milkCost = 0;
        milkServings = 0;
    }

    public void addTwoPercentMilk(double servings){
        milk = "two percent milk";
        milkCost = 0;
        milkServings = servings;
    }

    public void addWholeMilk(double servings){
        milk = "whole milk";
        milkCost = 0;
        milkServings = servings;
    }

    public void addHalfAndHalfMilk(double servings){
        milk = "half and half";
        milkCost = 0;
        milkServings = servings;
    }

    public void addSoyMilk(double servings){
        milkCost = .5;
        milk = "Soy Milk";
        milkServings = servings;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public String getSize() {
        return size;
    }

    public double getBaseCost() {
        if ( size.equalsIgnoreCase("small")){
            return 1.49;
        }
        if ( size.equalsIgnoreCase("medium")){
            return 1.99;
        }
        else{
            return 2.49;
        }
    }

    public String getMilk() {
        return milk;
    }

    public String getSugar() {
        return sugar;
    }
}
