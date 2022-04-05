package com.example.javafxwithclasses;

public class Coffee {

    private String size;
    private String milk;
    private double milkCost;
    private String sugar;

    public Coffee() {
        size = "large";
        milk = "no milk";
        milkCost = 0;
        sugar = "";
    }

    @Override
    public String toString(){
        return size + " coffee - Milk: " + milk + " - Sugar: " + sugar + " $" + getTotalCost();
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
    }

    public void addTwoPercentMilk(){
        milk = "two percent milk";
        milkCost = 0;
    }

    public void addWholeMilk(){
        milk = "whole milk";
        milkCost = 0;
    }

    public void addHalfAndHalfMilk(){
        milk = "half and half";
        milkCost = 0;
    }

    public void addSoyMilk(){
        milkCost = .5;
        milk = "Soy Milk";
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
