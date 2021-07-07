package com.goat.CalorieFruity.domain;

import org.springframework.stereotype.Component;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Component
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    private String name;
    private String foodGroup;
    private int calories;
    private double fat;
    private double protein;
    private double carbohydrate;
    private double sugars;
    private double fiber ;
    private int cholesterol;
    private double saturatedFats;

    public Food() {
    }

    public Food(String name, String foodGroup, int calories, double fat, double protein, double carbohydrate, double sugars, double fiber, int cholesterol, double saturatedFats) {
        this.name = name;
        this.foodGroup = foodGroup;
        this.calories = calories;
        this.fat = fat;
        this.protein = protein;
        this.carbohydrate = carbohydrate;
        this.sugars = sugars;
        this.fiber = fiber;
        this.cholesterol = cholesterol;
        this.saturatedFats = saturatedFats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoodGroup() {
        return foodGroup;
    }

    public void setFoodGroup(String foodGroup) {
        this.foodGroup = foodGroup;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(double carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public double getSugars() {
        return sugars;
    }

    public void setSugars(double sugars) {
        this.sugars = sugars;
    }

    public double getFiber() {
        return fiber;
    }

    public void setFiber(double fiber) {
        this.fiber = fiber;
    }

    public int getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(int cholesterol) {
        this.cholesterol = cholesterol;
    }

    public double getSaturatedFats() {
        return saturatedFats;
    }

    public void setSaturatedFats(double saturatedFats) {
        this.saturatedFats = saturatedFats;
    }

    @Override
    public String toString() {
        return "Food{" +
                ", name='" + name + '\'' +
                ", foodGroup='" + foodGroup + '\'' +
                ", calories=" + calories +
                ", fat=" + fat +
                ", protein=" + protein +
                ", carbohydrate=" + carbohydrate +
                ", sugars=" + sugars +
                ", fiber=" + fiber +
                ", cholesterol=" + cholesterol +
                ", saturatedFats=" + saturatedFats +
                '}';
    }
}
